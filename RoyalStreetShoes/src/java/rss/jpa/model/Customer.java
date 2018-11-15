/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss.jpa.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tan
 */
@Entity
@Table(name = "CUSTOMER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c")
    , @NamedQuery(name = "Customer.findByCustomerid", query = "SELECT c FROM Customer c WHERE c.customerid = :customerid")
    , @NamedQuery(name = "Customer.findByCustomerpassword", query = "SELECT c FROM Customer c WHERE c.customerpassword = :customerpassword")
    , @NamedQuery(name = "Customer.findByCustomerfname", query = "SELECT c FROM Customer c WHERE c.customerfname = :customerfname")
    , @NamedQuery(name = "Customer.findByCustomerlname", query = "SELECT c FROM Customer c WHERE c.customerlname = :customerlname")
    , @NamedQuery(name = "Customer.findByCustomeraddress", query = "SELECT c FROM Customer c WHERE c.customeraddress = :customeraddress")
    , @NamedQuery(name = "Customer.findByCustomeremail", query = "SELECT c FROM Customer c WHERE c.customeremail = :customeremail")
    , @NamedQuery(name = "Customer.findByCustomerphone", query = "SELECT c FROM Customer c WHERE c.customerphone = :customerphone")
    , @NamedQuery(name = "Customer.findByCustomercreditcard", query = "SELECT c FROM Customer c WHERE c.customercreditcard = :customercreditcard")})
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CUSTOMERID")
    private String customerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CUSTOMERPASSWORD")
    private String customerpassword;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CUSTOMERFNAME")
    private String customerfname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CUSTOMERLNAME")
    private String customerlname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "CUSTOMERADDRESS")
    private String customeraddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CUSTOMEREMAIL")
    private String customeremail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMERPHONE")
    private int customerphone;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CUSTOMERCREDITCARD")
    private int customercreditcard;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerid")
    private List<History> historyList;

    public Customer() {
    }

    public Customer(String customerid) {
        this.customerid = customerid;
    }

    public Customer(String customerid, String customerpassword, String customerfname, String customerlname, String customeraddress, String customeremail, int customerphone, int customercreditcard) {
        this.customerid = customerid;
        this.customerpassword = customerpassword;
        this.customerfname = customerfname;
        this.customerlname = customerlname;
        this.customeraddress = customeraddress;
        this.customeremail = customeremail;
        this.customerphone = customerphone;
        this.customercreditcard = customercreditcard;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomerpassword() {
        return customerpassword;
    }

    public void setCustomerpassword(String customerpassword) {
        this.customerpassword = customerpassword;
    }

    public String getCustomerfname() {
        return customerfname;
    }

    public void setCustomerfname(String customerfname) {
        this.customerfname = customerfname;
    }

    public String getCustomerlname() {
        return customerlname;
    }

    public void setCustomerlname(String customerlname) {
        this.customerlname = customerlname;
    }

    public String getCustomeraddress() {
        return customeraddress;
    }

    public void setCustomeraddress(String customeraddress) {
        this.customeraddress = customeraddress;
    }

    public String getCustomeremail() {
        return customeremail;
    }

    public void setCustomeremail(String customeremail) {
        this.customeremail = customeremail;
    }

    public int getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(int customerphone) {
        this.customerphone = customerphone;
    }

    public int getCustomercreditcard() {
        return customercreditcard;
    }

    public void setCustomercreditcard(int customercreditcard) {
        this.customercreditcard = customercreditcard;
    }

    @XmlTransient
    public List<History> getHistoryList() {
        return historyList;
    }

    public void setHistoryList(List<History> historyList) {
        this.historyList = historyList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerid != null ? customerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.customerid == null && other.customerid != null) || (this.customerid != null && !this.customerid.equals(other.customerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rss.jpa.model.Customer[ customerid=" + customerid + " ]";
    }
    
}
