package com.jeuRessources.ressources;

import com.jeuRessources.locate.Resource;

public class Water extends Resource {

    public Water() {
        super(Resources.WATER);
        register(Resources.WATER, "/data/javafx/images/water.png");
    }

    @SuppressWarnings("unused")
    public Water(int nbForSec) {
        super(Resources.WATER, nbForSec);
        register(Resources.WATER, "/data/javafx/images/water.png");
    }
}
