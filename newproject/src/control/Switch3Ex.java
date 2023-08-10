package control;

import java.util.Scanner;

public class Switch3Ex {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String bio = in.nextLine();
    String kind = "";
    if (bio.equals("호랑이") || bio.equals("사자")) {
      kind = "포유류";
    } else if (bio.equals("독수리") || bio.equals("참새")){
      kind = "조류";
    }
    System.out.printf("%s는 %s입니다.", bio, kind);
    System.out.println("동물의 이름을 입력하세요.");
    bio = in.nextLine();
    kind = "";
    switch (bio) {
      case "호랑이":
      case "사자":
        kind = "포유류";
        break;
      case "독수리":
      case "참새":
        kind = "조류";
        break;
      default: /* break 디폴트 해당없음까지 넣어줘야 null 오류가 안 생긴다? */
        kind = "해당없음";
    }
    System.out.printf("%s는 %s입니다. %d 글자입니다.\n", bio, kind, kind.length());
  }
}
