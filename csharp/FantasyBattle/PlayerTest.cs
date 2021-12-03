using System.Collections.Generic;
using System.Text;
using Moq;
using Xunit;

namespace FantasyBattle
{
    public class PlayerTest
    {

        // choose this one if you are familiar with mocks
        [Fact(Skip = "Test is not finished yet")]
        public void DamageCalculationsWithMocks()
        {
            var inventory = new Mock<Inventory>();
            var stats = new Mock<Stats>();
            var target = new Mock<SimpleEnemy>();

            var damage = new Player(inventory.Object, stats.Object).CalculateDamage(target.Object);
            Assert.Equal(10, damage.Amount);
        }

        // choose this one if you don't like mocks  :o)
        [Fact]
        public void DamageCalculations()
        {
            var excalibur = new BasicItem("", 10, 1.0f);
            var shield = new BasicItem("", 0, 1.4f);
            var boots = new BasicItem("", 0, 0.1f);
            var helmet = new BasicItem("", 0, 1.2f);
            var plate = new BasicItem("", 0, 1.4f);
            var equipment = new Equipment(excalibur, shield, boots, helmet, plate);
            var inventory = new Inventory(equipment);
            var stats = new Stats(0);
            var armor1 = new SimpleArmor(5);
            var buffs = new List<Buff>() { new BasicBuff(1f, 1f) };
            var target = new SimpleEnemy(armor1, buffs);

            Damage damage = new Player(inventory, stats).CalculateDamage(target);
            Assert.Equal(41, damage.Amount);
        }
    }
}
