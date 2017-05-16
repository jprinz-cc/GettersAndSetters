package com.johnprinz.gettersandsetters;

import android.util.Log;

/**
 * Created by John on 31/07/2014.
 */
class Hospital{
    protected void healSoldier(Soldier soldierToHeal){
        Log.i("HealSoldier method = ", "" + soldierToHeal.getHealth());
        int health = soldierToHeal.getHealth();
        health = health + 10;
        soldierToHeal.setHealth(health);
        Log.i("Finnish heal soldier = ", "" + soldierToHeal.getHealth());
    }
}
