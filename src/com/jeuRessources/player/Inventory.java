package com.jeuRessources.player;

import java.util.HashMap;

public class Inventory {
    private static final HashMap<Integer, Integer> myMap = new HashMap<>();

    public Inventory()
    {

    }

    public void add(int key, int value)
    {
        if(myMap.containsKey(key)) {
            value += myMap.get(key);
        }
        myMap.put(key, value);
        System.out.println(myMap.keySet());
        System.out.println(myMap.values());
    }
}
