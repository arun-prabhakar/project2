package com.revature.entities;

import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="ADV_PAYMENT")
public class AdvancePayment {
	
	@Id
	@Column(name="ADV_ID")
	@SequenceGenerator(name="ADVID_SEQ", sequenceName="ADVID_SEQ")
	@GeneratedValue(generator="ADVID_SEQ", strategy=GenerationType.AUTO)
	private Integer advid;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL) // Remove Cascade
	@JoinColumn(name="USER_ID")
	private int author_id;
	
	private double amount;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL) // Remove Cascade
	@JoinColumn(name="STATUS_ID")
	private int status;
	private Timestamp submit_date;
	private Timestamp resolve_date;
	
	@ManyToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL) // Remove Cascade
	@JoinColumn(name="USER_ID")
	private int resolver_id;
	
	private String adv_comment;

	public AdvancePayment(int advid, int author_id, double amount, int status, Timestamp submit_date,
			Timestamp resolve_date, int resolver_id, String adv_comment) {
		super();
		this.advid = advid;
		this.author_id = author_id;
		this.amount = amount;
		this.status = status;
		this.submit_date = submit_date;
		this.resolve_date = resolve_date;
		this.resolver_id = resolver_id;
		this.adv_comment = adv_comment;
	}

	public AdvancePayment() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AdvancePayment [advid=" + advid + ", author_id=" + author_id + ", amount=" + amount + ", status="
				+ status + ", submit_date=" + submit_date + ", resolve_date=" + resolve_date + ", resolver_id="
				+ resolver_id + ", adv_comment=" + adv_comment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adv_comment == null) ? 0 : adv_comment.hashCode());
		result = prime * result + advid;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + author_id;
		result = prime * result + ((resolve_date == null) ? 0 : resolve_date.hashCode());
		result = prime * result + resolver_id;
		result = prime * result + status;
		result = prime * result + ((submit_date == null) ? 0 : submit_date.hashCode());
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
		AdvancePayment other = (AdvancePayment) obj;
		if (adv_comment == null) {
			if (other.adv_comment != null)
				return false;
		} else if (!adv_comment.equals(other.adv_comment))
			return false;
		if (advid != other.advid)
			return false;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (author_id != other.author_id)
			return false;
		if (resolve_date == null) {
			if (other.resolve_date != null)
				return false;
		} else if (!resolve_date.equals(other.resolve_date))
			return false;
		if (resolver_id != other.resolver_id)
			return false;
		if (status != other.status)
			return false;
		if (submit_date == null) {
			if (other.submit_date != null)
				return false;
		} else if (!submit_date.equals(other.submit_date))
			return false;
		return true;
	}

	public int getAdvid() {
		return advid;
	}

	public void setAdvid(int advid) {
		this.advid = advid;
	}

	public int getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getSubmit_date() {
		return submit_date;
	}

	public void setSubmit_date(Timestamp submit_date) {
		this.submit_date = submit_date;
	}

	public Timestamp getResolve_date() {
		return resolve_date;
	}

	public void setResolve_date(Timestamp resolve_date) {
		this.resolve_date = resolve_date;
	}

	public int getResolver_id() {
		return resolver_id;
	}

	public void setResolver_id(int resolver_id) {
		this.resolver_id = resolver_id;
	}

	public String getAdv_comment() {
		return adv_comment;
	}

	public void setAdv_comment(String adv_comment) {
		this.adv_comment = adv_comment;
	}
	
}
