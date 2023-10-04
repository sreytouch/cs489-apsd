package edu.miu.cs.cs489.lab1b.employeespensionplan;

import edu.miu.cs.cs489.lab1b.employeespensionplan.model.Employee;
import edu.miu.cs.cs489.lab1b.employeespensionplan.model.PensionPlan;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeePension {
    public static void printEmployee(List<Employee> employees){
        System.out.println("Print Employee:");
        System.out.println("-----------------------");
        int n = employees.size();
        int i=0;
        employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary).reversed());

        System.out.println("[");
        for (Employee e: employees){
            if(e.getPensionPlan() == null){
                e.setPensionPlan(new PensionPlan("",LocalDate.now(),0));
            }
            if(i==n-1){
                System.out.println(e.toJSON());
            }else{
                System.out.printf(e.toJSON()+ "%s\n",",");
            }
            i++;
        }
        System.out.println("]\n");
    }
    public static void printUpcomingEnroll(List<Employee> employees){
        System.out.println("Monthly Upcoming Enroll:");
        System.out.println("-----------------------");
        int n = employees.size();
        int i=0;
        System.out.println("[");
        for(Employee e: employees){
            Period duration = Period.between(e.getEmploymentDate(),LocalDate.of(2023,11,30));
            int year = duration.getYears();
            if(year>=5){
                if(e.getPensionPlan() == null){
                    e.setPensionPlan(new PensionPlan("",LocalDate.now(),0));
                }
                if(i==n-1){
                    System.out.println(e.toJSON());
                }else{
                    System.out.printf(e.toJSON()+ "%s\n",",");
                }
            }

        }
        System.out.println("]\n");
    }
    public static void main(String[] args) {

        Employee employee1 = new Employee(1,"Daniel","Agar", LocalDate.of(2018,1,17 ),105945.50);
        Employee employee2 = new Employee(2,"Benard ","Shaw", LocalDate.of(2018,10,3 ),197750.00);
        Employee employee3 = new Employee(3,"Carly","Agar", LocalDate.of(2014,5,16 ),842000.75);
        Employee employee4 = new Employee(4,"Wesley","Schneider", LocalDate.of(2018,11,2 ),74500.00);

        PensionPlan pensionPlan1 = new PensionPlan("EX1089", LocalDate.of(2023,1,17),100);
        PensionPlan pensionPlan2 = new PensionPlan("SM2307", LocalDate.of(2019,11,4),1555.5);

        employee1.setPensionPlan(pensionPlan1);
        employee3.setPensionPlan(pensionPlan2);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        //print all employees
        printEmployee(employees);
        printUpcomingEnroll(employees);





    }
}