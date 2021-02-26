package com.jeuRessources.ressources;

import com.jeuRessources.locate.Resource;


public class Trees extends Resource {

    public Trees() {
        super(Resources.WOOD);
        register(Resources.WOOD, "/data/javafx/images/Trees.png");
    }

    @SuppressWarnings("unused")
    public Trees(int nbForSec) {
        super(Resources.WOOD, nbForSec);
        register(Resources.WOOD, "/data/javafx/images/Trees.png");
    }
}
