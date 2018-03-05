package com.revature.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Users {
	@Id
	@Column(name="USER_ID")
	@SequenceGenerator(name="USERID_SEQ", sequenceName="USERID_SEQ")
	@GeneratedValue(generator="USERID_SEQ", strategy=GenerationType.AUTO)
	private int userid;
	
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String user_email;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="ROLE_ID")
	private int user_role;
	private Double wage;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="USER_ID")
	private int employer_id;
	
	private Double debt;
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int userid, String username, String password, String first_name, String last_name, String user_email,
			int user_role, Double wage, int employer_id, Double debt) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.user_email = user_email;
		this.user_role = user_role;
		this.wage = wage;
		this.employer_id = employer_id;
		this.debt = debt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((debt == null) ? 0 : debt.hashCode());
		result = prime * result + employer_id;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((user_email == null) ? 0 : user_email.hashCode());
		result = prime * result + user_role;
		result = prime * result + userid;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + ((wage == null) ? 0 : wage.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		if (debt == null) {
			if (other.debt != null)
				return false;
		} else if (!debt.equals(other.debt))
			return false;
		if (employer_id != other.employer_id)
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (user_email == null) {
			if (other.user_email != null)
				return false;
		} else if (!user_email.equals(other.user_email))
			return false;
		if (user_role != other.user_role)
			return false;
		if (userid != other.userid)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (wage == null) {
			if (other.wage != null)
				return false;
		} else if (!wage.equals(other.wage))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", first_name="
				+ first_name + ", last_name=" + last_name + ", user_email=" + user_email + ", user_role=" + user_role
				+ ", wage=" + wage + ", employer_id=" + employer_id + ", debt=" + debt + "]";
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public int getUser_role() {
		return user_role;
	}
	public void setUser_role(int user_role) {
		this.user_role = user_role;
	}
	public Double getWage() {
		return wage;
	}
	public void setWage(Double wage) {
		this.wage = wage;
	}
	public int getEmployer_id() {
		return employer_id;
	}
	public void setEmployer_id(int employer_id) {
		this.employer_id = employer_id;
	}
	public Double getDebt() {
		return debt;
	}
	public void setDebt(Double debt) {
		this.debt = debt;
	}
	
	
}
