/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Person {
    private String firstname;
    private String lastname;
    private String socialsecuritynumber;
    private String license;
    
    private String workstreetadd;
    private int workunitnumber;
    private String workcity;
    private String workstate;
    
    private String homestreetadd;
    private int homeunitnumber;
    private String homecity;
    private String homestate;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSocialsecuritynumber() {
        return socialsecuritynumber;
    }

    public void setSocialsecuritynumber(String socialsecuritynumber) {
        this.socialsecuritynumber = socialsecuritynumber;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getWorkstreetadd() {
        return workstreetadd;
    }

    public void setWorkstreetadd(String workstreetadd) {
        this.workstreetadd = workstreetadd;
    }

    public int getWorkunitnumber() {
        return workunitnumber;
    }

    public void setWorkunitnumber(int workunitnumber) {
        this.workunitnumber = workunitnumber;
    }

    public String getWorkcity() {
        return workcity;
    }

    public void setWorkcity(String workcity) {
        this.workcity = workcity;
    }

    public String getWorkstate() {
        return workstate;
    }

    public void setWorkstate(String workstate) {
        this.workstate = workstate;
    }

    public String getHomestreetadd() {
        return homestreetadd;
    }

    public void setHomestreetadd(String homestreetadd) {
        this.homestreetadd = homestreetadd;
    }

    public int getHomeunitnumber() {
        return homeunitnumber;
    }

    public void setHomeunitnumber(int homeunitnumber) {
        this.homeunitnumber = homeunitnumber;
    }

    public String getHomecity() {
        return homecity;
    }

    public void setHomecity(String homecity) {
        this.homecity = homecity;
    }

    public String getHomestate() {
        return homestate;
    }

    public void setHomestate(String homestate) {
        this.homestate = homestate;
    }
    
    @Override
    public String toString(){
        return firstname;
    }
    
}
