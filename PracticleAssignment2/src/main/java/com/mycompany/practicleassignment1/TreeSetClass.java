/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jeshanpatel1510
 */
public class TreeSetClass {
    Scanner in = new Scanner(System.in);
    
    protected void CategoryTreeSet()
    {
        int ch1, n;
        TreeSet<String> Temples = new TreeSet<String>();
        do {
            System.out.println("\n--- ArrayList Collection Questions ---");
            System.out.println("1.Create, Insert and Print.");
            System.out.println("2.Iterate All Elements.");
            System.out.println("3.Add All Elements of Tree Set to Other Set.");
            System.out.println("4.Display Reverse Set Elements.");
            System.out.println("5.Get First And Last Elements.");
            System.out.println("6.Clone Tree Set To Other Set.");
            System.out.println("7.Get No. Of Elements.");
            System.out.println("8.Compare Two Tree Sets.");
            System.out.println("9.Get Numbers Less Than 7.");
            System.out.println("10.Get Element Greater Than Equals Specfied Number.");
            System.out.println("11.Get Element Less Than Equals Specfied Number.");
            System.out.println("12.Get Element Strictly Greater Than Equals Specfied Number.");
            System.out.println("13.Get Element Lower Than Specfied Number.");
            System.out.println("14.Get And Remove First Element.");
            System.out.println("15.Get And Remove Last Element.");
            System.out.println("16.Get And Remove Element.");
            System.out.println("0.Exit.");
            System.out.println("Choose A Question : ");
            ch1 = in.nextInt();

            switch (ch1) {
                case 1:
                    Temples = CreateInsertPrint();
                    break;
                        
                case 2:
                    IterateAllElements(Temples);
                    break;

                case 3:
                    AddAllElementsToOtherSet(Temples);
                    break;

                case 4:
                    ReverseElements(Temples);
                    break;

                case 5:
                    GetFirstLastElements(Temples);
                    break;

                case 6:
                    CloneTreeSetToOtherSet(Temples);
                    break;

                case 7:
                    GetNumberOfElements(Temples);
                    break;

                case 8:
                    CompareTwoTreeSets(Temples);
                    break;

                case 9:
                    NumbersLess7();
                    break;

                case 10:
                    GetGreaterEqual();
                    break;

                case 11:
                    GetLessEqual();
                    break;

                case 12:
                    GetStrictlyGreaterEqual();
                    break;

                case 13:
                    GetLower();
                    break;

                case 14:
                    GetAndRemoveFirst(Temples);
                    break;

                case 15:
                    GetAndRemoveLast(Temples);
                    break;

                case 16:
                    RemoveElement(Temples);
                    break;

                default:
                    System.out.println("\nChoose Correct Question!!");
            }
        } while (ch1 != 0);
    }
    
    protected TreeSet<String> CreateInsertPrint(){
        int n;
        TreeSet<String> Temples = new TreeSet<String>();
        
        System.out.println("\nHow Many Famous Temple Names You want to Insert ?");
        System.out.print(">");
        n = in.nextInt();
        
        System.out.println("\nEnter Temple List : ");
        for (int i = 0; i < n; i++) {
            Temples.add(in.next());
        }

        System.out.print("\nTemple List : "+Temples);
        System.out.println();
        
        return Temples;
    }
    
    protected void IterateAllElements(TreeSet<String> Temples){
        int cnt = 1;
        System.out.println("\nTemple List : ");
        for (String t: Temples) {
            System.out.print("["+cnt+"] "+t+"\t");
            cnt++;
        } 
        System.out.println();
    }
    
    protected void ReverseElements(TreeSet<String> Temples){
        System.out.print("\nTemple List : "+Temples);
        System.out.println();
        
        NavigableSet<String> treeset = Temples.descendingSet();
        Iterator<String> temples = treeset.iterator();
        
        System.out.print("\nReversed Temple List : "+Temples);
        System.out.println();
    }
    
    protected void AddAllElementsToOtherSet(TreeSet<String> Temples){
        System.out.print("\nTemple List : "+Temples);
        System.out.println();

        Set<String> temples2 = new TreeSet<String>(Temples);
        
        System.out.print("\nSecond Temple List : "+temples2);
        System.out.println();
    }
    
    protected void GetFirstLastElements(TreeSet<String> Temples){
        System.out.print("\nTemple List : "+Temples);
        System.out.println();
        
        System.out.println("\nFirst Temple in List : "+Temples.first());
        System.out.println("\nLast Temple in List : "+Temples.last());
        System.out.println();
    }
    
    protected void CloneTreeSetToOtherSet(TreeSet<String> Temples){
        TreeSet<String> Temples2 = new TreeSet<String>();
        
        System.out.print("\nFirst Temple List : "+Temples);
        System.out.println();
        
        Temples2 = (TreeSet<String>)Temples.clone();
        
        System.out.print("\nClonned Temple List : "+Temples2);
        System.out.println();
    }
    
    protected void GetNumberOfElements(TreeSet<String> Temples){
        System.out.print("\nNo. Of Temples in List : "+Temples.size());
        System.out.println();
    }
    
    protected void CompareTwoTreeSets(TreeSet<String> Temples){        
        TreeSet<String> Temples1 = new TreeSet<String>();
        TreeSet<String> Temples2 = new TreeSet<String>();
        
        Temples1.add("Himalay");
        Temples1.add("Minaxi(Madurai)");
        Temples1.add("Rameshwaram");
        Temples1.add("Kashi-Vishwanath");
        
        Temples2.addAll(Temples);
        
        System.out.print("\nYour Temple List : "+Temples);
        System.out.print("\nTemple List 1 : "+Temples1);
        System.out.print("\nTemple List 2 : "+Temples2);
        System.out.println();
        
        if(Temples.equals(Temples1))
        {
            System.out.print("\nYour Temple List & Temple List 1 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Temple List & Temple List 1 is Different!!");
        }
        
        if(Temples.equals(Temples2))
        {
            System.out.print("\nYour Temple List & Temple List 2 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Temple List & Temple List 2 is Different!!");
        }
        System.out.println();
    }
    
    protected void NumbersLess7(){
        int n;
        
        TreeSet<Integer> Numbers = new TreeSet<Integer>();
        
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
    
    protected void GetGreaterEqual(){
        int n, no;
        
        TreeSet<Integer> Numbers = new TreeSet<Integer>();
        
        System.out.println("\nHow Many Numbers You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();
        
        System.out.println("Enter Integers : ");
        for(int i=0;i<n;i++)
        {
            Numbers.add(in.nextInt());
        }
        
        System.out.print("\nEnter A Number to Compare : ");
        no = in.nextInt();
        
        System.out.print("\nElement >= "+no+" : "+Numbers.ceiling(no));
        System.out.println();
    }
    
    protected void GetLessEqual(){
        int n, no;
        
        TreeSet<Integer> Numbers = new TreeSet<Integer>();
        
        System.out.println("\nHow Many Numbers You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();
        
        System.out.println("Enter Integers : ");
        for(int i=0;i<n;i++)
        {
            Numbers.add(in.nextInt());
        }
        
        System.out.print("\nEnter A Number to Compare : ");
        no = in.nextInt();
        
        System.out.print("\nElement <= "+no+" : "+Numbers.floor(no));
        System.out.println();
    }
    
    protected void GetStrictlyGreaterEqual(){
        int n, no;
        
        TreeSet<Integer> Numbers = new TreeSet<Integer>();
        
        System.out.println("\nHow Many Numbers You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();
        
        System.out.println("Enter Integers : ");
        for(int i=0;i<n;i++)
        {
            Numbers.add(in.nextInt());
        }
        
        System.out.print("\nEnter A Number to Compare : ");
        no = in.nextInt();
        
        System.out.print("\nNumber Strictly >= "+no+" : "+Numbers.higher(no));
        System.out.println();
    }
    
    protected void GetLower(){
        int n, no;
        
        TreeSet<Integer> Numbers = new TreeSet<Integer>();
        
        System.out.println("\nHow Many Numbers You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();
        
        System.out.println("Enter Integers : ");
        for(int i=0;i<n;i++)
        {
            Numbers.add(in.nextInt());
        }
        
        System.out.print("\nEnter A Number to Compare : ");
        no = in.nextInt();
        
        System.out.print("\nElement Lower Than "+no+" : "+Numbers.lower(no));
        System.out.println();
    }
    
    protected void GetAndRemoveFirst(TreeSet<String> Temples){
        System.out.print("\nTemple List : "+Temples);
        System.out.print("\nGive Temple You Want TO Remove : ");
        System.out.println("\n"+Temples.pollFirst()+" Temple Removed!!");;
        System.out.println();
    }
    
    protected void GetAndRemoveLast(TreeSet<String> Temples){
        System.out.print("\nTemple List : "+Temples);
        System.out.println("\n"+Temples.pollLast()+" Temple Removed!!");;
        System.out.println();
    }
    
    protected void RemoveElement(TreeSet<String> Temples){
        String ele;
        System.out.print("\nTemple List : "+Temples);
        System.out.print("\nGive Temple You Want To Remove : ");
        ele = in.next();
        Temples.remove(ele);
        System.out.println("\n"+ele+" Temple Removed!!");;
        System.out.println();
    }
}
