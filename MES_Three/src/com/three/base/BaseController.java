package com.three.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class BaseController {

	@RequestMapping("{goalPage}")
	public String jump(@PathVariable String goalPage) {
		return goalPage;
	}
}
