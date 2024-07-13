package com.example.hearthstone.player;

public class ManaCristal {

    private Integer upperLimitOfManaCristal;
    private Integer maximumManaCristal;
    private Integer availableMana;
    // 과부하 자체는 10을 초과해 더 많이 먹을 수 있다 (이번턴 과부하먹은만큼 데미지줄때 30몇뎀 이렇게 주기도 한다)
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

    public void resetManaCristal() {
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
        // 다음 턴 얻을 수 있는 최대마나만큼만 과부하를 먹을 수 있다

        this.overload += overload;
    }

    public void unlockOverload() {
        overload = 0;
    }

    public void increaseUpperLimitOfManaCristal(Integer mana) {
        this.upperLimitOfManaCristal = mana;
    }


}
