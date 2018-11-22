package com.three.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.three.model.ProductModel;
import com.three.service.ProductService;

/**
 * productµÄcontroller²ã
 * 
 * @author Administrator
 * 
 */
@Controller
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;

	@RequestMapping("findProductAll")
	public String findProductAll(Model m) {
		List<ProductModel> pmodel = productService.findProductAll();
		m.addAttribute("pmodel", pmodel);
		return "productList";
	}

	@RequestMapping("findByCondition")
	public String findByCodeOrDesOrSource(String itemCode, String description, String crustSource, Model m) {
		ProductModel pm = new ProductModel();
		pm.setItemCode(itemCode);
		pm.setDescription(description);
		pm.setCrustSource(crustSource);
		List<ProductModel> pmodel = productService.findByCodeOrDesOrSource(pm);
		System.out.println(pmodel);
		m.addAttribute("pmodel", pmodel);
		return "productList";

	}

	@RequestMapping(value = "doadd", method = RequestMethod.POST)
	public String doadd(ProductModel pm) {
		productService.add(pm);
		System.out.println("#####");
		return "redirect:/product/findProductAll";
	}

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(ProductModel pm) {
		return "productAdd";
	}

	@RequestMapping("del/{itemId}")
	public String del(@PathVariable int itemId) {
		productService.del(itemId);
		System.out.println("#####");
		return "redirect:/product/findProductAll";
	}

	@RequestMapping("update")
	public String update(ProductModel pm, Model m) {
		productService.update(pm);
		return "redirect:/product/findProductAll";

	}

	@RequestMapping("findByitemId/{itemId}")
	public String findByitemId(@PathVariable int itemId, ProductModel pm, Model m) {
		pm = productService.findByitemId(itemId);
		m.addAttribute("pmodel", pm);
		return "productUpdate";

	}
}
