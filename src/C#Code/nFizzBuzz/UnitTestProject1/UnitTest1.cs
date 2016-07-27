using System;
using System.IO;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using nFizzBuzz;

namespace UnitTestProject1 {
    [TestClass]
    public class UnitTest1 {
       [TestMethod]
        public void Should_return_empty_line_to_empty_line() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            fizzBuzz.play("");
            Assert.AreEqual("", "");
        }

        [TestMethod]
        public void 
    }

}
