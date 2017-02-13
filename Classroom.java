import java.util.ArrayList;

public class Classroom {
  private int roomNumber;
  private ArrayList<Person> students;
  private int studentLimit;


  public Classroom(int roomNumber){
    this.roomNumber = roomNumber;
    this.students = new ArrayList<Person>();
    this.studentLimit = 4;
  }


  public int getRoomNumber() {
    return this.roomNumber;
  }

  public int studentCount() {
    return students.size();
  }

  public Boolean classFull(){
    return this.studentCount() == this.studentLimit;
  }

  public void addStudent(Person student){
    students.add(student);
  }

  public void teacherWobbly(){
    students.clear();
  }

}
