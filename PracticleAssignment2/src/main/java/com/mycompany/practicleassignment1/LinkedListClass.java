/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jeshanpatel1510
 */
public class LinkedListClass {

    Scanner in = new Scanner(System.in);

    protected void CategoryLinkedList() {
        int ch1, n;
        LinkedList<String> Movies = new LinkedList<String>();
        System.out.println("\nHow Many Movies You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();

        System.out.println("Enter Movie List : ");
        for (int i = 0; i < n; i++) {
            Movies.add(in.next());
        }

        do {
            System.out.println("\n--- LinkedList Collection Questions ---");
            System.out.println("1.Append Element at the End of List.");
            System.out.println("2.Iterate All Elements.");
            System.out.println("3.Iterate From Given Position.");
            System.out.println("4.Iterate In Reverse Order.");
            System.out.println("5.Insert At Specified Position.");
            System.out.println("6.Insert At First And Last Position.");
            System.out.println("7.Insert At Front.");
            System.out.println("8.Insert At End.");
            System.out.println("9.Insert Some Elements at Position.");
            System.out.println("10.Find First and Last Occerence of Element.");
            System.out.println("11.Display All Elements with Position.");
            System.out.println("12.Remove Specified Element.");
            System.out.println("13.Remove First And Last.");
            System.out.println("14.Remove All Elements.");
            System.out.println("15.Swap Two Elements.");
            System.out.println("16.Suffle Elements.");
            System.out.println("17.Join Two Linked Lists.");
            System.out.println("18.Copy Linked List To Other List.");
            System.out.println("19.Remove And Return First Element.");
            System.out.println("20.Retrive But Not Return First Element.");
            System.out.println("21.Retrive But Not Return Last Element.");
            System.out.println("22.Check Element Is Exist.");
            System.out.println("23.Convert Linked List To Array List.");
            System.out.println("24.Compare Two Linked List.");
            System.out.println("25.Check List Emptiness.");
            System.out.println("26.Replace Specified Element.");
            System.out.println("0.Exit.");
            System.out.println("Choose A Question : ");
            ch1 = in.nextInt();
            switch (ch1) {
                case 1:
                    AppenEnd(Movies);
                    break;

                case 2:
                    IterateAllElements(Movies);
                    break;

                case 3:
                    IterateAllElementsPosition(Movies);
                    break;

                case 4:
                    IterateReverse(Movies);
                    break;

                case 5:
                    InsertAtPosition(Movies);
                    break;

                case 6:
                    InsertAtFirstLast(Movies);
                    break;

                case 7:
                    InsertAtFront(Movies);
                    break;

                case 8:
                    InsertAtEnd(Movies);
                    break;

                case 9:
                    InsertSomeElementsAtPosition(Movies);
                    break;

                case 10:
                    GetFirstAndLastOccerence(Movies);
                    break;

                case 11:
                    DisplayAllElementsPosition(Movies);
                    break;

                case 12:
                    RemoveElement(Movies);
                    break;
                    
                case 13:
                    RemoveFirstAndLastElement(Movies);
                    break;
                    
                case 14:
                    RemoveAllElements(Movies);
                    break;
                    
                case 15:
                    SwapTwoElements(Movies);
                    break;
                    
                case 16:
                    SuffleElements(Movies);
                    break;
                    
                case 17:
                    JoinTwoLinkedLists(Movies);
                    break;
                    
                case 18:
                    CopyLinkedListToAnotherLinkedList(Movies);
                    break;
                    
                case 19:
                    RemoveAndReturnFirst(Movies);
                    break;
                    
                case 20:
                    RetriveFirst(Movies);
                    break;
                    
                case 21:
                    RetriveLast(Movies);
                    break;
                    
                case 22:
                    CheckElement(Movies);
                    break;
                    
                case 23:
                    ConvertLinkedToArrayList(Movies);
                    break;
                    
                case 24:
                    CompareLinkedLists(Movies);
                    break;
                    
                case 25:
                    CheckListEmpty(Movies);
                    break;
                    
                case 26:
                    ReplaceElement(Movies);
                    break;
                    
                default:
                    System.out.println("\nChoose Correct Question!!");
            }
        } while (ch1 != 0);
    }

    protected void AppenEnd(LinkedList<String> Movies) {
        System.out.print("Movie List : " + Movies);
        System.out.println();

        System.out.print("Give Movie Name To Append at End : ");
        Movies.addLast(in.next());

        System.out.println("Movie Added!!");
        System.out.print("Movie List : " + Movies);
        System.out.println();
    }

    protected void IterateAllElements(LinkedList<String> Movies) {
        System.out.print("\n\nAvailable Movies : ");
        int cnt = 0;
        for (String m : Movies) {
            System.out.print("[" + cnt + "] " + m + "\t");
            cnt++;
        }
        System.out.println();
    }

    protected void IterateAllElementsPosition(LinkedList<String> Movies) {
        int pos;
        int cnt = 0;
        System.out.print("Give Position (Start with 0) : ");
        pos = in.nextInt();

        System.out.print("\n\nAvailable Movies : ");

        for (int i = pos; i < Movies.size(); i++) {
            System.out.print("[" + i + "] " + Movies.get(i) + "\t");
        }
        System.out.println();
    }

    protected void IterateReverse(LinkedList<String> Movies) {
        System.out.print("\nMovie List : \n");
        for (int i = 0; i < Movies.size(); i++) {
            System.out.println("Position[" + i + "], Movie[" + Movies.get(i) + "]");
        }

        Collections.reverse(Movies);

        System.out.print("\nMovie List in Reverse Order : \n");
        for (int i = 0; i < Movies.size(); i++) {
            System.out.println("Position[" + i + "], Movie[" + Movies.get(i) + "]");
        }
        System.out.println();
    }

    protected void InsertAtPosition(LinkedList<String> Movies) {
        System.out.print("\nMovie List : ");
        for (int i = 0; i < Movies.size(); i++) {
            System.out.print("[" + i + "] " + Movies.get(i) + "\t");
        }

        int pos;

        System.out.print("\nGive Position (Start with 0) : ");
        pos = in.nextInt();
        System.out.println();

        System.out.print("\nGive Movie Name : ");
        Movies.add(pos, in.next());

        System.out.println("\nMovie Added at " + pos + " Position!!");
        System.out.print("\nNew Movie List : \n");
        for (int i = 0; i < Movies.size(); i++) {
            System.out.print("[" + i + "] " + Movies.get(i) + "\t");
        }
        System.out.println();
    }

    protected void InsertAtFirstLast(LinkedList<String> Movies) {
        System.out.print("\nMovie List : " + Movies);

        System.out.println();
        System.out.print("\nGive Movie To Insert at First : ");
        Movies.addFirst(in.next());

        System.out.print("\nGive Movie To Insert at Last : ");
        Movies.addLast(in.next());

        System.out.print("\nNew Movie List : " + Movies);
        System.out.println();
    }

    protected void InsertAtFront(LinkedList<String> Movies) {
        System.out.print("\nMovie List : " + Movies);

        System.out.println();
        System.out.print("\nGive Movie To Insert at Front : ");
        Movies.addFirst(in.next());

        System.out.print("\nNew Movie List : " + Movies);
        System.out.println();
    }

    protected void InsertAtEnd(LinkedList<String> Movies) {
        System.out.print("\nMovie List : " + Movies);

        System.out.println();
        System.out.print("\nGive Movie To Insert at End : ");
        Movies.addLast(in.next());

        System.out.print("\nNew Movie List : " + Movies);
        System.out.println();
    }

    protected void InsertSomeElementsAtPosition(LinkedList<String> Movies) {
        int n;

        System.out.print("\nMovie List : " + Movies);

        System.out.println("\nHow Many Movies You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();
        int[] pos = new int[n];

        System.out.println();
        System.out.print("\nGive Positions : ");
        for (int i = 0; i < pos.length; i++) {
            pos[i] = in.nextInt();
        }

        System.out.println();
        System.out.print("\nGive Movies : ");
        for (int i : pos) {
            System.out.print("\nPosition[" + i + "] : ");
            Movies.add(i, in.next());
        }

        System.out.print("\nNew Movie List : " + Movies);
        System.out.println();
    }

    protected void GetFirstAndLastOccerence(LinkedList<String> Movies) {
        String ele;
        System.out.print("\nMovie List : " + Movies);

        System.out.println();
        System.out.print("\nGive Movie : ");
        ele = in.next();

        System.out.print("\nFirst Occerence " + Movies.indexOf(ele) + " Last Occerence " + Movies.lastIndexOf(ele));
        System.out.println();
    }

    protected void DisplayAllElementsPosition(LinkedList<String> Movies) {
        System.out.print("\nMovie List : \n");
        for (int i = 0; i < Movies.size(); i++) {
            System.out.println("Position[" + i + "], Movie[" + Movies.get(i) + "]");
        }

        System.out.println();
    }

    protected void RemoveElement(LinkedList<String> Movies) {
        String ele;
        System.out.print("\nMovie List : " + Movies);

        System.out.println();

        if (Movies.size() > 0) {
            System.out.print("\nGive Movie To Remove : ");
            ele = in.next();
            if (Movies.contains(ele)) {
                Movies.remove(ele);
                System.out.println(ele + " Movie Removed!!");
                System.out.print("\nMovie List : " + Movies); 
            } else {
                System.out.println(ele + "Movie Not Found!!");
            }
        } else {
            System.out.println("Movie List Empty!!");
        }

        System.out.println();
    }
    
    protected void RemoveFirstAndLastElement(LinkedList<String> Movies) {
        String eleF, eleL;
        System.out.print("\nMovie List : " + Movies);

        System.out.println();

        if (Movies.size() > 0) {
            eleF = Movies.getFirst();
            eleL = Movies.getLast();
            
            Movies.removeFirst();
            System.out.println("First "+ eleF + " Movie Removed!!");
            
            Movies.removeLast();
            System.out.println("Last "+ eleL + " Movie Removed!!");
            System.out.print("\nMovie List : " + Movies); 
        } else {
            System.out.println("Movie List Empty!!");
        }       
        System.out.println();
    }
    
    protected void RemoveAllElements(LinkedList<String> Movies) {
        System.out.print("\nMovie List : " + Movies);

        System.out.println();

        if (Movies.size() > 0) {
            Movies.removeAll(Movies);
            System.out.println("All Movies Removed!!");
            System.out.print("\nMovie List : " + Movies); 
        } else {
            System.out.println("Movie List Empty!!");
        }

        System.out.println();
    }
    
    protected void SwapTwoElements(LinkedList<String> Movies) {
        String ele1, ele2;
        int i1, i2;
        i1 = 0;
        i2 = 0;

        System.out.print("\nMovie List : " + Movies);

        System.out.print("\nEnter Movie 1 : ");
        ele1 = in.next();
        System.out.print("\nEnter Movie 2 : ");
        ele2 = in.next();

        for (int i = 0; i < Movies.size(); i++) {
            if (Movies.get(i).equalsIgnoreCase(ele1)) {
                i1 = i;
            } else if (Movies.get(i).equalsIgnoreCase(ele2)) {
                i2 = i;
            }
        }

        Collections.swap(Movies, i1, i2);

        System.out.print("\nSwapped Movie List : " + Movies);
        System.out.println();
    }

    protected void SuffleElements(LinkedList<String> Movies) {
        System.out.print("\nMovie List Before Suffling : " + Movies);
        Collections.shuffle(Movies);
        System.out.print("\nMovie List After Suffling : " + Movies);
        System.out.println();
    }
    
    protected void JoinTwoLinkedLists(LinkedList<String> Movies) {
        LinkedList<String> Movies2 = new LinkedList<String>();

        int n;
        System.out.println("Insert Movies in Second LinkedList");

        System.out.println("How Many Movies You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();

        System.out.println("\nEnter Movie Name List : ");
        for (int i = 0; i < n; i++) {
            Movies2.add(in.next());
        }

        System.out.print("\nYour Movie List : " + Movies);
        System.out.print("\nSecond Movie List : " + Movies2);
        System.out.println();

        Movies.removeAll(Movies2);
        Movies.addAll(Movies2);

        System.out.print("\nJoined Movies List : " + Movies);
        System.out.println();
    }
    
    protected void CopyLinkedListToAnotherLinkedList(LinkedList<String> Movies) {
        LinkedList<String> CopyCat = new LinkedList<String>();
        System.out.print("\nMovie List : " + Movies);
        System.out.println("\n\nCopying Movie List To Other List...");

        CopyCat.addAll(Movies);

        System.out.println("Successfully Coppied Movie List To Other List...");
        System.out.print("\nCoppied Movie List : " + CopyCat);
        System.out.println();
    }
    
    protected void RemoveAndReturnFirst(LinkedList<String> Movies) {
        System.out.print("\nMovie List : " + Movies);
        System.out.println("\nDeletinging First Movie From List...");
        System.out.println("Successfully Deleted "+Movies.removeFirst()+" From List...");
        System.out.print("\nUpdated Movie List : " + Movies);
        System.out.println();
    }
    
    protected void RetriveFirst(LinkedList<String> Movies) {
        System.out.print("\nMovie List : " + Movies);
        System.out.print("\nFirst Movie In List : "+Movies.peekFirst());
        System.out.println();
    }
    
    protected void RetriveLast(LinkedList<String> Movies) {
        System.out.print("\nMovie List : " + Movies);
        System.out.print("\nLast Movie In List : "+Movies.peekLast());
        System.out.println();
    }
    
    protected void CheckElement(LinkedList<String> Movies){
        String Movie;
        
        System.out.print("\nMovie List : "+Movies);
        System.out.print("\nSearch a Movie : ");
        Movie = in.next();
        System.out.println();

        if (Movies.contains(Movie)) {
            System.out.println("Movie " + Movie + " Found At Index [" + Movies.indexOf(Movie) + "]!!");
        }
        else{
            System.out.println(Movie+" Movie Not Found!!");
        }
        System.out.println();
    }
    
    protected void ConvertLinkedToArrayList(LinkedList<String> Movies){
        System.out.print("\nMovie List(LinkedList) : "+Movies);
        
        ArrayList<String> Movie = new ArrayList<String>(Movies);
        System.out.print("\nMovie List(ArrayList) : "+Movie);
        System.out.println();
    }
    
    protected void CompareLinkedLists(LinkedList<String> Movies){
        LinkedList<String> Movies1 = new LinkedList<String>();
        LinkedList<String> Movies2 = new LinkedList<String>();
        
        Movies1.add("Pari");
        Movies1.add("1920");
        Movies1.add("Manikarnika");
        Movies1.add("Mimi");
        
        Movies2.addAll(Movies);
        
        System.out.print("\nYour Movie List : "+Movies);
        System.out.print("\nMovie List 1 : "+Movies1);
        System.out.print("\nMovie List 2 : "+Movies2);
        System.out.println();
        
        if(Movies.equals(Movies1))
        {
            System.out.print("\nYour Movie List & Movie List 1 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Movie List & Movie List 1 is Different!!");
        }
        
        if(Movies.equals(Movies2))
        {
            System.out.print("\nYour Movie List & Movie List 2 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Movie List & Movie List 2 is Different!!");
        }
        System.out.println();
    }
    
    protected void CheckListEmpty(LinkedList<String> Movies){
        if(Movies.isEmpty())
        {
            System.out.print("\nYour Movie List is Empty!!");
        }
        else
        {
            System.out.print("\nYour Movie List is not Empty, contains : "+Movies);
        }
        System.out.println();
    }
    
    protected void ReplaceElement(LinkedList<String> Movies){
        int i;
        String ele, ele2;
        System.out.print("\nYour Movie List : "+Movies);
        System.out.print("\nGive Movie Name To Replace From List : ");
        ele = in.next();
        if(Movies.contains(ele))
        {
            System.out.print("\nGive Movie Name To Replace : ");
            ele2 = in.next();

            Movies.set(Movies.indexOf(ele), ele2);
            System.out.println("List Updated!!");
            System.out.print("\nUpdated Movie List : "+Movies);
        }
        else
        {
            System.out.println(ele+" Movie Not Found!!");
        }
        System.out.println();
    }
}
