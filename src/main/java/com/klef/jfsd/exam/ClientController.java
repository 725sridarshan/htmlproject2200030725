package com.klef.jfsd.exam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController 
{
@GetMapping("/")
public String home()
{
	return "index";
}
@GetMapping("test")
public String test(Model model)
{
	model.addAttribute("name","JFSD");
	return "test";
}
@GetMapping("viewall")
public String viewall(Model model)
{
	List<Product> products=new ArrayList<Product>();
	products.add(new Product(1,"BOOK",100));
	products.add(new Product(2,"MILK",35));
	products.add(new Product(3,"SAREE",2000));
	model.addAttribute("products",products);
	return "viewall";
}
}
