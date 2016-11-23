package jp.ac.uryukyu.ie.e165745;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tnal on 2016/11/13.
 */
public class EnemyTest {
    /**
     * 「死んでる状態では攻撃できない」ことを確認。
     * @throws Exception
     */
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5, false);
        Enemy enemy = new Enemy("テストスライム", 6, 3, true);
        //enemy.dead = true;
        System.out.printf("%d,%s", hero.gethitPoint(), hero.getName());
        for(int i=0; i<10; i++) {
            enemy.attack(hero); //乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        System.out.printf("%d", hero.gethitPoint());
        assertEquals(heroHP, hero.gethitPoint());
    }

}