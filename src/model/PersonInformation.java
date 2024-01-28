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
public class PersonInformation {
    
    private ArrayList<Person> information;
    
    public PersonInformation(){
        this.information = new ArrayList<Person>();
    }

    public ArrayList<Person> getInformation() {
        return information;
    }

    public void setInformation(ArrayList<Person> information) {
        this.information = information;
    }
    
    public Person addNewPersons(){
        
        Person newPersons = new Person();
        information.add(newPersons);
        return newPersons;
        
    } 
    
    public void deletePersons(Person ps){
        information.remove(ps);
    }
    

    
    

    
}
