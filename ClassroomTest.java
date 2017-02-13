import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class ClassroomTest {
  Classroom room1;
  Person john;
  Person paul;
  Person george;
  Person ringo;
  Person keith;


  @Before
  public void before() {
    room1 = new Classroom(1);
    john = new Person("John");
    paul = new Person("Paul");
    george = new Person("George");
    ringo = new Person("Ringo");
    keith = new Person("Keith");
  }

  @Test
  public void hasRoomNumber() {
    assertEquals(1, room1.getRoomNumber());
  }

  @Test
  public void canCountStudents() {
    assertEquals(0, room1.studentCount());
  }

  @Test
  public void canAddStudents() {
    room1.addStudent(john);
    assertEquals(1, room1.studentCount());
  }

  @Test
  public void detectsClassFull(){
      room1.addStudent(john);
      room1.addStudent(paul);
      room1.addStudent(george);

      assertEquals(false, room1.classFull());

      room1.addStudent(ringo);
      assertEquals(true, room1.classFull());
  }

  @Test 
  public void teacherCanThrowWobblyAndEjectAllStudents() {
    room1.addStudent(john);
    room1.addStudent(paul);
    room1.teacherWobbly();
    assertEquals(0, room1.studentCount());
  }

  // @Test

}