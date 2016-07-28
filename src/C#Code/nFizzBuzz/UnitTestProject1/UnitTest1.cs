using System;
using System.IO;
using Microsoft.VisualStudio.TestTools.UnitTesting;


namespace nFizzBuzz {
    [TestClass]
    public class FizzBuzz_for_1_2 {
        private FizzBuzz fizzBuzz = new FizzBuzz();
        [TestMethod]
        public void Should_return_empty_line_to_empty_line() {
            const string expected = "";
            var actual = fizzBuzz.play("");
            Assert.AreEqual(expected, actual);
        }

        [TestMethod]
        public void Should_return_F_for_1_2_1() {
            const string expected = "F";
            Assert.AreEqual(expected, fizzBuzz.play("1 2 1"));
        }

        [TestMethod]
        public void Should_return_F_FB_for_1_2_2() {
            Assert.AreEqual("F FB", fizzBuzz.play("1 2 2"));
        }

        [TestMethod]
        public void Should_return_F_FB_F() {
            Assert.AreEqual("F FB F", fizzBuzz.play("1 2 3"));
        }

        [TestMethod]
        public void Should_return_F_FB_F_FB() {
            Assert.AreEqual("F FB F FB", fizzBuzz.play("1 2 4"));
        }
    }

    [TestClass]
    public class FizzBuzz_for_2_5 {
        private FizzBuzz fizzBuzz = new FizzBuzz();
        [TestMethod]
        public void Should_return_1_F_3_F_B_for_5() {
            Assert.AreEqual("1 F 3 F B", fizzBuzz.play("2 5 5"));
        }

        [TestMethod]
        public void Should_return_1_F_3_F_B_F_7_F_9_FB_for_10() {
            Assert.AreEqual("1 F 3 F B F 7 F 9 FB", fizzBuzz.play("2 5 10"));
        }
    }

    [TestClass]
    public class FizzBuzz_for_3_5 {
        private FizzBuzz fizzBuzz = new FizzBuzz();
        [TestMethod]
        public void Should_return__for_10() {
            Assert.AreEqual("1 2 F 4 B F 7 8 F B", fizzBuzz.play("3 5 10"));
        }

        [TestMethod]
        public void Should_return__for_15() {
            Assert.AreEqual("1 2 F 4 B F 7 8 F B 11 F 13 14 FB", fizzBuzz.play("3 5 15"));
        }
    }

    [TestClass]
    public class FizzBuzz_for_2_7 {
        private FizzBuzz fizzBuzz = new FizzBuzz();
        [TestMethod]
        public void Should_return__for_15() {
            Assert.AreEqual("1 F 3 F 5 F B F 9 F 11 F 13 FB 15", fizzBuzz.play("2 7 15"));
        }
    }
}
