package com.winter.app.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("list")
	public void list(Model model)throws Exception{
		
		model.addAttribute("list", productService.list());
	}
	
	@GetMapping("detail")
	public void detail(ProductVO productVO, Model model)throws Exception{
		 model.addAttribute("vo", productService.detail(productVO));
	}
	
	@GetMapping("add")
	public String add()throws Exception{
		
		return "products/product_form";
	}
	
	@GetMapping("update")
	public String update()throws Exception{
		
		return "products/product_form";
	}

}
