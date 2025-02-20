package jp.ac.uryukyu.ie.e225225;
/*
 * LivingThingクラス。Hero, Enemy の共通部分をまとめた親クラス
 */

 public class LivingThing{
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack){
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead() {
        return this.dead;
    }

    public String getName() {
        return this.name;
    }

    public int getHitPoint() {
        return this.hitPoint;
    }

    public int getAttack() {
        return this.attack;
    }

    public void setDead(boolean dead){
        this.dead = dead;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoint(int hitPoint) {
        this.hitPoint = hitPoint;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void attack(LivingThing opponent) {
        if (!isDead()) { // 死亡後の攻撃を防ぐ
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) { // 0以下で死亡判定
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
 
