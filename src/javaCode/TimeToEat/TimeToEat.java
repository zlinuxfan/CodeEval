package javaCode.TimeToEat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;

/*****
 * **
 * Created by kde on 3/14/16.
 * **
 *****/
public class TimeToEat {

  public static void main(String[] args) throws IOException {
    BufferedReader file = new BufferedReader(new FileReader(args[0]));
    ArrayList<ArrayList<Time>> arrayList = readFromFile(file);

    for (ArrayList<Time> times: arrayList) {
      System.out.println(toString(sortTimes(times)));
    }

  }

  public static ArrayList<Time> sortTimes(ArrayList<Time> times) {
    Time tmp;

    for (int i = 0; i < times.size(); i++) {
      for (int j = 0; j < times.size(); j++) {
        if (times.get(i).compareTo(times.get(j)) > 0) {
          tmp = times.get(j);
          times.set(j, times.get(i));
          times.set(i, tmp);
        }
      }
    }
    return times;
  }

  public static String toString(ArrayList<Time> arrayList) {
    String str = "";

    for (Object el: arrayList) {
      str += el + " ";
    }
    return str;
  }


  public static ArrayList<ArrayList<Time>> readFromFile(BufferedReader file) throws IOException {
    ArrayList<ArrayList<Time>> arrayList = new ArrayList<>();
    String str;

    while ((str = file.readLine()) != null) {
      ArrayList<Time> arrayTimes = new ArrayList<>();
      String[] lineFromFile = str.split(" ");

      for (String el : lineFromFile) {
        arrayTimes.add(Time.valueOf(el));
      }
      arrayList.add(arrayTimes);
    }
    return arrayList;
  }
}
