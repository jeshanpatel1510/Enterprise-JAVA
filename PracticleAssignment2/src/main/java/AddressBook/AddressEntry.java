/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AddressBook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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
        return this.addressEntries;
    }

    public boolean AddEntries(AddressBook book) {
        this.addressEntries.add(book);
        return true;
    }

    public boolean EditEntries(String Name, AddressBook book) {
        for(int i=0;i<addressEntries.size();i++)
        {
            if(addressEntries.get(i).getName().equals(Name))
            {
                addressEntries.set(i, book);
            }
        }
        return true;
    }

    public boolean RemoveEntries(String Name) {
        for(int i=0;i<addressEntries.size();i++)
        {
            if(addressEntries.get(i).getName().equals(Name))
            {
                addressEntries.remove(i);
            }
        }
        return true;
    }
}
