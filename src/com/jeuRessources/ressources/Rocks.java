package com.jeuRessources.ressources;

import com.jeuRessources.locate.Resource;

public class Rocks extends Resource {

        public Rocks() {
            super(Resources.STONE);
            register(Resources.STONE, "/data/javafx/images/rocks.png");

            this.isClickable = true;
        }

        @SuppressWarnings("unused")
        public Rocks(int nbForSec) {
            super(Resources.STONE, nbForSec);
            register(Resources.STONE, "/data/javafx/images/Rocks.png");
        }

}
