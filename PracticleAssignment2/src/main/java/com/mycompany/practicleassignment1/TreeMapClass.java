/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author jeshanpatel1510
 */
public class TreeMapClass {
    Scanner in = new Scanner(System.in);
    
    protected void CategoryTreeMap()
    {
        int ch1, n;
        TreeMap<String, Integer> Series = new TreeMap<String, Integer>();
        do {
            System.out.println("\n--- Hash Map Collection Questions ---");
            System.out.println("1.Associate Values With Specified Keys.");
            System.out.println("2.Copy One Tree Map To Other Map.");
            System.out.println("3.Search For a Key in Map.");
            System.out.println("4.Search For a Value in Map.");
            System.out.println("5.Get All Keys in Map.");
            System.out.println("6.Delete All Elements.");
            System.out.println("7.Sort All Keys.");
            System.out.println("8.Get Greatest & Least Key-Value.");
            System.out.println("9.Get First & Last Key.");
            System.out.println("10.Get Reversed Key Mapping.");
            System.out.println("11.Get Key Value Associated to Greates Key Less Than Equal to Key.");
            System.out.println("12.Get Greatest Key Less Than Equal to Key.");
            System.out.println("13.Get Portion of Map Key Strictly Less Than Key.");
            System.out.println("14.Get Portion of Map Key Less Than Key.");
            System.out.println("15.Get Least Key Strictly Greater Than Key.");
            System.out.println("16.Get Key Value Associated to Greatest Key Strictly Less Than Key.");
            System.out.println("17.Get Greatest Key Strictly Less Than Key.");
            System.out.println("18.Get Navigable Set View.");
            System.out.println("19.Remove And Get Key-Value Assocciated With Least Key.");
            System.out.println("20.Remove And Get Key-Value Assocciated With Greatest Key.");
            System.out.println("21.Get Portion Of Map From Start(Inclusive) And End(Exclusive) Key.");
            System.out.println("22.Get Portion Of Map From Start And End Key.");
            System.out.println("23.Get Portion Of Map Start From Greater Than Eqaul to Key.");
            System.out.println("24.Get Portion Of Map Start From Greater Than Key.");
            System.out.println("25.Get Key Value Associated to Least Key Less Than Equal to Key.");
            System.out.println("26.Get Least Key Greater Than Key.");
            System.out.println("0.Exit.");
            System.out.println("Choose A Question : ");
            ch1 = in.nextInt();

            switch (ch1) {
                
                case 1:
                    AssociateKeyValues(Series);
                    break;
                    
                case 2:
                    CopyOneTreeMapToOtherMap(Series);
                    break;
                    
                case 3:
                    SearchKey(Series);
                    break;
                    
                case 4:
                    SearchValue(Series);
                    break;
                    
                case 5:
                    GetAllKeys(Series);
                    break;
                    
                case 6:
                    DeleteAllElements(Series);
                    break;
                    
                case 7:
                    SortKeysUsingComparator(Series);
                    break;
                    
                case 8:
                    GetGreaterLeastKeyValue(Series);
                    break;
                    
                case 9:
                    GetFirstLastKey(Series);
                    break;
                    
                case 10:
                    GetReversedKeys(Series);
                    break;
                    
                case 11:
                    GetKeyValueGreatestLessEqual(Series);
                    break;
                    
                case 12:
                    GetGreatestKeyLessEqual(Series);
                    break;
                    
                case 13:
                    GetPortionStriuctlyLessThanKey(Series);
                    break;
                    
                case 14:
                    GetPortionLessThanKey(Series);
                    break;
                    
                case 15:
                    GetLeastKeyStrictlyGreaterThanKey(Series);
                    break;
                    
                case 16:
                    GetKeyValueGreatestKeyLessThan(Series);
                    break;
                    
                case 17:
                    GetGreatestKeyStrictlyLessThan(Series);
                    break;
                    
                case 18:
                    GetNavigableSetView(Series);
                    break;
                    
                case 19:
                    RemoveReturnLeastKeyValue(Series);
                    break;
                    
                case 20:
                    RemoveReturnGreatestKeyValue(Series);
                    break;
                    
                case 21:
                    GetPortionInclusiveExclusive(Series);
                    break;
                    
                case 22:
                    GetPortion(Series);
                    break;
                    
                case 23:
                    GetPortionKeyGreaterEqualKey(Series);
                    break;
                    
                case 24:
                    GetPortionKeyGreaterThanKey(Series);
                    break;
                    
                case 25:
                    GetKeyValueLeastGreaterEqual(Series);
                    break;
                    
                case 26:
                    GetLeastKeyGreaterThan(Series);
                    break;
                    
                default:
                    System.out.println("\nChoose Correct Question!!");
            }
        } while (ch1 != 0);
    }
    
    protected void AssociateKeyValues(TreeMap<String, Integer> Series){
        String Key;
        Integer Value;
        
        System.out.println("\nHow Many Series You Want to Enter ?");
        System.out.print(">");
        int n = in.nextInt();
        
        for(int i=0;i<n;i++)
        {
            System.out.print("\nEnter Series["+i+"] Name : ");
            Key = in.next();
            System.out.print("\nEnter Series["+i+"] Episodes : ");
            Value = in.nextInt();
            
            Series.put(Key, Value);
            System.out.println();
        }
        
        System.out.println("Series List : ");
        for(String K:Series.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series.get(K));
        }
        System.out.println();
    }
    
    protected void CopyOneTreeMapToOtherMap(TreeMap<String, Integer> Series){
        System.out.println("Your Series List : ");
        for(String K:Series.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series.get(K));
        }
        
        TreeMap<String, Integer> Series2 = new TreeMap<String, Integer>(Series);
        
        System.out.println("\nCoppied Employee List : ");
        for(String K:Series2.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series2.get(K));
        }
        System.out.println();
    }
    
    protected void SearchKey(TreeMap<String, Integer> Series){
        String Key;
        
        System.out.print("\nEnter Series Name : ");
        Key = in.next();
        
        if(Series.containsKey(Key))
        {
            System.out.println("Tree Map Contains Series "+Key+" With No. of Episodes "+Series.get(Key)+"...");
        }
        else
        {
            System.out.println("No Series "+Key+" Found in Tree Map...");
        }
        System.out.println();
    }
    
    protected void SearchValue(TreeMap<String, Integer> Series){
        Integer Value;
        
        System.out.print("\nEnter No. Of Episodes : ");
        Value = in.nextInt();
        
        if(Series.containsValue(Value))
        {
            System.out.println("Tree Map Contains Series With No. of Episodes "+Value+"...");
        }
        else
        {
            System.out.println("No Series Found in Tree Map with No. of Episodes "+Value+"...");
        }
        System.out.println();
    }
    
    protected void GetAllKeys(TreeMap<String, Integer> Series){    
        System.out.print("\nKey List : "+Series.keySet());
        System.out.println();
    }
    
    protected void DeleteAllElements(TreeMap<String, Integer> Series){
        Series.clear();
        System.out.println("All Elements Deleted...");
        System.out.println("Your Series List : ");
        for(String K:Series.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series.get(K));
        }
        System.out.println();
    }
    
    class sort_Keys implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
        
    }
    
    protected void SortKeysUsingComparator(TreeMap<String, Integer> Series){ 
        TreeMap<String, Integer> Series2 = new TreeMap<String, Integer>(new sort_Keys());
        Series2.putAll(Series);
        
        System.out.println("Your Series List : ");
        for(String K:Series.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series.get(K));
        }
        System.out.println();
        System.out.println("Sorted Series List : ");
        for(String K:Series2.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series2.get(K));
        }
        System.out.println();
    }
    
    protected void GetGreaterLeastKeyValue(TreeMap<String, Integer> Series){
        System.out.println("Your Series List : ");
        for(String K:Series.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series.get(K));
        }        
        
        System.out.println("Greatest Key-Value in List : "+Series.firstEntry());
        System.out.println("Least Key-Value in List : "+Series.lastEntry());
        System.out.println();
    }
    
    protected void GetFirstLastKey(TreeMap<String, Integer> Series){
        System.out.println("Your Series List : ");
        for(String K:Series.keySet())
        {
            System.out.println("Name : "+K.toString());
            System.out.println("Episodes : "+Series.get(K));
        }        
        
        System.out.println("First Key in List : "+Series.firstKey());
        System.out.println("Last Key in List : "+Series.lastKey());
        System.out.println();
    }
    
    protected void GetReversedKeys(TreeMap<String, Integer> Series){    
        System.out.print("\nYour Key List : "+Series.keySet());
        System.out.print("\nReversed Key List : "+Series.descendingMap());
        System.out.println();
    }
    
    protected void GetKeyValueGreatestLessEqual(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.print("\nEnter Key : ");
        String Key = in.next();
        
        System.out.print("\nKey-Value Associated To Greatest key Less Equal to "+Key+" : "+Series.floorEntry(Key));
        System.out.println();
    }
    
    protected void GetGreatestKeyLessEqual(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.print("\nEnter Key : ");
        String Key = in.next();
        
        System.out.print("\nGreatest key Less Equal to "+Key+" : "+Series.floorKey(Key));
        System.out.println();
    }
    
    protected void GetPortionStriuctlyLessThanKey(TreeMap<String, Integer> Series){
        System.out.println("Your Series List : "+Series);
        
        System.out.print("\nGive Key : ");
        String Key = in.next();
        
        System.out.println("Portion of Series List : "+Series.headMap(Key));
        System.out.println();
    }
        
    protected void GetPortionLessThanKey(TreeMap<String, Integer> Series){
        System.out.println("Your Series List : "+Series);
        
        System.out.print("\nGive Key : ");
        String Key = in.next();
        
        System.out.println("Portion of Series List : "+Series.headMap(Key, true));
        System.out.println();
    }

    protected void GetLeastKeyStrictlyGreaterThanKey(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.print("\nEnter Key : ");
        String Key = in.next();
        
        System.out.print("\nLeast key Strictly Greater than "+Key+" : "+Series.higherKey(Key));
        System.out.println();        
    }
    
    protected void GetKeyValueGreatestKeyLessThan(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.print("\nEnter Key : ");
        String Key = in.next();
        
        System.out.print("\nKey-Value Associated To Greatest Key Strictly Less than "+Key+" : "+Series.lowerEntry(Key));
        System.out.println();
    }
    
    protected void GetGreatestKeyStrictlyLessThan(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.print("\nEnter Key : ");
        String Key = in.next();
        
        System.out.print("\nGreatest Key Strictly Less than "+Key+" : "+Series.lowerKey(Key));
        System.out.println();
    }
    
    protected void GetNavigableSetView(TreeMap<String, Integer> Series){
        System.out.print("\nNavigable Set View : "+Series.navigableKeySet());
        System.out.println();
    }
    
    protected void RemoveReturnLeastKeyValue(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.println("\n"+Series.pollFirstEntry()+" Removed!!");
        System.out.println();
    }
        
    protected void RemoveReturnGreatestKeyValue(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.println("\n"+Series.pollLastEntry()+" Removed!!");
        System.out.println();
    }
    
    protected void GetPortionInclusiveExclusive(TreeMap<String, Integer> Series){
        System.out.print("\nGive Start Key : ");
        String Start = in.next();
        System.out.print("\nGive End Key : ");
        String End = in.next();
        
        System.out.println("\nPortion of Map : "+Series.subMap(Start, true, End, true));
        System.out.println();
    }
    
    protected void GetPortion(TreeMap<String, Integer> Series){
        System.out.print("\nGive Start Key : ");
        String Start = in.next();
        System.out.print("\nGive End Key : ");
        String End = in.next();
        
        System.out.println("\nPortion of Map : "+Series.subMap(Start, End));
        System.out.println();
    }
    
    protected void GetPortionKeyGreaterEqualKey(TreeMap<String, Integer> Series){
        System.out.print("\nGive Key : ");
        String Start = in.next();
        
        System.out.println("\nPortion of Map : "+Series.tailMap(Start));
        System.out.println();
    }    
    
    protected void GetPortionKeyGreaterThanKey(TreeMap<String, Integer> Series){
        System.out.print("\nGive Key : ");
        String Start = in.next();
        
        System.out.println("\nPortion of Map : "+Series.tailMap(Start, true));
        System.out.println();
    }  
    
    protected void GetKeyValueLeastGreaterEqual(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.print("\nEnter Key : ");
        String Key = in.next();
        
        System.out.print("\nKey-Value Associated To Least Key Greater Equal to "+Key+" : "+Series.ceilingEntry(Key));
        System.out.println();
    }    
    
    protected void GetLeastKeyGreaterThan(TreeMap<String, Integer> Series){
        System.out.print("\nYour Key List : "+Series);
        System.out.print("\nEnter Key : ");
        String Key = in.next();
        
        System.out.print("\nLeast Key Greater Than Equal to "+Key+" : "+Series.ceilingKey(Key));
        System.out.println();
    }
}
