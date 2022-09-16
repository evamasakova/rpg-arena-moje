package com.rpg;

import com.rpg.entities.Entity;
import com.rpg.game.Arena;

public class Main {

    public static void main(String[] args) {

        Entity player, enemy;
        player = new Entity("Eschus", 100, 10);
        enemy = new Entity("Honza", 1000, 1000);
        Arena arena = new Arena("Parkoviste");
        arena.fight(player, enemy);
        arena = new Arena("Kabinet o_o");
        player.setHp(100);
        player.setDmg(10);
        enemy.setHp(1000);
        enemy.setDmg(1000);
        arena.fight(enemy, player);
    }
}
