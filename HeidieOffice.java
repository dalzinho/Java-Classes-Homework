import java.util.ArrayList;

class HeidieOffice {
  private ArrayList<Person> naughtyStudents;
  private int capacity;

  public HeidieOffice() {
    this.naughtyStudents = new ArrayList<Person>();
    this.capacity = 4;
  }

  public int getCapacity(){
    return this.capacity;
  }

  public int naughtyCount(){
    return naughtyStudents.size();
  }

  public void nab(Person student, Classroom room){
    naughtyStudents.add(student);
    room.removeStudent(student);
  }
  
}