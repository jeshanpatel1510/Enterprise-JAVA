/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author jeshanpatel1510
 */
public class PriorityQueueClass {
    Scanner in = new Scanner(System.in);
    
    protected void CategoryPriorityQueue()
    {
        int ch1, n;
        PriorityQueue<String> Shows = new PriorityQueue<String>();
        do {
            System.out.println("\n--- Priority Queue Collection Questions ---");
            System.out.println("1.Insert and Print.");
            System.out.println("2.Iterate All Elements.");
            System.out.println("3.Add All Elements Of Priority Queue to Other Queue.");
            System.out.println("4.Add Element to Queue.");
            System.out.println("5.Remove All Elements.");
            System.out.println("6.Count All Elements.");
            System.out.println("7.Compare Two Priority Queues.");
            System.out.println("8.Retrive First Element.");
            System.out.println("9.Retrive And Remove First Element.");
            System.out.println("10.Convert Priority Queue To Array.");
            System.out.println("11.Convert Priority Queue Element To String.");
            System.out.println("12.Convert Priority Queue To Maximum Priority Queue.");
            System.out.println("0.Exit.");
            System.out.println("Choose A Question : ");
            ch1 = in.nextInt();

            switch (ch1) {
                case 1:
                    Shows = CreateInsertPrint();
                    break;
                    
                case 2:
                    IterateAllElements(Shows);
                    break;
                    
                case 3:
                    AllElementsToOtherQueue(Shows);
                    break;
                    
                case 4:
                    InsertAnElement(Shows);
                    break;
                    
                case 5:
                    RemoveAllElements(Shows);
                    break;
                    
                case 6:
                    CountAllElements(Shows);
                    break;
                    
                case 7:
                    CompareTwoQueues(Shows);
                    break;
                    
                case 8:
                    RetriveFirstElement(Shows);
                    break;
                    
                case 9:
                    RetriveRemoveFirstElement(Shows);
                    break;
                    
                case 10:
                    ConvertPriorityQueueToArray(Shows);
                    break;
                    
                case 11:
                    ConvertPriorityQueueElementToString(Shows);
                    break;
                    
                case 12:
                    ConvertPriorityQueueToMaximumPriorityQueue(Shows);
                    break;
                    
                default:
                    System.out.println("\nChoose Correct Question!!");
            }
        } while (ch1 != 0);
    }
    
    protected PriorityQueue<String> CreateInsertPrint(){
        int n;
        PriorityQueue<String> Shows = new PriorityQueue<String>();
        
        System.out.println("\nHow Many Shows Names You want to Insert ?");
        System.out.print(">");
        n = in.nextInt();
        
        System.out.print("\nEnter Show Queue : ");
        for (int i = 0; i < n; i++) {
            Shows.add(in.next());
        }

        System.out.print("\nShows Queue : "+Shows);
        System.out.println();
        
        return Shows;
    }
    
    protected void IterateAllElements(PriorityQueue<String> Shows){
        int cnt = 1;
        System.out.println("\nShows Queue : ");
        for (String s: Shows) {
            System.out.print("["+cnt+"] "+s+"\t");
            cnt++;
        } 
        System.out.println();
    }
    
    protected void AllElementsToOtherQueue(PriorityQueue<String> Shows){
        PriorityQueue<String> Shows2 = new PriorityQueue<String>();
        System.out.print("\nFirst Shows Queue : "+Shows);
        Shows2.addAll(Shows);
        System.out.print("\nSecond Shows Queue : "+Shows2);
        System.out.println();
    }
    
    protected void InsertAnElement(PriorityQueue<String> Shows){
        String show;
        System.out.print("\nGive Show Name : ");
        show = in.next();
        
        System.out.println(show+" Addded To Queue!!");
        Shows.add(show);
        System.out.print("\nShows Queue : "+Shows);
        System.out.println();
    }
    
    protected void RemoveAllElements(PriorityQueue<String> Shows){
        Shows.removeAll(Shows);
        System.out.println("All Shows Removed!!");
        System.out.print("\nShows Queue : "+Shows);
        System.out.println();
    }
    
    protected void CountAllElements(PriorityQueue<String> Shows){
        System.out.print("\nShows Queue : "+Shows);
        System.out.print("\nNo. Of Shows : "+Shows.size());
        System.out.println();
    }
    
    protected void CompareTwoQueues(PriorityQueue<String> Shows){        
        PriorityQueue<String> Shows1 = new PriorityQueue<String>();
        PriorityQueue<String> Shows2 = new PriorityQueue<String>();
        
        Shows1.add("Ramayan");
        Shows1.add("Mahabharat");
        Shows1.add("Ganesh");
        Shows1.add("Laxmi-Narayan");
        
        Shows2.addAll(Shows);
        
        System.out.print("\nYour Show Queue : "+Shows);
        System.out.print("\nShow List 1 : "+Shows1);
        System.out.print("\nShow List 2 : "+Shows2);
        System.out.println();
        
        if(Shows.equals(Shows1))
        {
            System.out.print("\nYour Show Queue & Show Queue 1 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Show Queue & Show Queue 1 is Different!!");
        }
        
        if(Shows.equals(Shows2))
        {
            System.out.print("\nYour Show Queue & Show Queue 2 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Show Queue & Show Queue 2 is Different!!");
        }
        System.out.println();
    }
    
    protected void RetriveFirstElement(PriorityQueue<String> Shows){
        System.out.print("\nShows Queue : "+Shows);
        System.out.print("\nFirst Shows : "+Shows.element());
        System.out.println();
    }
    
    protected void RetriveRemoveFirstElement(PriorityQueue<String> Shows){
        System.out.print("\nShows Queue : "+Shows);
        System.out.print("\nFirst Shows "+Shows.remove()+" Removed!!");
        System.out.print("\nShows Queue : "+Shows);
        System.out.println();
    }
    
    protected void ConvertPriorityQueueToArray(PriorityQueue<String> Shows){
        System.out.print("\nShows Queue : "+Shows);
        Object[] Shows2 = Shows.toArray();
        System.out.print("\nShows Array : ");
        for(int i=0;i<Shows2.length;i++){
            System.out.print(Shows2[i]+"\t");    
        }
        System.out.println();
    }
    
    protected void ConvertPriorityQueueElementToString(PriorityQueue<String> Shows){
        System.out.print("\nShows Queue : "+Shows);
        
        PriorityQueue<String> Shows2 = new PriorityQueue<String>(Collections.reverseOrder());
        Shows2.addAll(Shows);
        System.out.print("\nShows Queue : "+Shows.toString());
    }
    
    protected void ConvertPriorityQueueToMaximumPriorityQueue(PriorityQueue<String> Shows){
        System.out.print("\nShows Queue : "+Shows);
        
        PriorityQueue<String> Shows2 = new PriorityQueue<String>(Collections.reverseOrder());
        Shows2.addAll(Shows);
        System.out.print("\nMaximum Shows Queue : "+Shows2);        
    }
}
