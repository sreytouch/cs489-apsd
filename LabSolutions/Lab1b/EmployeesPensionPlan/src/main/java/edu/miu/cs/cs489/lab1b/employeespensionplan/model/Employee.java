package edu.miu.cs.cs489.lab1b.employeespensionplan.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private Double yearlySalary;
    private PensionPlan pensionPlan;

    public Employee(long employeeId, String firstName, String lastName, LocalDate employmentDate, Double yearlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
    }

    public String toJSON(){
        return String.format("  { \"PlanReference\": %s, " +
                        "\"FirstName\":%s, " +
                        "\"LastName\":%s, " +
                        "\"YearlySalary\":%.2f, " +
                        "\"EmploymentDate\":%s, " +
                        "\"EnrolmentDate\": %s, " +
                        "\"MontlhlyContribution\":%.2f}",
                pensionPlan.getPlanReferenceNumber(),
                firstName,
                lastName,
                yearlySalary,
                employmentDate,
                pensionPlan.getEnrollmentDate(),
                pensionPlan.getMonthlyContribution()
        );
    }
}