package com.habibi.datasaver;

import javax.persistence.Entity;


import javax.persistence.Id;

@Entity
public class drivers {
	@Id
int driverid;
String drivername;
String driverclass;
	public int getDriverid() {
		return driverid;
	}
	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}
	public String getDrivername() {
		return drivername;
	}
	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}
	public String getDriverclass() {
		return driverclass;
	}
	public void setDriverclass(String driverclass) {
		this.driverclass = driverclass;
	}
	@Override
	public String toString() {
		return "drivers [driverid=" + driverid + ", drivername=" + drivername + ", driverclass=" + driverclass + "]";
	}
	public drivers(int driverid, String drivername, String driverclass) {
		super();
		this.driverid = driverid;
		this.drivername = drivername;
		this.driverclass = driverclass;
	}
	public drivers() {
		super();
		// TODO Auto-generated constructor stub
	}



}
