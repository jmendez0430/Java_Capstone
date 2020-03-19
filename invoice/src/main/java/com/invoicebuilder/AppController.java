/**
 * 
 */
package com.invoicebuilder;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * @author jmens
 *
 */
@Controller
public class AppController {
	
	@Autowired
	private InvoiceService service;
	
	@RequestMapping("/")
	public String viewHomePage(Model model) {
		List<Job> listJobs = service.listAll();
		model.addAttribute("listJobs", listJobs);
		
		return "index";
			
	}
	
	@RequestMapping("/new")
	public String showNewJobForm(Model model) {
		Job	job = new Job();
		model.addAttribute("job", job);
		
		return "new_job";
		
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveJob(@ModelAttribute("job") Job job) {
		service.save(job);
		
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{code}")
	public ModelAndView showEditJobForm(@PathVariable(name = "code") Long code) {
		ModelAndView mav = new ModelAndView("edit_job");
		
		Job job = service.get(code);
		mav.addObject("job", job);
		
		return mav;
		
	}
	
	@RequestMapping("/delete/{code}")
	public String deleteJob(@PathVariable(name = "code")Long code) {
		service.delete(code);
		
		return "redirect:/";
		
		
	}
}
