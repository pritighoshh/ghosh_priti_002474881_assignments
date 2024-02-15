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
public class PersonDetails {
    
    private ArrayList<Person> personList;

    public PersonDetails() {
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    
    
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public void deletePerson(Person person){
        personList.remove(person);
    }
        
    public Person searchPerson (String firstname, String lastname, String workstreetadd, String homestreetadd){
        for(Person person: personList){
            if (person.getFirstname().equals(firstname) || person.getLastname().equals(lastname) ||
                person.getWorkstreetadd().equals(workstreetadd) || person.getHomestreetadd().equals(homestreetadd)){
                 return person;
            }
        }
        return null;
        
    }
}


