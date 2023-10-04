package edu.miu.cs.cs489.lab1b.employeespensionplan.model;

import java.time.LocalDate;
public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private double yearlySalary;
    private PensionPlan pensionPlan;
    // Constructor
    public Employee(long employeeId, String firstName, String lastName, LocalDate employmentDate, double yearlySalary, PensionPlan pensionPlan) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.pensionPlan = pensionPlan;
    }

    // Getters
    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public PensionPlan getPensionPlan() {
        return pensionPlan;
    }

    // Setters
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public void setPensionPlan(PensionPlan pensionPlan) {
        this.pensionPlan = pensionPlan;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", YearlySalary=").append(yearlySalary);
        sb.append(", EmploymentDate=").append(employmentDate);;
        sb.append(", PensionPlan=").append(pensionPlan);
        sb.append('}');
        return sb.toString();
    }

    public String toJSONString() {
        return String.format("  { \"employeeId\":%d, \"firstName\":%s, \"lastName\":%s }", employeeId, firstName, lastName);
//        return String.format("{ \"employeeId\":%d, \"firstName\":%s, \"lastName\":%s, \"YearlySalary\":%d, \"EmploymentDate\":%d, \"PensionPlan\":%,.2f }", employeeId, firstName, lastName, yearlySalary, employmentDate, pensionPlan);
    }

}
