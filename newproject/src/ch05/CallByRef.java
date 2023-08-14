package ch05;

import classExample.Circle;

public class CallByRef {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.0);
    Circle c2 = new Circle(10.0);

    zero(c1);
    System.out.println("메서드 실행 후 반지름 : " + c1.getRadius());
    zero(c2.getRadius());
    System.out.println("메서드 실행 후 반지름 : " + c2.getRadius());

  }

  public static void zero(Circle c){
    c.setRadius(1.0);
  }

  public static void zero(double r){
    r=1.0; //지역변수의 값만 바꾸지 실제 값을 바꾸지는 못함
  }
}
//이것이 자바다 플래시로 구현된 것 볼 수 있음 call by value