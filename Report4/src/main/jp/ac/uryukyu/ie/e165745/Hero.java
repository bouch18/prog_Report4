package jp.ac.uryukyu.ie.e165745;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
/*public class Hero extends LivingThing{
    LivingThing hero = super.LivingThing("勇者", 10, 5);*/

public class Hero extends LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public Hero(String look, int take ,int manu, boolean lora){
        super(look, take, manu, lora); // 必ず先頭で呼び出す


    }
}