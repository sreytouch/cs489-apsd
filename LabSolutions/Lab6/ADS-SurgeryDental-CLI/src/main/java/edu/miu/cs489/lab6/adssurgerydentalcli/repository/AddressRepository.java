package edu.miu.cs489.lab6.adssurgerydentalcli.repository;

import edu.miu.cs489.lab6.adssurgerydentalcli.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository  extends JpaRepository<Address, Integer> {
}
