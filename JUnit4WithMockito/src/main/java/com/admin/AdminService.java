package com.admin;

public class AdminService {

	private AdminDao adminDao;

	public AdminService(AdminDao adminDao) {
		super();
		this.adminDao = adminDao;
	}
	public boolean saveAdmin(AdminDto dto) {
		return adminDao.save(dto);
	}
}
