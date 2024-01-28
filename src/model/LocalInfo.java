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
public class LocalInfo {
    
    private ArrayList<Local> infor;
    
    public LocalInfo(){
        this.infor = new ArrayList<Local>();
    }

    public ArrayList<Local> getInfor() {
        return infor;
    }

    public void setInfor(ArrayList<Local> infor) {
        this.infor = infor;
    }
    
    public Local addNewLocals(){
        
        Local newLocals = new Local();
        infor.add(newLocals);
        return newLocals;
        
    } 
    
    public void deleteLocals(Local lo){
        infor.remove(lo);
    }
}
