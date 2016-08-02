using FluentAssertions;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using nTrickOrTreat;

namespace UnitTestProject1 {
    [TestClass]
    public class UnitTest1 {
        //Vampires: 1, Zombies: 1, Witches: 1, Houses: 0
        [TestMethod]
        public void Should_return_0_for_1_1_1_0() {
            var trickOrTreat = new TrickOrTreat();
            var str = "Vampires: 1, Zombies: 1, Witches: 1, Houses: 0";
            trickOrTreat.DivideTheTreats(str).Should().Be(0);
        }
        [TestMethod]
        public void Should_return_4_for_1_1_1_1() {
            var trickOrTreat = new TrickOrTreat();
            var str = "Vampires: 1, Zombies: 1, Witches: 1, Houses: 1";

            trickOrTreat.DivideTheTreats(str).Should().Be(4);
        }
        [TestMethod]
        public void Should_return_4_for_1_0_1_1() {
            var trickOrTreat = new TrickOrTreat();
            var str = "Vampires: 1, Zombies: 0, Witches: 1, Houses: 1";

            trickOrTreat.DivideTheTreats(str).Should().Be(4);
        }
        [TestMethod]
        public void Should_return_4_for_1_2_3_1() {
            var trickOrTreat = new TrickOrTreat();
            var str = "Vampires: 1, Zombies: 2, Witches: 3, Houses: 1";

            trickOrTreat.DivideTheTreats(str).Should().Be(4);
        }
        [TestMethod]
        public void Should_return_36_for_3_2_1_10() {
            var trickOrTreat = new TrickOrTreat();
            var str = "Vampires: 3, Zombies: 2, Witches: 1, Houses: 10";

            trickOrTreat.DivideTheTreats(str).Should().Be(36);
        }

    }
}
