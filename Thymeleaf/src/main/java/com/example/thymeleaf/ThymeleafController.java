package com.example.thymeleaf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ThymeleafController {
	
	 /* http://localhost:8080 */
	 @GetMapping("/")
	    @ResponseBody
	    public String home() {        
	        return "Hi There! Welcome to thymeleaf attributes!";
	    }     	
	 /* http://localhost:8080/demo */
	  @GetMapping("/demo")
	    public String demo(Model model) {
	        model.addAttribute("temp", "Always display this message!");
	        model.addAttribute("flag",true);
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("1","Ram","100000"));
	        employees.add(new Employee("2","Sita","200000"));
	        employees.add(new Employee("3","Laxmana","300000"));
	        employees.add(new Employee("4","Hanuman","400000"));
	        model.addAttribute("employees", employees);

	        return "demo";
	    }
	  /* http://localhost:8080/switch-case */
	  
	  @GetMapping("/switch-case")
	    public String switchExample(Model model) {
	        User user = new User("Kumar", "kumar@gmail.com", "ADMIN");
	        model.addAttribute("user", user);
	        return "switch-case";
	    }
}
