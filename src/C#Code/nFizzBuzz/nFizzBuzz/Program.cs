using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace nFizzBuzz {
    class Program {
        const string FileName = "G:/Develop/CodeEval/C#Code/FizzBuzz/forTest.txt";

        static void Main(string[] args) {
            string[] data = new string[20];
            var fizzBuzz = new FizzBuzz();
            Console.WriteLine(fizzBuzz.play("2 7 15"));

            Console.WriteLine("...");
            Console.Read();
        }

        public void ReadFile(string fileName, out string[] data) {
            data = new string[20];
            StreamReader fs = new StreamReader(fileName);
            string str = "";
            int index = 0;

            while (str != null) {
                data[index++] = str = fs.ReadLine();
            }
        }
    }

    public class FizzBuzz {
        public string play(string str) {
            if (str.Equals("")) {
                return "";
            }
            var data =  str.Split(new char[] {' '});
            var firstNumber = int.Parse(data[0]);
            var secondNumber = int.Parse(data[1]);
            var andNumber = int.Parse(data[2]);
            var answer = "";

            for (int i = 1; i <= andNumber; i ++) {
                 if (i % firstNumber == 0 && i % secondNumber == 0) {
                    answer += "FB";
                } else if (i % firstNumber == 0) {
                    answer += "F";
                } else if (i%secondNumber == 0) {
                    answer += "B";
                } else {
                    answer += i;
                }
                if (i != andNumber) {
                    answer += " ";
                }
            }

            return answer;
        }
    }
}
