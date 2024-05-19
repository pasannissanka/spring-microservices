package com.solvedcard.core.services;

import com.solvedcard.beans.dtos.StaffDTO;
import com.solvedcard.beans.entities.Staff;

import java.util.List;

/**
 * StaffService
 */
public interface StaffService {

    /**
     * Get all staffs
     * @return
     */
    List<Staff> getAllStaffs();

    /**
     * Get staff by id
     * @param id
     * @return
     */
    Staff getStaffById(String id);

    /**
     * Create staff
     * @param staffDTO
     * @return
     */
    Staff createStaff(StaffDTO staffDTO);

    /**
     * Update staff
     * @param staffDTO
     * @return
     */
    Staff updateStaff(String id, StaffDTO staffDTO);

    /**
     * Delete staff
     * @param id
     */
    void deleteStaff(String id);
}
