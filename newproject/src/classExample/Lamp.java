package classExample;

public class Lamp {
  boolean status = false;
  String on = "켜짐";
  String off = "꺼짐";

  public void turnOn(){
    status=true;
  }

  public void turnoff(){
    status=false;
  }
}
