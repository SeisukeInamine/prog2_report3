package jp.ac.uryukyu.ie.e225225;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void testAttackWithWeponSkill() {
        Warrior warrior = new Warrior("戦士", 100, 50); // 攻撃力 50
        Enemy golem = new Enemy("スライム", 500, 10); // HP 500

        for (int i = 0; i < 3; i++) { // 3回攻撃
            int expectedDamage = (int) (warrior.getAttack() * 1.5); // 50 * 1.5 = 75
            int beforeHp = golem.getHitPoint(); // 攻撃前のHP
            warrior.attackWithWeponSkill(golem);
            int actualDamage = beforeHp - golem.getHitPoint(); // 実際のダメージ

            assertEquals(expectedDamage, actualDamage, "ダメージが正しく計算されていません");
        }
    }
}
