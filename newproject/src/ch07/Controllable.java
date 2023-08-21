package ch07;

/**

 * @throws : X
 * @implSpec : 전자제품을 제어하기 위한 메서드를 가진
 */

public interface Controllable {
  /**
   * @param : X
   * @return : void
   * @implSpec : 필요한 경우 오버라이드해서 사용하기
   */
  default void repair(){
    System.out.println("수리한다.");
  }
  default void reset(){
    System.out.println("장비를 초기화한다.");
  }
  private void show(String s){
    System.out.println(s);

  }
  void turnOn();
  void turnOff();

}
