package com.myelibrary.library.services;
import com.myelibrary.library.model.Address;

import java.util.List;

public interface AddressService {
    Address saveAddress(Address address);

    List<Address> findAllById(Iterable<Long> addressId);

    List<Address> findAll();

    void deleteInBatch(Iterable<Long> addressId);

    void deleteAllInBatch();

    Address getOneAddress(Long addressId);
}
