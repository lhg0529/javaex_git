package ch06;

public class Circle {
  double radius;

  static void setRadius(String aaa){
    color = aaa;
  }

  final void changeRadius(double radius){
    this.radius = radius;
  }

  private void secret(){
    System.out.println("비밀");
  }

  public double findArea() {
    return Math.PI*radius*radius;
  }
}
