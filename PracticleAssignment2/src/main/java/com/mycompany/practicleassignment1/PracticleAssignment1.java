/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practicleassignment1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jeshanpatel1510
 */
public class PracticleAssignment1 {

    public static void main(String[] args) {
        int ch;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n--- Collection Categories ---");
            System.out.println("1.Array List");
            System.out.println("2.Linked List");
            System.out.println("3.Hash Set");
            System.out.println("4.Tree Set");
            System.out.println("5.Priority Queue");
            System.out.println("6.Hash Map");
            System.out.println("7.Tree Map");
            System.out.println("8.Question 1(Shapes Implementation)");
            System.out.println("9.Question 2(Address Book)");
            System.out.println("0.Exit.");
            System.out.println("Choose A Category : ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    ArrayListClass arrayList = new ArrayListClass();
                    arrayList.CategoryArrayList();
                    break;

                case 2:
                    LinkedListClass linkedList = new LinkedListClass();
                    linkedList.CategoryLinkedList();
                    break;

                case 3:
                    HashSetClass hashSet = new HashSetClass();
                    hashSet.CategoryHashSet();
                    break;

                case 4:
                    TreeSetClass treeSet = new TreeSetClass();
                    treeSet.CategoryTreeSet();
                    break;

                case 5:
                    PriorityQueueClass priorityQueue = new PriorityQueueClass();
                    priorityQueue.CategoryPriorityQueue();
                    break;

                case 6:
                    HashMapClass hashMap = new HashMapClass();
                    hashMap.CategoryHashMap();
                    break;

                case 7:
                    TreeMapClass treeMap = new TreeMapClass();
                    treeMap.CategoryTreeMap();
                    break;

                case 8:
                    ShapesImplement shapes = new ShapesImplement();
                    shapes.Shapes();
                    break;
                      
                default:
                    System.out.println("\nChoose Correct Category!!");
            }
        } while (ch != 0);
    }
}
