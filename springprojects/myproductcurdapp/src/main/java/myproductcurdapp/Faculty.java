package myproductcurdapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Faculty {
	@Id
private int id;
private String facname;
private String facsub;
private String facdep;
public Faculty(int id, String facname, String facsub, String facdep) {
	super();
	this.id = id;
	this.facname = facname;
	this.facsub = facsub;
	this.facdep = facdep;
}
public Faculty() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFacname() {
	return facname;
}
public void setFacname(String facname) {
	this.facname = facname;
}
public String getFacsub() {
	return facsub;
}
public void setFacsub(String facsub) {
	this.facsub = facsub;
}
public String getFacdep() {
	return facdep;
}
public void setFacdep(String facdep) {
	this.facdep = facdep;
}
@Override
public String toString() {
	return "Faculty [id=" + id + ", facname=" + facname + ", facsub=" + facsub + ", facdep=" + facdep + "]";
}

}
