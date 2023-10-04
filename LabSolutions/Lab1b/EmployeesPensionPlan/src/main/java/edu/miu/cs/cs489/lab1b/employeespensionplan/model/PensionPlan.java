package edu.miu.cs.cs489.lab1b.employeespensionplan.model;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PensionPlan {

    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private double monthlyContribution;
}