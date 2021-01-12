/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.MyCompany;

import java.util.LinkedList;

/**
 *
 * @author AleAlRodionov
 */
public class MainClass {
    
    public static void main(String[] args){
        MyLinkedList t = new MyLinkedList();
        t.add("1");
        t.add("2");
        t.add("3");
        t.add("4");
        t.add("5");
        t.add(3, "80");
        System.out.println(t.remove(4));
          System.out.println(t.remove(4));
       t.iterator();
        t.clear();
        
       
        
    }

}
