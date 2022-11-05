package myfirst.crudapp.aftabnadeem;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class controller {
	@Autowired
	private prodrepo pr;
	@RequestMapping("home")
	public ModelAndView home() {
	List<product>p=pr.findAll();
	ModelAndView m=new ModelAndView();
	m.setViewName("home");
	m.addObject("product",p);
	return m;
	}
	@RequestMapping("adduser")
	public String adduser() {
		return "adduser";
	}
	@RequestMapping("added")
	public RedirectView added(@ModelAttribute("product")product p) {
		pr.save(p);
		RedirectView r=new RedirectView();
		r.setUrl("home");
		return r;
	}
	@RequestMapping("edit/{pid}")
	public ModelAndView edit(@PathVariable("pid")int id) {
		product p=pr.getById(id);
		ModelAndView m=new ModelAndView();
		m.setViewName("edit");
		m.addObject("product", p);
		return m;
	}
	@RequestMapping("delete/{pid}")
	public RedirectView delete(@PathVariable("pid")int id,HttpServletRequest req) {
		pr.deleteById(id);
		RedirectView r=new RedirectView();
		r.setUrl(req.getContextPath() + "/home");
		return r;
	}

}
