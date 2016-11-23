package jp.ac.uryukyu.ie.e165745;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing {
    //String name;
    //int hitPoint;
    //int attack;
    //boolean dead;

    public Enemy(String look,int take, int suta, boolean lora){
        super(look, take, suta, lora); // 必ず先頭で呼び出す
    }


}