package com.jeuRessources.player;


/**
 * A Class related with all that is about the player
 * @author ln-dev05 (lord.nightmare05@gmail.com)
 * @version 1.0.0
 */
public final class Joueur {

    /**
     * The management of money
     * @since 1.0.0
     */
    private final Money coinPurse;

    private final Inventory inventory;

    /**
     * @since 1.0.0
     */
    public Joueur()
    {
        this.coinPurse = new Money();
        this.inventory = new Inventory();
    }

    @SuppressWarnings("unused")
    public void pay(int price)
    {
        coinPurse.pay(price);
    }

    @SuppressWarnings("unused")
    public boolean canPay(int price)
    {
        return coinPurse.canPay(price);
    }

    @SuppressWarnings("unused")
    public int getMoney()
    {
        return coinPurse.getMoney();
    }
    @SuppressWarnings("unused")
    public void gain(int gain)
    {
        coinPurse.gain(gain);
    }
    @SuppressWarnings("unused")
    public int changeWorld()
    {
        return 0;
    }

    public void addInInventory(int id, int resourceForASec) {
        inventory.add(id, resourceForASec);
    }

}
