package com.revature.launcher;

import java.sql.Timestamp;

import org.apache.log4j.Logger;

import com.revature.dao.TimesheetDao;
import com.revature.dao.TimesheetHibernate;
import com.revature.entities.Status;
import com.revature.entities.Timesheet;
import com.revature.entities.Users;

public class TimesheetLauncher {
	private static Logger log = Logger.getRootLogger();
	private static TimesheetDao td = new TimesheetHibernate();
	
	public static void main(String[] args) {
		//log.info(td.getById(21));
//		UserRole us = td.getRoleById(0);
//		Users x = td.getById(25);
		System.out.println("GREGWTBIADKVAD<SL<VA");
		//Users u = new Users(22, "brady", "l", "brad", "lass", "bl@gmail.com", us, 10.0, x, 2000.0);
		//u = td.saveUser(u);
		Users y = td.getById(25);
		Users z = td.getById(26);
		Timestamp ts1 = Timestamp.valueOf("2007-09-23 10:10:10.00");
		Timestamp ts2 = Timestamp.valueOf("2000-02-23 10:10:10.00");
		Timestamp ts3 = Timestamp.valueOf("2007-09-24 11:11:11.00");
		Status st = new Status(0, "Pending");
		//Integer a = new Integer(0);
//		Reimbursement re = new Reimbursement(1, 500.0, ts1, ts2, "New laptop", z, y, st, "Pending");
//		log.info(re);
//		log.info(td.saveReimbursement(re));
		Timesheet ts = new Timesheet(0, z, ts2, ts1, ts3, 5.0, st, y, "HELLO", 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0);
		log.info(td.saveTimesheet(ts));
		//log.trace(u);
		//log.info(td.getStatusById(0));
		//log.info(td.getReimbursementById(1));
		//log.info(td.getRoleById(0));
		
	
	}

}
