package com.jeuRessources.player;

public class Money {
    private int value = 0;
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
