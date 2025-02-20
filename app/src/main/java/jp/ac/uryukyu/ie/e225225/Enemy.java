package jp.ac.uryukyu.ie.e225225;

public class Enemy {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public Enemy(String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attack(Hero hero) {
        if (dead) {
            return;
        }
        int damage = (int) (Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
        hero.wounded(damage);
    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

    // Getter and Setter Methods
    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isDead() {
        return dead;
    }
}
