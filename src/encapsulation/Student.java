package encapsulation;

public class Student {
   private int roll;
    private String name;
   private boolean isAttendace;

     Student(int roll)
     {
         this.roll = roll;
     }
  public void setStudentAttended(boolean flag)
  {
          isAttendace = false;
      System.out.println("teacher assigned attendace");
  }

  public boolean getStudentAttended()
  {
      System.out.println("teacher access student attendace");
      return isAttendace;
  }
}
