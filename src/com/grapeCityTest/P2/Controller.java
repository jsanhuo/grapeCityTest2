package com.grapeCityTest.P2;

import com.grapeCityTest.P2.util.Command;
import com.grapeCityTest.P2.util.Entry;

import java.util.Collections;
import java.util.Comparator;

public class Controller {
    Command c;
    public Controller(Command command) {
        c = command;
        Order();
    }

    public void printCommand(){
        System.out.println(c.length);
        System.out.println(c.orderOption);
        for(int i=0;i<c.data.size();i++){
            System.out.println(c.data.get(i));
        }
    }

    public void Order(){
        Command command = c;
        Comparator<Entry<String, Integer>> entryComparator;
        if(command.orderOption.getName().equals("Name")){
            if(command.orderOption.getOrder().equals("ASC")){
                entryComparator = new Comparator<Entry<String, Integer>>() {
                    @Override
                    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                        return o1.key.compareTo(o2.key);
                    }
                };
            }else{
                entryComparator = new Comparator<Entry<String, Integer>>() {
                    @Override
                    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                        return o2.key.compareTo(o1.key);
                    }
                };
            }
        }else{
            if(command.orderOption.getOrder().equals("ASC")){
                entryComparator = new Comparator<Entry<String, Integer>>() {
                    @Override
                    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                        return o1.value.compareTo(o2.value);
                    }
                };
            }else{
                entryComparator = new Comparator<Entry<String, Integer>>() {
                    @Override
                    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                        return o2.value.compareTo(o1.value);
                    }
                };
            }
        }
        Collections.sort(command.data,entryComparator);
    }
}
