package com.revature.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Reimbursement {
	@Id
	@Column(name="REIMB_ID")
	@SequenceGenerator(name="REIMBID_SEQ", sequenceName="REIMBID_SEQ")
	@GeneratedValue(generator="REIMBID_SEQ", strategy=GenerationType.AUTO)
	private int userid;
	
	

}
