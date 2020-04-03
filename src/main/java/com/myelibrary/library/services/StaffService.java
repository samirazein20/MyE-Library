package com.myelibrary.library.services;

import com.myelibrary.library.model.Staff;

import java.util.List;

public interface StaffService {

    Staff saveStaff(Staff staff);

    List<Staff> findAllById(Iterable<Long> staffId);

    List<Staff> findAll();

    void deleteInBatch(Iterable<Long> staffId);

    void deleteAllInBatch();

    Staff getOneStaffMember(Long staffId);
}
