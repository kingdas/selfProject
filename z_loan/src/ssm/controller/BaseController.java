package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class BaseController {

	@RequestMapping("{page}")
	public String relay(@PathVariable String page) {
		return page;
	}
}
