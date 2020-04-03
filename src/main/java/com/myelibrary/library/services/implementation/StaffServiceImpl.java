package com.myelibrary.library.services.implementation;

import com.myelibrary.library.model.Staff;
import com.myelibrary.library.repository.StaffRepository;
import com.myelibrary.library.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StaffServiceImpl implements StaffService {
    @Autowired
    StaffRepository staffRepository;

    @Override
    public Staff saveStaff(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public List<Staff> findAllById(Iterable<Long> staffId) {
        return staffRepository.findAllById(staffId);
    }

    @Override
    public List<Staff> findAll() {
        return staffRepository.findAll();
    }

    @Override
    public void deleteInBatch(Iterable<Long> staffId) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Staff getOneStaffMember(Long staffId) {
        return staffRepository.getOne(staffId);
    }
}
