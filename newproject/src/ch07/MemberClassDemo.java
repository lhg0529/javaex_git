package ch07;

public class MemberClassDemo {
  //필드 - 필드
  private String secret = "비공개";
  String s = "외부";
  //멤버 - 클래스
  class MemberClass {
    String s = "내부";
    //멤버 - 메서드
    public void show1(){
      System.out.println("inner class");
      System.out.println(secret);
      System.out.println(s);
      System.out.println(MemberClassDemo.this.s);
    }
  }
  //멤버-메서드
  public static void main(String[] args) {
    MemberClassDemo m = new MemberClassDemo();
    MemberClassDemo.MemberClass m1 = m.new MemberClass();
    System.out.println(m.secret);
    System.out.println(m.s);
    System.out.println(m1.s);
    m1.show1();
  }
}
