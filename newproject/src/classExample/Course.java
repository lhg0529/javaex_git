package classExample;

public class Course {
  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Integer getNumOfStudents() {
    return numOfStudents;
  }

  private String id;
  private String name;
  private Integer numOfStudents;

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumOfStudents(Integer numOfStudents) {
    this.numOfStudents = numOfStudents;
  }

  public void addStudent(int student){
    numOfStudents += student;
  }

  public void deleteStudent(int student){
    numOfStudents -= student;
  }
}
