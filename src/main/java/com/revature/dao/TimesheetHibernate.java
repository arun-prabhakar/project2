package com.revature.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.entities.AdvancePayment;
import com.revature.entities.Reimbursement;
import com.revature.entities.Status;
import com.revature.entities.Timesheet;
import com.revature.entities.UserRole;
import com.revature.entities.Users;
import com.revature.util.SessionUtil;


public class TimesheetHibernate implements TimesheetDao {
	private Logger log = Logger.getRootLogger();
	private SessionUtil su = SessionUtil.getSessionUtil();
	
	@Override
	public Users saveUser(Users u) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		int id = (int) se.save(u); // u is now a persistent object
		log.trace("The generated id is: " + id);
		tx.commit();
		se.close();
		return u;
	}
	
	@Override
	public Reimbursement saveReimbursement(Reimbursement r) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		int id = (int) se.save(r); // u is now a persistent object
		log.trace("The generated id is: " + id);
		tx.commit();
		se.close();
		return r;
	}
	
	@Override
	public Timesheet saveTimesheet(Timesheet t) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		int id = (int) se.save(t); // u is now a persistent object
		log.trace("The generated id is: " + id);
		tx.commit();
		se.close();
		return t;
	}
	
	@Override
	public AdvancePayment saveAdvancePayment(AdvancePayment a) {
		Session se = su.getSession();
		Transaction tx = se.beginTransaction();
		int id = (int) se.save(a); // u is now a persistent object
		log.trace("The generated id is: " + id);
		tx.commit();
		se.close();
		return a;
	}
	
	
	@Override
	public Reimbursement getReimbursementById(int id) {
		Session se = su.getSession();
		Reimbursement r = (Reimbursement) se.get(Reimbursement.class, id);
		se.close();
		return r;
	}
	
	@Override
	public Users getById(int id) {
		Session se = su.getSession();
		Users u = (Users) se.get(Users.class, id);
		se.close();
		return u;
	}
	
	@Override
	public Status getStatusById(int id) {
		Session se = su.getSession();
		Status s = (Status) se.get(Status.class, id);
		se.close();
		return s;
	}
	
	@Override
	public UserRole getRoleById(int id) {
		Session se = su.getSession();
		UserRole ur = (UserRole) se.get(UserRole.class, id);
		se.close();
		return ur;
	}
	
	@Override
	public UserRole loadRoleById(int id) {
		Session se = su.getSession();
		UserRole ur = (UserRole) se.load(UserRole.class, id);
		se.close();
		return ur;
	}
	
	
	
}
