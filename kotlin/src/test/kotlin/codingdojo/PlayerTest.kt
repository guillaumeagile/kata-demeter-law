package codingdojo

import com.nhaarman.mockitokotlin2.mock
import org.junit.Ignore
import org.junit.Test
import kotlin.test.assertEquals

class PlayerTest {

    // choose this one if you are familiar with mocks
    @Ignore("Test is not finished yet")
    @Test
    fun damageCalculationsWithMocks() {
        val inventory: Inventory = mock()
        val stats: Stats = mock()
        val target: SimpleEnemy = mock()

        val damage = Player(inventory, stats).calculateDamage(target)

        assertEquals(10, damage.amount)
    }

    // choose this one if you are not familiar with mocks
    // @Ignore("Test is not finished yet")
    @Test
    fun damageCalculations() {
        val excalibur = BasicItem("", 10, 1.0f)
        val shield = BasicItem("", 0, 1.4f)
        val boots = BasicItem("", 0, 0.1f)
        val helmet = BasicItem("", 0, 1.2f)
        val plate = BasicItem("", 0, 1.4f)
        val equipment = Equipment(leftHand = excalibur, rightHand = shield, head = boots, feet = helmet, chest = plate)
        val inventory = Inventory(equipment)
        val stats = Stats(0)
        val armor1 = SimpleArmor(5)
        val buffs = listOf<Buff>(BasicBuff(1f, 1f))
        val target = SimpleEnemy(armor = armor1, buffs = buffs)

        val damage = Player(inventory, stats).calculateDamage(target)

        assertEquals(45, damage.amount)
    }

    @Test
    fun damageCalculations2() {
        val excalibur = BasicItem("", 10, 1.0f)
        val shield = BasicItem("", 0, 1.4f)
        val boots = BasicItem("", 0, 0.1f)
        val helmet = BasicItem("", 0, 1.2f)
        val plate = BasicItem("", 0, 1.4f)
        val equipment = Equipment(leftHand = excalibur, rightHand = shield, head = boots, feet = helmet, chest = plate)
        val inventory = Inventory(equipment)
        val stats = Stats(0)

        val target = Player(inventory, stats)

        val damage = target.calculateDamage(target)

        assertEquals(0, damage.amount)
    }
}
