/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jeshanpatel1510
 */
public class HashMapClass {
    Scanner in = new Scanner(System.in);
    
    protected void CategoryHashMap()
    {
        int ch1, n;
        HashMap<String, String> Employee = new HashMap<String, String>();
        do {
            System.out.println("\n--- Hash Map Collection Questions ---");
            System.out.println("1.Associate Values With Specified Keys.");
            System.out.println("2.Count Key-Value Mappings In Map.");
            System.out.println("3.Copy One Hash Maps To Other Map.");
            System.out.println("4.Remove All Mappings From Map.");
            System.out.println("5.Check Map Contains Key-Value Mapping.");
            System.out.println("6.Get Shallow Copy of Hash Map.");
            System.out.println("7.Check Map Contains Key Mapping.");
            System.out.println("8.Check Map Contains Value Mapping.");
            System.out.println("9.Create Set View Of Mappings.");
            System.out.println("10.Get Value of Specified Key.");
            System.out.println("11.Get Key Set.");
            System.out.println("12.Get Value Collection.");
            System.out.println("0.Exit.");
            System.out.println("Choose A Question : ");
            ch1 = in.nextInt();

            switch (ch1) {
                
                case 1:
                    AssociateKeyValues(Employee);
                    break;
                    
                case 2:
                    CountMappings(Employee);
                    break;
                    
                case 3:
                    CopyOneHashMapToOtherMap(Employee);
                    break;
                    
                case 4:
                    RemoveAllMappings(Employee);
                    break;
                    
                case 5:
                    CheckKeyValueMappings(Employee);
                    break;
                    
                case 6:
                    GetShallowCopy(Employee);
                    break;
                    
                case 7:
                    CheckKeyMappings(Employee);
                    break;
                    
                case 8:
                    CheckValueMappings(Employee);
                    break;
                    
                case 9:
                    CreateSetView(Employee);
                    break;
                    
                case 10:
                    GetValueOfKey(Employee);
                    break;
                    
                case 11:
                    GetKeySet(Employee);
                    break;
                    
                case 12:
                    GetValueCollection(Employee);
                    break;
                    
                default:
                    System.out.println("\nChoose Correct Question!!");
            }
        } while (ch1 != 0);
    }
    
    protected void AssociateKeyValues(HashMap<String, String> Employee){
        String Key, Value;
        
        System.out.println("\nHow Many Employees You Want to Enter ?");
        System.out.print(">");
        int n = in.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter Employee["+i+"] Name : ");
            Key = in.next();
            System.out.print("\nEnter Employee["+i+"] Designation : ");
            Value = in.next();
            
            Employee.put(Key, Value);
            System.out.println();
        }
        
        System.out.println("Employee List : ");
        for(String K:Employee.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee.get(K));
        }
        System.out.println();
    }
    
    protected void CountMappings(HashMap<String, String> Employee){
        System.out.println("No. Of Employee : "+Employee.size());
        System.out.println();
    }
    
    protected void CopyOneHashMapToOtherMap(HashMap<String, String> Employee){
        System.out.println("Your Employee List : ");
        for(String K:Employee.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee.get(K));
        }
        
        HashMap<String, String> Employee2 = new HashMap<String, String>(Employee);
        
        System.out.println("\nCoppied Employee List : ");
        for(String K:Employee2.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee2.get(K));
        }
        System.out.println();
    }
    
    protected void RemoveAllMappings(HashMap<String, String> Employee){
        if(Employee.size() <= 0)
        {
            System.out.println("No Employees Available!!");
        }
        else
        {
            Employee.clear();
            System.out.println("All Employees Removed!!");
        }
        
        System.out.println("Your Employee List : ");
        for(String K:Employee.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee.get(K));
        }
        System.out.println();
    }
    
    protected void CheckKeyValueMappings(HashMap<String, String> Employee){
        String Key, Value;
        
        System.out.print("\nEnter Employee Name : ");
        Key = in.next();
        System.out.print("\nEnter Employee Designation : ");
        Value = in.next();
        
        if(Employee.containsKey(Key) && Employee.containsValue(Value))
        {
            System.out.println("Hash Map Contains Employee "+Key+" With Designation "+Value+"...");
        }
        else
        {
            System.out.println("No Employee "+Key+" With Designation "+Value+" Found in Hash Map...");
        }
        System.out.println();
    }
    
    protected void GetShallowCopy(HashMap<String, String> Employee){
        System.out.println("Your Employee List : ");
        for(String K:Employee.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee.get(K));
        }
        
        HashMap<String, String> Employee2 = (HashMap<String, String>)Employee.clone();
        
        System.out.println("\nCoppied Employee List : ");
        for(String K:Employee2.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee2.get(K));
        }
        System.out.println();
    }
    
    protected void CheckKeyMappings(HashMap<String, String> Employee){
        String Key, Value;
        
        System.out.print("\nEnter Employee Name : ");
        Key = in.next();
        
        if(Employee.containsKey(Key))
        {
            System.out.println("Hash Map Contains Employee "+Key+" With Designation "+Employee.get(Key)+"...");
        }
        else
        {
            System.out.println("No Employee "+Key+" Found in Hash Map...");
        }
        System.out.println();
    }
        
    protected void CheckValueMappings(HashMap<String, String> Employee){
        String Value;
        
        System.out.print("\nEnter Employee Designation : ");
        Value = in.next();
        
        if(Employee.containsValue(Value))
        {
            System.out.println("Hash Map Contains Designation "+Value+"...");
        }
        else
        {
            System.out.println("No Designation "+Value+" Found in Hash Map...");
        }
        System.out.println();
    }   
    
    protected void CreateSetView(HashMap<String, String> Employee){
        System.out.println("Your Employee List : ");
        for(String K:Employee.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee.get(K));
        }

        Set Employee2 = Employee.entrySet();
        
        System.out.println("Your Employee Set : "+Employee2);
        System.out.println();
    }
    
    protected void GetValueOfKey(HashMap<String, String> Employee){
        String Key;
        System.out.print("\nEnter Employee Name : ");        
        Key = in.next();
        
        if(Employee.containsKey(Key))
        {
            System.out.print("\nEmployee "+Key+" has "+Employee.get(Key)+" Designation ");
        }
        else
        {
            System.out.println("No Employee Found With Name "+Key);
        }
        System.out.println();
    }
    
    protected void GetKeySet(HashMap<String, String> Employee){
        System.out.println("Your Employee List : ");
        for(String K:Employee.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee.get(K));
        }

        Set Employee2 = Employee.keySet();
        
        System.out.println("Your Employee Key Set : "+Employee2);
        System.out.println();
    }
        
    protected void GetValueCollection(HashMap<String, String> Employee){
        System.out.println("Your Employee List : ");
        for(String K:Employee.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Designation : "+Employee.get(K));
        }

        Collection<String> Employee2 = Employee.values();
        
        System.out.println("Your Designation Collection : "+Employee2);
        System.out.println();
    }
}
