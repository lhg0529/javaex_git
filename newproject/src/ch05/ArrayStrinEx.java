package ch05;

public class ArrayStrinEx {
  public static void main(String[] args) {
    String[] names = new String[3];
    for (String name : names) {
      System.out.println(name);
    }
    names[0] = "kim"; //string 복잡한 개체
    names[1] = "lee";
    names[2] = "park";
    for (String name : names) {
      System.out.println(name);
    }
  }
}
