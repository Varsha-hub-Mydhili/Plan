package com.tms.modal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	int cid;
	@Column
	String cname;
	long phno;
	String address;
	String idproof;
	Customer(){
		
	}
	public Customer(int cid, String cname, long phno, String address, String idproof) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.phno = phno;
		this.address = address;
		this.idproof = idproof;
		
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdproof() {
		return idproof;
	}
	public void setIdproof(String idproof) {
		this.idproof = idproof;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", phno=" + phno + ", address=" + address + ", idproof="
				+ idproof + "]";
	}
	
	

}
