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
    return this.studentCount() >= this.studentLimit;
  }

  public String addStudent(Person student){
    if (this.classFull() == false){
    students.add(student);
    return "Student Added!";}
    else {
      return "Sorry, class full!";
    }
  }

  public void teacherWobbly(){
    
    students.clear();
  }

  public void removeStudent(Person student){
    students.remove(student);
  }

}
