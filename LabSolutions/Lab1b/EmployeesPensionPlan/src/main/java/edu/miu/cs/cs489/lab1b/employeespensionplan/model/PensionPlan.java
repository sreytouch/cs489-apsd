package edu.miu.cs.cs489.lab1b.employeespensionplan.model;

import java.time.LocalDate;
public class PensionPlan {
    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private double monthlyContribution;

    // Constructor
    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, double monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
    }

    // Getters
    public String getPlanReferenceNumber() {
        return planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public double getMonthlyContribution() {
        return monthlyContribution;
    }

    // Setters
    public void setPlanReferenceNumber(String planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setMonthlyContribution(double monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }
    @Override
    public String toString() {
        final StringBuilder pp = new StringBuilder("Pension Plan{");
        pp.append("Plan ReferenceNumber=").append(planReferenceNumber);
        pp.append(", Enrollment Date='").append(enrollmentDate).append('\'');
        pp.append(", Monthly Contribution='").append(monthlyContribution).append('\'');
        pp.append('}');
        return pp.toString();
    }

    public String toJSONString() {
        return String.format("{ \"Plan ReferenceNumber\":%d, \"Enrollment Date\":%s, \"Monthly Contribution\":%s,.2f }", planReferenceNumber, enrollmentDate, monthlyContribution);
    }

}
