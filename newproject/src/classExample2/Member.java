package classExample2;

public class Member {
  private String name; //직접 접근할 수 없어야 하므로 private
  private String id;
  private String password;
  private int age;

  public Member(String name, String id, String password, int age){
    this.id = id;
    this.name = name;
    this.password = password;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }



}
