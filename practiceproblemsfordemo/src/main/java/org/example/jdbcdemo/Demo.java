package org.example.jdbcdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Demo {

    public void showDemo(){
    Map<Integer,String> sampleMap= new HashMap<>();

    String name="Imam";

    String name1="Imam";
    String name2= new String("Imam");
    //name1.equals(name2);

    //name1==name2;


        Set<Entry<Integer,String>> entry=    sampleMap.entrySet();
        Iterator<Entry<Integer,String>> iterator=entry.iterator();
        while(iterator.hasNext()){

            Entry<Integer,String> e=iterator.next();
            System.out.println("key = "+e.getKey()+" value = "+e.getValue());
        }
    
    }
}
