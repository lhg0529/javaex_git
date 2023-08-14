package ch05;

public class String2CompareEx {
  public static void main(String[] args) {
    String s1 = "HI, JAVA"; //컨트롤 + o = 오버라이드
    String s2 = "Hi, java";

    System.out.println(s1.equals(s2));
    System.out.println(s1.equalsIgnoreCase(s2)); //대소문자 무시
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareToIgnoreCase(s2));
  }
}
