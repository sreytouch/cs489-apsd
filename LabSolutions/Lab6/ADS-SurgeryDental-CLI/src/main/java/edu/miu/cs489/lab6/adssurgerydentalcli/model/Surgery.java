package edu.miu.cs489.lab6.adssurgerydentalcli.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "surgeries")
public class Surgery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer surgeryId;
    private  String surgeryNo;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "address_id", unique = true, nullable = true)
    private Address primaryAddress;

    public Surgery(Integer surgeryId, String surgeryNo, Address primaryAddress) {
        this.surgeryId = surgeryId;
        this.surgeryNo = surgeryNo;
        this.primaryAddress = primaryAddress;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Surgery{");
        sb.append("surgeryId=").append(surgeryId);
        sb.append(", surgeryNo='").append(surgeryNo).append('\'');
        sb.append(", primaryAddress=").append(primaryAddress);
        sb.append('}');
        return sb.toString();
    }
}
