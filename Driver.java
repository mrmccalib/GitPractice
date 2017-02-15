import edu.csbsju.cs.*;
   // the Employee class is defined in that package

import static java.lang.System.*;

public class Driver
{

	private static Employee harry;
   public static void main(String[] args)
   {
      // because of the import statement, we don't have to use
      // edu.csbsju.cs.Employee here
      harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

      // Raise employee's salary by 10%
      harry.raiseSalary(10);

      // print out information about harry
      // use java.lang.System.out here
      out.println("name=" + harry.getName() + ",salary=" + harry.getSalary());
   }

   public String toString() {
       return harry.getName() + ", " + harry.getSalary() + ", " + harry.getHireDay();
   }
}
