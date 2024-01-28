/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class BankDetails {
    
    private ArrayList<Bank> detail;
    
    public BankDetails(){
        this.detail = new ArrayList<Bank>();
    }

    public ArrayList<Bank> getDetail() {
        return detail;
    }

    public void setDetail(ArrayList<Bank> detail) {
        this.detail = detail;
    }
    
    public Bank addNewBanks(){
        
        Bank newBanks = new Bank();
        detail.add(newBanks);
        return newBanks;
        
    } 
    
    public void deleteBanks(Bank bk){
        detail.remove(bk);
    }
    
}
