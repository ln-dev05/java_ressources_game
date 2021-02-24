package com.jeuRessources.utils;

import com.jeuRessources.ressources.Ressources;

import java.util.HashMap;

public class ImageMap {
    private static HashMap<Integer, String> myMap = new HashMap();

    /**
     * Adding default values
     */
    public ImageMap()
    {
        this.myMap.put(Ressources.WATER, "/data/javafx/images/water.png");
        this.myMap.put(Ressources.PANEL, "/data/javafx/images/Shop_panel.png");
    }

    public void addEntry(int index, String value)
    {
        assert(this.myMap.containsKey(index));
        this.myMap.put(index, value);
    }

    public String getPath(int key)
    {
        assert(this.myMap.containsKey(key));
        return this.myMap.get(key);
    }
}
