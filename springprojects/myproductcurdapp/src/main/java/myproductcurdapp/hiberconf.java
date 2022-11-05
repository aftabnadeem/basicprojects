package myproductcurdapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hiberconf {
Configuration cfg=new Configuration().configure().addAnnotatedClass(Faculty.class);
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Transaction t=null;
public void save(Faculty f) {
	t=s.beginTransaction();
	s.save(f);
	t.commit();
}
public Faculty get(int id) {
	Faculty f=new Faculty();
	t=s.beginTransaction();
	f=(Faculty)s.get(Faculty.class,id);
	t.commit();
	return f;
}


public void delete(Faculty f) {
	t=s.beginTransaction();
	s.remove(f);
	t.commit();
}
public void update(Faculty f) {
	t=s.beginTransaction();
	s.update(f);
	t.commit();
	
}
}
