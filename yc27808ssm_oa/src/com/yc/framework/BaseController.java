package com.yc.framework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class BaseController {

	/**
	 * 统一处理请求访问页面
	 * 
	 * @param page
	 *            要请求页面
	 * @return
	 */
	@RequestMapping("{page}")
	public String openPage(@PathVariable String page) {
		return page;
	}
}
