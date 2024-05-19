package com.solvedcard.core.services.impl;

import com.solvedcard.beans.dtos.StaffDTO;
import com.solvedcard.beans.entities.Staff;
import com.solvedcard.core.mapper.StaffMapper;
import com.solvedcard.core.repositories.StaffRepository;
import com.solvedcard.core.services.StaffService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {
    private final Logger logger = LoggerFactory.getLogger(StaffServiceImpl.class);

    private final StaffRepository staffRepository;
    private final StaffMapper staffMapper;

    @Autowired
    public StaffServiceImpl(StaffRepository staffRepository, StaffMapper staffMapper) {
        this.staffRepository = staffRepository;
        this.staffMapper = staffMapper;
    }

    @Override
    public List<Staff> getAllStaffs() {
        logger.info("Getting all staffs");
        return staffRepository.findAll();
    }

    @Override
    public Staff getStaffById(String id) {
        logger.info("Getting staff by id: {}", id);
        return staffRepository.findById(id).orElse(null);
    }

    @Override
    public Staff createStaff(StaffDTO staffDTO) {
        logger.info("Creating staff: {}", staffDTO);
        Staff staff = staffMapper.convertToEntity(staffDTO);
        return staffRepository.save(staff);
    }

    @Override
    public Staff updateStaff(String id, StaffDTO staffDTO) {
        logger.info("Updating staff: {}", id);
        Staff staff = staffRepository.findById(id).orElse(null);
        if (staff != null) {
            staff = staffMapper.convertToEntity(staffDTO);
            staff.setId(id);
            return staffRepository.save(staff);
        }
        return null;
    }

    @Override
    public void deleteStaff(String id) {
        logger.info("Deleting staff: {}", id);
        staffRepository.deleteById(id);
    }
}
