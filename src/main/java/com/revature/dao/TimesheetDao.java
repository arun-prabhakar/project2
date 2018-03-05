package com.revature.dao;

import com.revature.entities.Reimbursement;
import com.revature.entities.Status;
import com.revature.entities.UserRole;
import com.revature.entities.Users;

public interface TimesheetDao {

	Users saveUser(Users u);

	Users getById(int id);

	Reimbursement getReimbursementById(int id);

	Status getStatusById(int id);

	UserRole getRoleById(int id);

	Reimbursement saveReimbursement(Reimbursement r);

	UserRole loadRoleById(int id);
	
}
