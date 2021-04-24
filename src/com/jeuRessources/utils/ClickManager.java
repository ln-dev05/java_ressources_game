package com.jeuRessources.utils;


import com.jeuRessources.Jeu;
import com.jeuRessources.locate.Area;
import com.jeuRessources.locate.Resource;
import com.jeuRessources.locate.World;
import com.jeuRessources.player.Joueur;

import static java.lang.Math.floor;

/**
 * Manager for the Clicks
 * @author ln-dev05 (lord.nightmare05@gmail.com)
 * @version 1.0.0
 */
public final class ClickManager {

    /**
     * This function is called when the player click on something
     * @since 1.0.0
     * @param mouseX the x position of the mouse
     * @param mouseY the y position of the mouse
     * @param currentWorld the current world
     * @param joueur the player
     */
    public static void manageEvent(double mouseX, double mouseY, World currentWorld, Joueur joueur)
    {
        int x = (int)floor(mouseX / Jeu.MAX_WIDTH * currentWorld.getWidth());
        int y = (int)floor(mouseY / Jeu.MAX_HEIGHT * currentWorld.getHeight());
        System.out.println(x);
        System.out.println(y);
        Area targetedArea = currentWorld.getArea(x, y);
        if (targetedArea instanceof Resource && ((Resource) targetedArea).getIsClickable())
            joueur.addInInventory(targetedArea.getId(),((Resource) targetedArea).getResourceForASec());
    }
}
