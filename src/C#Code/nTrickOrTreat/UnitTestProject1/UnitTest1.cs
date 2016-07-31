using System;
using FluentAssertions;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace UnitTestProject1 {
    [TestClass]
    public class UnitTest1 {
        //Vampires: 1, Zombies: 1, Witches: 1, Houses: 1
        [TestMethod]
        public void Should_return_4_for_1_1_1_1() {
            var trickOrTreat = new TrickOrTreat();

            trickOrTreat.DivideTheTreats(1, 1, 1, 1).Should().Be(4);
        }
    }

    internal class TrickOrTreat {
        public TrickOrTreat() {
        }

        public int DivideTheTreats(int vamp, int zombies, int witches, int houses) {
            const int candiesForVamp = 3;
            const int candiesForZombies = 4;
            const int candiesForWitches = 5;

            int allChildren = vamp + zombies + witches;
            return (vamp*candiesForVamp + zombies*candiesForZombies + witches*candiesForWitches) / allChildren;
        }
    }
}
