package edu.miu.cs489.lab6.adssurgerydentalcli.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer patientId;
    private String patientNo;
    private String firstName;
    private String lastName;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", unique = true, nullable = true)
    private Address primaryAddress;

    public Patient(Integer patientId, String patientNo, String firstName, String lastName, Address primaryAddress) {
        this.patientId = patientId;
        this.patientNo = patientNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.primaryAddress = primaryAddress;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("patientId=").append(patientId);
        sb.append(", patientNo='").append(patientNo).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", primaryAddress=").append(primaryAddress);
        sb.append('}');
        return sb.toString();
    }
}
