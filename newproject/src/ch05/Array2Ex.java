package ch05;

import java.util.Arrays;

public class Array2Ex {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    for (int num: arr) {
      System.out.println(num);

    }
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));

    char[] cArr = {'a','b','c'}; //문자의 배열은 문자열 = string
    String sArr = "abc";
    for(char c : cArr){
      System.out.println(c);
    }
    System.out.println(cArr);
    System.out.println(sArr);
    System.out.println(Arrays.toString(cArr));

  }
}
