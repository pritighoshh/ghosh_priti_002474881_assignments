/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author LENOVO
 */
public class Bank {
    
    private String name;
    private String accountno;
    private String customerid;
    private String accounttype;
    private String accountbalance;
    private String branch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }
    
    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(String accounttype) {
        this.accounttype = accounttype;
    }

    public String getAccountbalance() {
        return accountbalance;
    }

    public void setAccountbalance(String accountbalance) {
        this.accountbalance = accountbalance;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    @Override
    public String toString(){
        return name;
        
    }
    
    
}
