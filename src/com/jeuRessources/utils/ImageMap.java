package com.jeuRessources.utils;

import com.jeuRessources.ressources.Resources;
import java.util.HashMap;

/**
 * @author Lemair Paul <lord.nightmare05@gmail.com>
 * @since 1.0.0
 * @version 1.0.0
 */
public final class ImageMap {
    private static final HashMap<Integer, String> myMap = new HashMap<>();

    /**
     * Adding default values
     */
    public ImageMap()
    {
        myMap.put(Resources.PANEL, "/data/javafx/images/Shop_panel.png");
    }

    /**
     * Add an Entry to the HashMap
     * @param index the id
     * @param value the path to the image
     * @since 1.0.0
     */
    public static void addEntry(int index, String value)
    {
        assert(myMap.containsKey(index));
        myMap.put(index, value);
    }

    /**
     * Get an Entry with the key
     * @param key the id
     * @return the path
     * @since 1.0.0
     */
    public static String getPath(int key)
    {
        assert(myMap.containsKey(key));
        return myMap.get(key);
    }
}
