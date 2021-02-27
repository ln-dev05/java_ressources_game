package com.jeuRessources.player;


/**
 * @author ln-dev05 (lord.nightmare05@gmail.com)
 * @version 1.0.0
 */
public final class Money {

    /**
     * The current value of the money
     */
    private int value = 0;

    /**
     * Constructor
     */
    public Money() {}

    /**
     * @return The value of the current money
     */
    public int getMoney()
    {
        return this.value;
    }

    /**
     * @param price The price you have to pay
     * @return the price can be paid ?
     */
    public boolean canPay(int price)
    {
        return this.value - price >= 0;
    }

    /**
     * @param price The price you have to pay
     */
    public void pay(int price)
    {
        if (this.canPay(price))
            this.value -= price;
        else
            System.err.println("Player can't pay this");
    }

    /**
     * @param gain The value of the gain
     */
    public void gain(int gain)
    {
        this.value += gain;
    }
}
