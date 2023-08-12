package challengeCh4;

public class Circle {
  // static / class / 정적 변수
  private static long numOfCircles;
  private static long numOfRedCircles;
  // 인스턴스 변수
  private double radius;
  private String color;
  //생성자

  public Circle(double radius, String color){
    this.radius = radius;
    this.color = color;
    numOfCircles++;
    numOfRedCircles++; //빨간공이 만들어질때만 증가하도록 수정
  }


  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
