package com.revature.launcher;

import org.apache.log4j.Logger;

import com.revature.dao.TimesheetDao;
import com.revature.dao.TimesheetHibernate;
import com.revature.entities.UserRole;
import com.revature.entities.Users;

public class TimesheetLauncher {
	private static Logger log = Logger.getRootLogger();
	private static TimesheetDao td = new TimesheetHibernate();
	
	public static void main(String[] args) {
		//log.info(td.getById(21));
		UserRole us = td.getRoleById(0);
		Users x = td.getById(1);
		System.out.println("GREGWTBIADKVAD<SL<VA");
		Users u = new Users(33, "brady", "l", "brad", "lass", "bl@gmail.com", us, 10.0, x, 2000.0);
		u = td.saveUser(u);
		//log.trace(u);
		//log.info(td.getStatusById(0));
		//log.info(td.getReimbursementById(1));
		//log.info(td.getRoleById(0));
		
	
	}

}
