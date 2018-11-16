/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.jpa.model.controller;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.UserTransaction;
import rss.jpa.model.Bestsell;
import rss.jpa.model.controller.exceptions.NonexistentEntityException;
import rss.jpa.model.controller.exceptions.PreexistingEntityException;
import rss.jpa.model.controller.exceptions.RollbackFailureException;

/**
 *
 * @author Tan
 */
public class BestsellJpaController implements Serializable {

    public BestsellJpaController(UserTransaction utx, EntityManagerFactory emf) {
        this.utx = utx;
        this.emf = emf;
    }
    private UserTransaction utx = null;
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Bestsell bestsell) throws PreexistingEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            em.persist(bestsell);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            if (findBestsell(bestsell.getBestsellid()) != null) {
                throw new PreexistingEntityException("Bestsell " + bestsell + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Bestsell bestsell) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            bestsell = em.merge(bestsell);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = bestsell.getBestsellid();
                if (findBestsell(id) == null) {
                    throw new NonexistentEntityException("The bestsell with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException, RollbackFailureException, Exception {
        EntityManager em = null;
        try {
            utx.begin();
            em = getEntityManager();
            Bestsell bestsell;
            try {
                bestsell = em.getReference(Bestsell.class, id);
                bestsell.getBestsellid();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The bestsell with id " + id + " no longer exists.", enfe);
            }
            em.remove(bestsell);
            utx.commit();
        } catch (Exception ex) {
            try {
                utx.rollback();
            } catch (Exception re) {
                throw new RollbackFailureException("An error occurred attempting to roll back the transaction.", re);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Bestsell> findBestsellEntities() {
        return findBestsellEntities(true, -1, -1);
    }

    public List<Bestsell> findBestsellEntities(int maxResults, int firstResult) {
        return findBestsellEntities(false, maxResults, firstResult);
    }

    private List<Bestsell> findBestsellEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Bestsell.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Bestsell findBestsell(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Bestsell.class, id);
        } finally {
            em.close();
        }
    }

    public int getBestsellCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Bestsell> rt = cq.from(Bestsell.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
