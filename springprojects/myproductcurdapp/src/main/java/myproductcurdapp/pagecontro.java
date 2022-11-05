package myproductcurdapp;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class pagecontro {
	
	@RequestMapping(value="/added")
public RedirectView added(@ModelAttribute("faculty")Faculty f) {
		hiberconf h=new hiberconf();
	h.save(f);
	RedirectView r=new RedirectView();
	r.setUrl("home");
	return r;
	}
	@RequestMapping(value="/adduser")
public ModelAndView adduser() {
		
	ModelAndView m= new ModelAndView();
	m.setViewName("adduser");
	return m;
}
	@RequestMapping(value="/home")
	public ModelAndView home() {
	
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Faculty.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Query q=s.createQuery("from Faculty");
		List<Faculty> f=q.list();
		t.commit();
		ModelAndView m= new ModelAndView();
		m.setViewName("home");
		m.addObject("faculty",f);
		return m;
	}
	@RequestMapping(value="/delete/{fid}")
	public RedirectView delete(@PathVariable("fid")int id)
	{
		hiberconf h=new hiberconf();
		Faculty f=h.get(id);
		h.delete(f);
		RedirectView r=new RedirectView();
		r.setUrl("/myproductcurdapp/home");
		return r;
		
		
		
	}
	@RequestMapping(value="/update/{fid}")
	public ModelAndView update(@PathVariable("fid")int id) {
		
		hiberconf h=new hiberconf();
		Faculty f=h.get(id);
		ModelAndView m=new ModelAndView();
		m.setViewName("update");
		m.addObject("name",f.getFacname());
		m.addObject("id",f.getId());
		m.addObject("dept",f.getFacdep());
		m.addObject("sub",f.getFacsub());
		return m;
}
	@RequestMapping(value="/updated")
	public RedirectView updated(@ModelAttribute("faculty")Faculty f) {
		hiberconf h=new hiberconf();
		h.update(f);
		RedirectView r=new RedirectView();
		r.setUrl("home");
		return r;
	}
	
}