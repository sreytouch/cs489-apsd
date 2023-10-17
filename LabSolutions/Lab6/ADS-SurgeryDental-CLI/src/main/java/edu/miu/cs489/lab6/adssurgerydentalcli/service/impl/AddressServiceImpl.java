package edu.miu.cs489.lab6.adssurgerydentalcli.service.impl;

import edu.miu.cs489.lab6.adssurgerydentalcli.model.Address;
import edu.miu.cs489.lab6.adssurgerydentalcli.repository.AddressRepository;
import edu.miu.cs489.lab6.adssurgerydentalcli.service.AddressService;

public class AddressServiceImpl implements AddressService {

    private AddressRepository addressRepository;

    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address addNewAddress(Address newAddress) {
        return addressRepository.save(newAddress);
    }
}
