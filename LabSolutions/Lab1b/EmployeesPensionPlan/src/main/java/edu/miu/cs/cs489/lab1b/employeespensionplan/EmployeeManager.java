package edu.miu.cs.cs489.lab1b.employeespensionplan;

import edu.miu.cs.cs489.lab1b.employeespensionplan.model.Employee;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeManager {
    public static void main(String[] args) {
        System.out.println("Hello CS489");
        var employee = new Employee[] {
            new Employee(1, "Daniel", "Agar", LocalDate.of(2018, 1,17), 105945.50, null),
            new Employee(2, "Shaw", "Beard", LocalDate.of(2018,10, 3), 197750.00, null),
            new Employee(3, "Carly", "Smith", LocalDate.of(2014, 5,16), 842000.75, null)
        };
        printProducts(employee);
    }
    private static void printProducts(Employee[] employees) {
        if(employees != null) {
            if(employees.length > 0) {
                var sortedProducts = Arrays.stream(employees)
                        .sorted(Comparator.comparing(Employee::getYearlySalary))
                        .toList();
                System.out.print("[ \n");
                // Print
                // JSON format
                var numProducts = sortedProducts.size();
                for (int i = 0; i < sortedProducts.size(); i++) {
                    if((i+1) < numProducts) {
                        System.out.printf("%s, \n", sortedProducts.get(i).toJSONString());
                    } else {
                        System.out.println(sortedProducts.get(i).toJSONString());
                    }
                }
                System.out.print("]");
            }
        }
    }
}
