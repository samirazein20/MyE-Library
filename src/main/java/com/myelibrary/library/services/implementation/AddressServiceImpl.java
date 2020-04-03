package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.Address;
import com.myelibrary.library.repository.AddressRepository;
import com.myelibrary.library.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> findAllById(Iterable<Long> addressId) {
        return addressRepository.findAllById(addressId);
    }

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> addressId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Address getOneAddress(Long addressId) {
        return addressRepository.getOne(addressId);
    }
}
