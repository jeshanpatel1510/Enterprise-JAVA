/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jeshanpatel1510
 */
public class HashSetClass {

    Scanner in = new Scanner(System.in);

    protected void CategoryHashSet() {
        int ch1, n;
        HashSet<String> Actors = new HashSet<String>();
        System.out.println("\nHow Many Actors You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();

        System.out.println("Enter Actor List : ");
        for (int i = 0; i < n; i++) {
            Actors.add(in.next());
        }

        do {
            System.out.println("\n--- HashSet Collection Questions ---");
            System.out.println("1.Append Specified Element.");
            System.out.println("2.Iterate Through All Elements.");
            System.out.println("3.Get No. Of Elements.");
            System.out.println("4.Empty Hash Set.");
            System.out.println("5.Check List Emptiness.");
            System.out.println("6.Clone Hash Set To Other Set.");
            System.out.println("7.Convert Hash Set to Array List.");
            System.out.println("8.Convert Hash Set to Tree Set.");
            System.out.println("9.Find Numbers Less Than 7.");
            System.out.println("10.Compare Two Hash Sets.");
            System.out.println("11.Compare Two Hash Sets Retain Same Elements.");
            System.out.println("12.Remove All Elements.");
            System.out.println("0.Exit.");
            System.out.println("Choose A Question : ");
            ch1 = in.nextInt();

            switch (ch1) {
                case 1:
                    AppendElement(Actors);
                    break;

                case 2:
                    IterateAllElements(Actors);
                    break;
                    
                case 3:
                    GetNoOfElements(Actors);
                    break;
                    
                case 4:
                    MakeListEmpty(Actors);
                    break;
                    
                case 5:
                    CheckListEmpty(Actors);
                    break;
                    
                case 6:
                    CloneHashSetToOtherSet(Actors);
                    break;
                    
                case 7:
                    ConvertHashSetToArrayList(Actors);
                    break;
                    
                case 8:
                    ConvertHashSetToTreeSet(Actors);
                    break;
                    
                case 9:
                    NumbersLess7();
                    break;
                    
                case 10:
                    CompareHashSets(Actors);
                    break;
                    
                case 11:
                    CompareHashSetRetainSameElements();
                    break;
                    
                case 12:
                    MakeListEmpty(Actors);
                    break;

                default:
                    System.out.println("\nChoose Correct Question!!");
            }
        } while (ch1 != 0);
    }

    protected void AppendElement(HashSet<String> Actors) {
        System.out.print("\nYour Actor Set : " + Actors);

        System.out.print("\nGive Actor Name To Append : ");
        Actors.add(in.next());

        System.out.print("\nUpdated Actor Set : " + Actors);
        System.out.println();
    }

    protected void IterateAllElements(HashSet<String> Actors) {
        System.out.print("\nAvailable Actors : ");
        int cnt = 0;
        for (String a : Actors) {
            System.out.print("[" + cnt + "] " + a + "\t");
            cnt++;
        }
        System.out.println();
    }

    protected void GetNoOfElements(HashSet<String> Actors) {
        System.out.print("\nNo. Of Actors : "+Actors.size());
        System.out.println();
    }
    
    protected void MakeListEmpty(HashSet<String> Actors) {
        System.out.print("\nActor Set : " + Actors);

        System.out.println();

        if (Actors.size() > 0) {
            Actors.removeAll(Actors);
            System.out.println("All Actors Removed!!");
            System.out.print("\nActor Set : " + Actors);
        } else {
            System.out.println("Actor Set is Empty!!");
        }

        System.out.println();
    }
    
    protected void CheckListEmpty(HashSet<String> Actors) {
        if (Actors.isEmpty()) {
            System.out.print("\nYour Actor Set is Empty!!");
        } else {
            System.out.print("\nYour Actor Set is not Empty, contains : " + Actors);
        }
        System.out.println();
    }
    
    protected void CloneHashSetToOtherSet(HashSet<String> Actors){
        HashSet Actors2 = (HashSet)Actors.clone();
        
        System.out.print("\nYour Actor Set : "+Actors);
        System.out.print("\nCloned Actor Set : "+Actors2);
        System.out.println();
    }
    
    protected void ConvertHashSetToArrayList(HashSet<String> Actors) {
        System.out.print("\nActors Set(Hash Set) : " + Actors);

        List<String> Actor = new ArrayList<String>(Actors);
        System.out.print("\nActor List(Array List) : " + Actor);
        System.out.println();
    }
    
    protected void ConvertHashSetToTreeSet(HashSet<String> Actors) {
        System.out.print("\nActor Set(Hash Set) : " + Actors);

        Set<String> Actor = new TreeSet<String>(Actors);
        System.out.print("\nActor Set(Tree Set) : " + Actor);
        System.out.println();
    }
    
    protected void NumbersLess7(){
        int n;
        
        HashSet<Integer> Numbers = new HashSet<Integer>();
        
        System.out.println("\nHow Many Numbers You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();
        
        System.out.println("Enter Integers : ");
        for(int i=0;i<n;i++)
        {
            Numbers.add(in.nextInt());
        }
 
        System.out.print("\nNumbers < 7 : ");
        for (Integer num : Numbers) {
            if (num < 7) {
                System.out.print(num + "\t");
            }
        }
    }
    
    protected void CompareHashSets(HashSet<String> Actors) {
        HashSet<String> Actors1 = new HashSet<String>();
        HashSet<String> Actors2 = new HashSet<String>();

        Actors1.add("AkshayKumar");
        Actors1.add("DeepikaPadukon");
        Actors1.add("SRK");
        Actors1.add("HritikRoshan");

        Actors2.addAll(Actors);

        System.out.print("\nYour Actor List : " + Actors);
        System.out.print("\nActor List 1 : " + Actors1);
        System.out.print("\nActor List 2 : " + Actors2);
        System.out.println();

        if (Actors.equals(Actors1)) {
            System.out.print("\nYour Actor List & Actor List 1 is Equal!!");
        } else {
            System.out.print("\nYour Actor List & Actor List 1 is Different!!");
        }

        if (Actors.equals(Actors2)) {
            System.out.print("\nYour Actor List & Actor List 2 is Equal!!");
        } else {
            System.out.print("\nYour Actor List & Actor List 2 is Different!!");
        }
        System.out.println();
    }
    
    protected void CompareHashSetRetainSameElements() {
        HashSet<String> Actors = new HashSet<String>();
        HashSet<String> Actors1 = new HashSet<String>();
        HashSet<String> Actors2 = new HashSet<String>();

        System.out.println("\nHow Many Actors You Want to Insert ? ");
        System.out.print("> ");
        int n = in.nextInt();

        System.out.println("Enter Actor List 1 : ");
        for (int i = 0; i < n; i++) {
            Actors1.add(in.next());
        }
        Actors.addAll(Actors1);

        System.out.println("Enter Actor List 2 : ");
        for (int i = 0; i < n; i++) {
            Actors2.add(in.next());
        }        

        System.out.print("\nActor List 1 : " + Actors1);
        System.out.print("\nActor List 2 : " + Actors2);
        System.out.println();

        if (Actors1.equals(Actors2)) {
            System.out.println("Your Actor List 1 & Actor List 2 is Equal!!");
        } else {
            System.out.println("Your Actor List 1 & Actor List 2 is Different!!");
            Actors.retainAll(Actors2);
            
            if(Actors.size()>0)
            {
                System.out.print("\nSame Elements : "+Actors);
            }
        }

        System.out.println();
    }
}
