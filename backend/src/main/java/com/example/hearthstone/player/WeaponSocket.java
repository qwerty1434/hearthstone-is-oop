package com.example.hearthstone.player;

import com.example.hearthstone.basic.card.Weapon;

public class WeaponSocket {
    Weapon weapon;

    // 무기를 장착하다
    public void equipWeapon(Weapon weapon) {
        // 기존에 장착하고 있는 무기가 있으면 해당 무기를 파괴한다
        if(hasWeapon()) {
            this.weapon.destroyed();
        }
        this.weapon = weapon;
    }

    public boolean hasWeapon() {
        return weapon != null;
    }

    /**
     * WeaponSocket이 Weapon의 내구도를 잃게 한다?
     * Socket개념을 없애고 그냥 Player가 Weapon을 가지게 한다?
     */

}
