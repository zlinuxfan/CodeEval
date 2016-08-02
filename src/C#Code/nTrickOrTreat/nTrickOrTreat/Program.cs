using System;
using System.Diagnostics;
using System.IO;
using System.Text.RegularExpressions;

namespace nTrickOrTreat {
    internal enum Candies {
        Vamp = 3,
        Zombies = 4,
        Whitches = 5
    }

    internal class Program {
        static void Main(string[] args) {
            var trickOrTreat = new TrickOrTreat();
            var fileName = "D:/CodeEval/src/C#Code/nTrickOrTreat/forTest.txt";
            string[] datas;

            ReadFile(fileName, out datas);

            foreach (var data in datas) {
                if (data != null)
                {
                    Console.WriteLine(trickOrTreat.DivideTheTreats(data));
                }
            }
        }

        private static void ReadFile(string fileName, out string[] datas) {
            int index = 0;
            datas = new string[40];

            using (var reader = File.OpenText(fileName))
                while (!reader.EndOfStream)
                {
                    var line = reader.ReadLine();
                    datas[index++] = line;
                    if (null == line)
                        continue;
                }
        }
    }

    public class TrickOrTreat {
        public TrickOrTreat() {
        }

        public int DivideTheTreats(string str) {
            var data = ParseData(str);

            int vamp = data[0];
            int zombies = data[1];
            int witches = data[2];
            var houses = data[3];
            var allChildren = vamp + zombies + witches;

            Debug.WriteLine("allChildren: " + allChildren);

            var answer = (vamp*(int) Candies.Vamp + zombies*(int) Candies.Zombies + witches*(int) Candies.Whitches)*
                         houses/allChildren;
            Debug.WriteLine("answer" + answer);
            return answer;
        }

        private int[] ParseData(string str) {
            int[] data = new int[4];

            var regex = new Regex(@"\d+");
            var match = regex.Match(str);
            int index = 0;

            while (match.Success) {
                data[index++] = Int32.Parse(match.ToString());
                match = match.NextMatch();
            }
            
            return data;
        }
    }
}