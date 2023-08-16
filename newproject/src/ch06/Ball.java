package ch06;

public class Ball extends Circle {

  //@Override
  public double findVolume(){
    return 4/3*(Math.PI*radius*radius*radius);
  }
}
