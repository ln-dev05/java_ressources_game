package com.jeuRessources.ressources;

import com.jeuRessources.locate.Resource;

public class Water extends Resource {
    public Water() {
        super(Resources.WATER);
    }
    public Water(int nbForSec) {
        super(Resources.WATER, nbForSec);
    }
}
