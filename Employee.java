import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class emp {
    String employee_name;
    int employee_id;
    int salary;

    public emp(int employee_id, String employee_name, int salary) {
        this.employee_name = employee_name;
        this.employee_id = employee_id;
        this.salary = salary;
    }

}

public class Employee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of employees-");
        int N = sc.nextInt();
        List<emp> list = new ArrayList<>();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Enter Employee_id, Employee_name and Salary");
            String s = sc.nextLine();
            String[] arrs = s.split(" ");
            String employee_name = arrs[1];
            int employee_id = Integer.parseInt(arrs[0]);
            int salary = Integer.parseInt(arrs[2]);
            list.add(new emp(employee_id, employee_name, salary));
        }

        for (emp emp : list) {
            double tax;
            int sal = emp.salary;
            if (sal <= 50000)
                tax = 0;
            else if (sal > 50000 && sal <= 60000)
                tax = .1 * (sal - 50000);
            else if (sal > 60000 && sal <= 150000)
                tax = .2 * (sal - 60000) + 1000;
            else
                tax = .3 * (sal - 150000) + 1000 + 18000;
            System.out.println("Employee ID = " + emp.employee_id + " Employee Name =" + emp.employee_name + " Employee Salary ="
                    + emp.salary + " and Income Tax = " + tax);
        }

    }
}

