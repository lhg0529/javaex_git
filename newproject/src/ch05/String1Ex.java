package ch05;
//컨트롤 시프트 엔터를 눌러주면 자동으로 모자른 부분을 채워준다. 세미콜론 등등
public class String1Ex {
  public static void main(String[] args) {
    String s1 = new String("안녕, 자바"); //0x100 new string을 각각 사용하면 s1,s2가 다르게 됨
    String s2 = new String("안녕, 자바");//0x100 똑같은 게 들어가서 jvm이 같은 주소 할당함
    System.out.println("생성 후 : " + (s1 == s2));
    String s3 = "안녕, 자바";
    String s4 = "안녕, 자바";
    int i1 = 10;
    int i2 = 10;
    System.out.println(i1 == i2);
    System.out.println(s1 == s2); //이렇게 비교하면 다른 걸로 인식
    System.out.println(s1.equals(s2)); //이렇게 비교해야 문자열로 비교해서 같은 걸로 인식
    System.out.println(s1);


  }
}
