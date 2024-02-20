/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sevlets.addressbookapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

/**
 *
 * @author jeshanpatel1510
 */
public class AddressBook {
    private int Id;
    public String Name, Home, Business;
    public int Phone1, Phone2, Fax, Cellular, Pager;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getHome() {
        return Home;
    }

    public void setHome(String Home) {
        this.Home = Home;
    }

    public String getBusiness() {
        return Business;
    }

    public void setBusiness(String Business) {
        this.Business = Business;
    }

    public int getPhone1() {
        return Phone1;
    }

    public void setPhone1(int Phone1) {
        this.Phone1 = Phone1;
    }

    public int getPhone2() {
        return Phone2;
    }

    public void setPhone2(int Phone2) {
        this.Phone2 = Phone2;
    }

    public int getFax() {
        return Fax;
    }

    public void setFax(int Fax) {
        this.Fax = Fax;
    }

    public int getCellular() {
        return Cellular;
    }

    public void setCellular(int Cellular) {
        this.Cellular = Cellular;
    }

    public int getPager() {
        return Pager;
    }

    public void setPager(int Pager) {
        this.Pager = Pager;
    }
}
