import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class HeidiesTest {
  Classroom room1;
  HeidieOffice heidie;
  Person john;
  Person paul;
  Person george;
  Person ringo;
  Person keith;

  @Before
  public void before() {
    room1 = new Classroom(1);
    heidie = new HeidieOffice();
    john = new Person("John");
    paul = new Person("Paul");
    george = new Person("George");
    ringo = new Person("Ringo");
    keith = new Person("Keith");
    room1.addStudent(john);
    room1.addStudent(paul);
    room1.addStudent(george);
    room1.addStudent(ringo);

  }

  @Test
  public void canGetCapacity() {
    assertEquals(4, heidie.getCapacity());
  }

  @Test
  public void canCountNaughtyStudents() {
    assertEquals(0, heidie.naughtyCount());
  }

  @Test
  public void  canRemoveStudentFromClassAndAddToHeidie(){
    heidie.nab(ringo, room1);
    assertEquals(3, room1.studentCount());
    assertEquals(1, heidie.naughtyCount());
  }


}