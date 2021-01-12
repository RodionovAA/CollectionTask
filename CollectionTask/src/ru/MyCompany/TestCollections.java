/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.MyCompany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author AleAlRodionov
 */
public class TestCollections {
    
    public static void main(String[] args){
        TestCollections.List();
        TestCollections.Set();
        TestCollections.Map();
    }
    
    public static void List(){
        long start;
        long end;
        long res;
        
        System.out.println("ArrayList vs LinkedList");
        List<String> test1 = new ArrayList<String>();
        List<String> test2 = new LinkedList<String>();
        
        System.out.println("add in ArryList of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test1.add("Hello");
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("add in LinkedList of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test2.add("Hello");
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("inserting in ArryList from 1000000 items (Sttrings) in index 100 ...");
        start = System.nanoTime();
            test1.add(100,"Hello");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("inserting in LinkedList from 1000000 items (Sttrings) in index 100...");
        start = System.nanoTime();
            test2.add(100,"Hello");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
    
       System.out.println("getting in ArryList from 1000000 items (Sttrings) in index 900000 ...");
        start = System.nanoTime();
            test1.get(900000);
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("getting in LinkedList from 1000000 items (Sttrings) in index 900000...");
        start = System.nanoTime();
            test2.get(900000);
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        

        System.out.println("deletiing in ArryList from 1000000 items (Sttrings) in index 100 ...");
        start = System.nanoTime();
            test1.remove(100);
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("deletiing in LinkedList from 1000000 items (Sttrings) in index 100...");
        start = System.nanoTime();
            test2.remove(100);
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
    
    }
    
    
    public static void Set(){
        long start;
        long end;
        long res;
        
        System.out.println("HashSet vs LinkedHashSet vs TreeSet");
        Set<String> test1 = new HashSet<String>();
        Set<String> test2 = new LinkedHashSet<String>();
        Set<String> test3 = new TreeSet<String>();
        
        System.out.println("add in HashSet of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test1.add("Hello"+Integer.toString(i));
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("add in LinkedHashSet of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test2.add("Hello"+Integer.toString(i));
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("add in TreeSet of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test3.add("Hello"+Integer.toString(i));
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);

        System.out.println("deletiing in HashSet from 1000000 items (Sttrings) ...");
        start = System.nanoTime();
            test1.remove("Hello10");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("deletiing in LinkedHashSet from 1000000 items (Sttrings)...");
        start = System.nanoTime();
            test2.remove("Hello10");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("deletiing in LinkedHashSet from 1000000 items (Sttrings)...");
        start = System.nanoTime();
            test3.remove("Hello10");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
    
    }
    
    
    public static void Map(){
        long start;
        long end;
        long res;
        
        System.out.println("HashMap vs LinkedHashMap vs TreeMap");
        Map<String,String> test1 = new HashMap<String,String>();
        Map<String,String> test2 = new LinkedHashMap<String,String>();
        Map<String,String> test3 = new TreeMap<String,String>();
        
        System.out.println("add in HashMap of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test1.put(Integer.toString(i), "Hello"+Integer.toString(i));
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("add in LinkedHashMap of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test2.put(Integer.toString(i), "Hello"+Integer.toString(i));
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("add in TreeMap of 1000000 items (Sttrings)...");
        start = System.nanoTime();
        for (int i = 0;i<1000000;i++){
            test3.put(Integer.toString(i), "Hello"+Integer.toString(i));
        }
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);

        System.out.println("deletiing in HashMap from 1000000 items (Sttrings) ...");
        start = System.nanoTime();
            test1.remove("Hello10");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("deletiing in LinkedHashMap from 1000000 items (Sttrings)...");
        start = System.nanoTime();
            test2.remove("Hello10");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
        
        System.out.println("deletiing in LinkedHashMap from 1000000 items (Sttrings)...");
        start = System.nanoTime();
            test3.remove("Hello10");
        end = System.nanoTime();
        res =(end-start); 
        System.out.println("delta time= "+res);
    
    }
 
    
}
