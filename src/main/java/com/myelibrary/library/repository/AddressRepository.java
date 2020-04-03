package com.myelibrary.library.repository;

import com.myelibrary.library.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
