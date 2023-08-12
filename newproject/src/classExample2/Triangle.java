package classExample2;

public class Triangle {
  private double width;
  private double height;

  public Triangle(double height, double width){
    this.height = height;
    this.width = width;
  }

  public double getSide() {
    return width;
  }

  public double getHeight() {
    return height;

  }
  public double findArea(){
    return width * height * 0.5;
  }

  public boolean isSameArea(Triangle t2){
    if(this.findArea()==t2.findArea())
      return true;
    else
      return false;
  }
}

