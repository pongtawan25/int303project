/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.jpa.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tan
 */
@Entity
@Table(name = "BESTSELL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bestsell.findAll", query = "SELECT b FROM Bestsell b")
    , @NamedQuery(name = "Bestsell.findByBestsellid", query = "SELECT b FROM Bestsell b WHERE b.bestsellid = :bestsellid")
    , @NamedQuery(name = "Bestsell.findByBestbrand", query = "SELECT b FROM Bestsell b WHERE b.bestbrand = :bestbrand")
    , @NamedQuery(name = "Bestsell.findByBestname", query = "SELECT b FROM Bestsell b WHERE b.bestname = :bestname")
    , @NamedQuery(name = "Bestsell.findByBestprice", query = "SELECT b FROM Bestsell b WHERE b.bestprice = :bestprice")})
public class Bestsell implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "BESTSELLID")
    private String bestsellid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "BESTBRAND")
    private String bestbrand;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "BESTNAME")
    private String bestname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "BESTPRICE")
    private int bestprice;

    public Bestsell() {
    }

    public Bestsell(String bestsellid) {
        this.bestsellid = bestsellid;
    }

    public Bestsell(String bestsellid, String bestbrand, String bestname, int bestprice) {
        this.bestsellid = bestsellid;
        this.bestbrand = bestbrand;
        this.bestname = bestname;
        this.bestprice = bestprice;
    }

    public String getBestsellid() {
        return bestsellid;
    }

    public void setBestsellid(String bestsellid) {
        this.bestsellid = bestsellid;
    }

    public String getBestbrand() {
        return bestbrand;
    }

    public void setBestbrand(String bestbrand) {
        this.bestbrand = bestbrand;
    }

    public String getBestname() {
        return bestname;
    }

    public void setBestname(String bestname) {
        this.bestname = bestname;
    }

    public int getBestprice() {
        return bestprice;
    }

    public void setBestprice(int bestprice) {
        this.bestprice = bestprice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bestsellid != null ? bestsellid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bestsell)) {
            return false;
        }
        Bestsell other = (Bestsell) object;
        if ((this.bestsellid == null && other.bestsellid != null) || (this.bestsellid != null && !this.bestsellid.equals(other.bestsellid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rss.jpa.model.Bestsell[ bestsellid=" + bestsellid + " ]";
    }
    
}
