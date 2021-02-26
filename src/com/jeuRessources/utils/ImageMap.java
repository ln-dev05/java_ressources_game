package com.jeuRessources.utils;

import com.jeuRessources.ressources.Resources;
import java.util.HashMap;

public class ImageMap {
    private static final HashMap<Integer, String> myMap = new HashMap<>();

    /**
     * Adding default values
     */
    public ImageMap()
    {
        myMap.put(Resources.PANEL, "/data/javafx/images/Shop_panel.png");
    }

    public static void addEntry(int index, String value)
    {
        assert(myMap.containsKey(index));
        myMap.put(index, value);
    }

    public static String getPath(int key)
    {
        assert(myMap.containsKey(key));
        return myMap.get(key);
    }
}
