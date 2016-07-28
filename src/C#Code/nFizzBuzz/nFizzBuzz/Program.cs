using System;
using System.IO;


namespace nFizzBuzz {
    internal static class Program {
        
        static void Main(string[] args) {
            var fileName = args[0]; // "G:/Develop/CodeEval/src/C#Code/nFizzBuzz/forTest.txt";
            string[] datas;
            var fizzBuzz = new FizzBuzz();

            ReadFile(fileName, out datas);

            foreach (var newGame in datas) {
                Console.WriteLine(FizzBuzz.Play(newGame));
            }
        }

        private static void ReadFile(string fileName, out string[] datas) {
            int index = 0;
            datas = new string[20];

            using (var reader = File.OpenText(fileName))
                while (!reader.EndOfStream) {
                    var line = reader.ReadLine();
                    datas[index++] = line;
                    if (null == line)
                        continue;
                }
        }
    }

    public class FizzBuzz {
        public static string Play(string str) {
            if (string.IsNullOrEmpty(str)) {
                return "";
            }
            var data =  str.Split(new char[] {' '});
            var firstNumber = int.Parse(data[0]);
            var secondNumber = int.Parse(data[1]);
            var andNumber = int.Parse(data[2]);
            var answer = "";

            for (var i = 1; i <= andNumber; i ++) {
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
