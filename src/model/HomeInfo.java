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
public class HomeInfo {
    private ArrayList<Home> info;
    
    public HomeInfo(){
        this.info = new ArrayList<Home>();
    }

    public ArrayList<Home> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<Home> info) {
        this.info = info;
    }
    
    public Home addNewHomes(){
        
        Home newHomes = new Home();
        info.add(newHomes);
        return newHomes;
        
    } 
    
    public void deleteHomes(Home hm){
        info.remove(hm);
    }
}
