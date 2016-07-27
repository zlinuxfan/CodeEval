using System;
using System.IO;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using nFizzBuzz;

namespace UnitTestProject1 {
    [TestClass]
    public class UnitTest1 {
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
    }

}
