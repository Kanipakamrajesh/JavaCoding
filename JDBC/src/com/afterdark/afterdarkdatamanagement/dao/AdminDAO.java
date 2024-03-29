package com.afterdark.afterdarkdatamanagement.dao;

import com.afterdark.afterdarkdatamanagement.dto.Admin;

public interface AdminDAO 
{
	String saveAdmin(Admin admin);
	
	Admin adminLogin(String username, String password);

}
