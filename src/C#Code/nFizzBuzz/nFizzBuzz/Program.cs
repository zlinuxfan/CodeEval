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
            return "";
        }
    }
}
