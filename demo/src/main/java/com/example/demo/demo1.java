package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Car")
public class demo1 {
	@Id
	private int cid;
	private String cname;
	private int cmodel;
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
	public int getCmodel() {
		return cmodel;
	}
	public void setCmodel(int cmodel) {
		this.cmodel = cmodel;
	}
	

}
