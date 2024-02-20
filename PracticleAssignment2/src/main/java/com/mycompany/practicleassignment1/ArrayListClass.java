/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author jeshanpatel1510
 */
public class ArrayListClass {
    Scanner in = new Scanner(System.in);
    
    protected void CategoryArrayList()
    {
        int ch1, n;
        ArrayList<String> Books = new ArrayList<String>();
        do {
            System.out.println("\n--- ArrayList Collection Questions ---");
            System.out.println("1.Insert and Print.");
            System.out.println("2.Iterate All Elements.");
            System.out.println("3.Insert at First Position.");
            System.out.println("4.Retrive an Element of Specified Position.");
            System.out.println("5.Update an Given Element.");
            System.out.println("6.Remove Third Element.");
            System.out.println("7.Search an Element.");
            System.out.println("8.Sort ArrayList.");
            System.out.println("9.Copy ArrayList to Other List.");
            System.out.println("10.Suffle Elements.");
            System.out.println("11.Reverse Elements.");
            System.out.println("12.Extract Some Portion From List.");
            System.out.println("13.Compare Array List with Other List.");
            System.out.println("14.Swap Two Elements.");
            System.out.println("15.Join Two Array Lists.");
            System.out.println("16.Clone Array List To Other List.");
            System.out.println("17.Empty Array List.");
            System.out.println("18.Check Empty Array List.");
            System.out.println("19.Trim Capacity of Array List.");
            System.out.println("20.Increase Size of List.");
            System.out.println("21.Replace 2nd Element.");
            System.out.println("22.Print Elements with Positions.");
            System.out.println("0.Exit.");
            System.out.println("Choose A Question : ");
            ch1 = in.nextInt();

            switch (ch1) {
                case 1:
                    System.out.println("\nHow Many Books You Want to Insert ? ");
                    System.out.print("> ");
                    n = in.nextInt();
                    System.out.println("\nEnter Books Name List : ");
                    for (int i = 0; i < n; i++) {
                        Books.add(in.next());
                    }
                    printColors(Books);
                    break;

                case 2:
                    IterateArraylist(Books);
                    break;

                case 3:
                    InsertAtFirstPosition(Books);
                    break;

                case 4:
                    RetriveElement(Books);
                    break;

                case 5:
                    UpdateElement(Books);
                    break;

                case 6:
                    RemoveThirdElement(Books);
                    break;
                    
                case 7:
                    SearchElement(Books);
                    break;

                case 8:
                    SortArrayList(Books);
                    break;

                case 9:
                    CopyArrayListToAnotherArrayList(Books);
                    break;
                    
                case 10:
                    SuffleElements(Books);
                    break;

                case 11:
                    ReverseElements(Books);
                    break;

                case 12:
                    ExtractPortion(Books);
                    break;

                case 13:
                    CompareArrayLists(Books);
                    break;

                case 14:
                    SwapTwoElements(Books);
                    break;

                case 15:
                    JoinTwoArrayLists(Books);
                    break;

                case 16:
                    CloneArrayListToOtherList(Books);
                    break;

                case 17:
                    MakeListEmpty(Books);
                    break;

                case 18:
                    CheckListEmpty(Books);
                    break;

                case 19:
                    TrimCapacity(Books);
                    break;

                case 20:
                    IncreaseSize(Books);
                    break;

                case 21:
                    Replace2ndElement(Books);
                    break;

                case 22:
                    PrintAllElements(Books);
                    break;
                                                              
                default:
                    System.out.println("\nChoose Correct Question!!");
            }
        } while (ch1 != 0);
    }
    protected void printColors(ArrayList<String> books)
    {
        System.out.print("Available Book List : "+books);
        System.out.println();
    }
    
    protected void IterateArraylist(ArrayList<String> books)
    {
        System.out.print("\n\nAvailable Books : ");
        int cnt = 0;
        for(String c: books)
        {
            System.out.print("["+cnt+"] "+ c+"\t");
            cnt++;
        }
        System.out.println();
    }
    
    protected void InsertAtFirstPosition(ArrayList<String> books)
    {
        String book;
        System.out.print("\nBook List : "+books);
        
        System.out.print("\nAdd Book At First : ");
        book = in.next();
        books.add(0, book);
        System.out.println("Book Added At First!!");
        System.out.print("\nBook List : "+books);
        System.out.println();
    }
    
    protected void RetriveElement(ArrayList<String> Books)
    {
        int i;
        System.out.print("\nBook List : "+Books);
        System.out.print("\nEnter Index : ");
        i = in.nextInt();
        
        System.out.println("Book at Index ["+i+"] : "+Books.get(i));
        System.out.println();
    }
    
    protected void UpdateElement(ArrayList<String> Books)
    {
        int i;
        String book;
        
        System.out.print("\nBook List : "+Books);
        System.out.println("\nIndex to Update : ");
        i = in.nextInt();
        
        System.out.println("\nBook Value for Update : ");
        book = in.next();
        
        Books.set(i, book);
        System.out.println("Book Updated At Index ["+i+"]!!");
        System.out.print("\nBook List : "+Books);
        System.out.println();
    }
    
    protected void RemoveThirdElement(ArrayList<String> Books)
    {
        System.out.println("Third Element ["+Books.get(2)+"] Deleted!!");
        Books.remove(2);
        System.out.println();
    }
    
    protected void SearchElement(ArrayList<String> Books)
    {
        String book;
        
        System.out.print("\nBook List : "+Books);
        System.out.print("\nSearch a Book : ");
        book = in.next();
        System.out.println();
        
        for(int i=0;i<Books.size();i++)
        {
            if(Books.get(i).equalsIgnoreCase(book))
            {
                System.out.println("Book "+book+" Found At Index ["+i+"]!!");
            }
        }
    }
    
    protected void SortArrayList(ArrayList<String> Books)
    {
        System.out.print("\nBook List Before Sorting : "+Books);
        Collections.sort(Books);
        System.out.print("\nBook List After Sorting : "+Books);
        System.out.println();
    }
    
    protected void CopyArrayListToAnotherArrayList(ArrayList<String> Books)
    {
        ArrayList<String> CopyCat = new ArrayList<String>();
        System.out.print("\nBook List : "+Books);
        System.out.println("\n\nCopying Book List To Other List...");

        CopyCat.addAll(Books);
        
        System.out.println("Successfully Coppied Book List To Other List...");
        System.out.print("\nCoppied Book List : "+CopyCat);
        System.out.println();
    }
    
    protected void SuffleElements(ArrayList<String> Books)
    {
        System.out.print("\nBook List Before Suffling : "+Books);
        Collections.shuffle(Books);
        System.out.print("\nBook List After Suffling : "+Books);
        System.out.println();
    }
    
    protected void ReverseElements(ArrayList<String> Books)
    {
        System.out.print("\nBook List Before Reversing : "+Books);
        Collections.reverse(Books);
        System.out.print("\nBook List After Reversing : "+Books);
        System.out.println();
    }
    
    protected void ExtractPortion(ArrayList<String> Books)
    {
        System.out.print("\nFull Book List : "+Books);
        System.out.print("\n3 Elements From Book List : "+Books.subList(1, 4));
        System.out.println();
    }
    
    protected void CompareArrayLists(ArrayList<String> Books)
    {
        ArrayList<String> Book1 = new ArrayList<String>();
        ArrayList<String> Book2 = new ArrayList<String>();
        
        Book1.add("Java");
        Book1.add("JavaScript");
        Book1.add("HTML");
        Book1.add("CSS");
        
        Book2.addAll(Books);
        
        System.out.print("\nYour Book List : "+Books);
        System.out.print("\nBook List 1 : "+Book1);
        System.out.print("\nBook List 2 : "+Book2);
        System.out.println();
        
        if(Books.equals(Book1))
        {
            System.out.print("\nYour Book List & Book List 1 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Book List & Book List 1 is Different!!");
        }
        
        if(Books.equals(Book2))
        {
            System.out.print("\nYour Book List & Book List 2 is Equal!!");
        }
        else
        {
            System.out.print("\nYour Book List & Book List 2 is Different!!");
        }
        System.out.println();        
    }
    
    protected void SwapTwoElements(ArrayList<String> Books)
    {
        String ele1, ele2;
        int i1, i2;
        i1 = 0;
        i2 = 0;
        
        System.out.print("\nBook List : "+Books);
        
        System.out.print("\nEnter Element1 : ");
        ele1 = in.next();
        System.out.print("\nEnter Element2 : ");
        ele2 = in.next();
        
        for(int i=0;i<Books.size();i++)
        {
            if(Books.get(i).equalsIgnoreCase(ele1))
            {
                i1 = i;
            }
            else if(Books.get(i).equalsIgnoreCase(ele2))
            {
                i2 = i;
            }
        }
        
        Collections.swap(Books, i1, i2);
        
        System.out.print("\nSwapped Elements Book List : "+Books);
        System.out.println();
    }

    protected void JoinTwoArrayLists(ArrayList<String> Books)
    {
        ArrayList<String> Books2 = new ArrayList<String>();
        
        int n;
        System.out.println("Insert Elements in Second Arraylist");
        
        System.out.println("How Many Books You Want to Insert ? ");
        System.out.print("> ");
        n = in.nextInt();
        
        System.out.println("\nEnter Books Name List : ");
        for (int i = 0; i < n; i++) {
            Books2.add(in.next());
        }
        
        System.out.print("\nYour Book List : "+Books);
        System.out.print("\nSecond Book List : "+Books2);
        System.out.println();
        
        Books.removeAll(Books2);
        Books.addAll(Books2);
        
        System.out.print("\nJoined Book List : "+Books);
        System.out.println();
    }
    
    protected void CloneArrayListToOtherList(ArrayList<String> Books)
    {
        ArrayList Books2 = (ArrayList)Books.clone();
        
        System.out.print("\nYour Book List : "+Books);
        System.out.print("\nCloned Book List : "+Books2);
        System.out.println();
    }
    
    protected void MakeListEmpty(ArrayList<String> Books)
    {
        System.out.print("\nYour Book List : "+Books);
        Books.removeAll(Books);
        System.out.print("\nEmpty Book List : "+Books);
        System.out.println();
    }
        
    protected void CheckListEmpty(ArrayList<String> Books)
    {
        if(Books.isEmpty())
        {
            System.out.print("\nYour Book List is Empty!!");
        }
        else
        {
            System.out.print("\nYour Book List is not Empty, contains : "+Books);
        }
        System.out.println();
    }
    
    protected void TrimCapacity(ArrayList<String> Books)
    {
        System.out.print("\nYour Book List : "+Books);
        Books.trimToSize();
        System.out.print("\nList Trimmed Size : "+Books.size());
        System.out.println();
    }
    
    protected void IncreaseSize(ArrayList<String> Books)
    {
        int capacity;
        
        System.out.print("\nYour Book List : "+Books);
        System.out.print("\nList Size : "+Books.size());
        
        System.out.print("\n\nGive Numbers to Increase the Size of List : ");
        capacity = in.nextInt();
        
        Books.ensureCapacity(capacity);
        System.out.println("Your List Capacity is Now Increased to "+capacity);
        System.out.println();
    }
    
    protected void Replace2ndElement(ArrayList<String> Books)
    {
        System.out.print("\nYour Book List : "+Books);
        System.out.println();
        
        System.out.print("\nGive Value to Replace 2nd Element : ");
        Books.set(1, in.next());
        
        System.out.println();
        System.out.print("\nUpdated Book List : "+Books);
        System.out.println();
    }
    
    protected void PrintAllElements(ArrayList<String> Books)
    {
        System.out.println();
        int cnt = 0;
        for(String c: Books)
        {
            System.out.println("Position ["+cnt+"], Element["+ c+"]\t");
            cnt++;
        }
        System.out.println();
    }
}
