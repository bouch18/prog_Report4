package jp.ac.uryukyu.ie.e165745;

/**
 * Created by tnal on 2016/11/13.
 */
public class Main {
    public static void main(String[] args){
        //LivingThing hero = new LivingThing("勇者", 10, 5);
        //LivingThing enemy = new LivingThing("スライム", 6, 3);
        Hero hero = new Hero("勇者", 10, 5, false);
        Enemy enemy = new Enemy("スライム", 6, 3, false);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}