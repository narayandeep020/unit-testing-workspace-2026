package com.admin;

public class AdminDao {

	public boolean save(AdminDto dto) {
        // Normally database logic here
        if(dto == null || dto.getName() == null) {
            return false;
        }
        return true; // assume save success
    }
}
