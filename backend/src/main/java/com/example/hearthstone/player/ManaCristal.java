package com.example.hearthstone.player;

public class ManaCristal {

    private Integer upperLimitOfManaCristal;
    private Integer maximumManaCristal;
    private Integer availableMana;
    private Integer overload;

    public ManaCristal(Integer upperLimitOfManaCristal, Integer maximumManaCristal, Integer availableMana, Integer overload) {
        this.upperLimitOfManaCristal = upperLimitOfManaCristal;
        this.maximumManaCristal = maximumManaCristal;
        this.availableMana = availableMana;
        this.overload = overload;
    }

    public static ManaCristal initManaCristal() {
        return new ManaCristal(10,1,1,0);
    }

    public void setManaCristal() {
        if(maximumManaCristal < upperLimitOfManaCristal) {
            maximumManaCristal++;
        }

        availableMana = maximumManaCristal - overload;
        unlockOverload();

    }

    public void useManaCristal(int cost) {
        if(availableMana < cost) throw new RuntimeException("마나가 부족합니다.");
        availableMana -= cost;
    }

    public void gainOverload(Integer overload) {
        this.overload += overload;
    }

    public void unlockOverload() {
        overload = 0;
    }

    public void increaseUpperLimitOfManaCristal(Integer mana) {
        this.upperLimitOfManaCristal = mana;
    }


}
