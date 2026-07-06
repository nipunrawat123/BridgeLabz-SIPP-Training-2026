import java.io.*;
import java.util.Scanner;

public class EmployeeSerialization {

    public static void main(String[] args)
            throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Employee Id : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name : ");
        String name = sc.nextLine();

        System.out.print("Department : ");
        String dept = sc.nextLine();

        System.out.print("Salary : ");
        double salary = sc.nextDouble();

        Employee emp =
                new Employee(id,name,dept,salary);

        ObjectOutputStream oos =
                new ObjectOutputStream(
                        new FileOutputStream("employee.ser"));

        oos.writeObject(emp);
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(
                        new FileInputStream("employee.ser"));

        Employee e =
                (Employee) ois.readObject();

        System.out.println("\nRecovered Data");
        System.out.println(e.employeeId);
        System.out.println(e.name);
        System.out.println(e.department);
        System.out.println(e.salary);

        ois.close();
    }
}