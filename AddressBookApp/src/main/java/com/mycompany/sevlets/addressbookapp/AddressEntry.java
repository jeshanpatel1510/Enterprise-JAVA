/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sevlets.addressbookapp;

import java.util.ArrayList;

/**
 *
 * @author jeshanpatel1510
 */
public class AddressEntry {

    private ArrayList<AddressBook> addressEntries;

    public AddressEntry() {
        this.addressEntries = new ArrayList<AddressBook>();
    }

    public ArrayList<AddressBook> GetEntries() {
        int i=0;
        for(AddressBook a: addressEntries)
        {
            System.out.println("Record["+i+"] "+a);
            i++;
        }
        return this.addressEntries;
    }

    public boolean AddEntries(AddressBook book) {
        
        this.addressEntries.add(book);
        return true;
    }

    public boolean EditEntries(int i, AddressBook book) {
        addressEntries.set(i, book);
        return true;
    }

    public boolean RemoveEntries(int id) {
        for(int i=0;i<addressEntries.size();i++)
        {
            if(addressEntries.get(i).getId() == id)
            {
                addressEntries.remove(i);
                return true;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
