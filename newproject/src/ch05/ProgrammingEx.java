package ch05;

//charAt : 157p 특정 위치의 문자를 얻게 해주는 메소드
public class ProgrammingEx {
  public static void main(String[] args) {
    int count = 0;
    char c = 0;
    countChar("alsckdjflkjcalkjsdf", c);
    System.out.println(c);

  }
  static int countChar(String s, char c){

    int count = 0;

    for (int i = 0; i <s.length(); i++) {
      if(s.charAt(i)=='c'){
        count++;
      }

    }
    System.out.println(count);
    return count;
  }

}
