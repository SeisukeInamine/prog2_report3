package jp.ac.uryukyu.ie.e225225;

public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack);
    }

    @Override
    public void wounded(int damage) {
        super.wounded(damage);
        if (isDead()) {
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }
}
