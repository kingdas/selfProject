package com.yc.framework;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class BaseController {

	/**
	 * ͳһ�����������ҳ��
	 * 
	 * @param page
	 *            Ҫ����ҳ��
	 * @return
	 */
	@RequestMapping("{page}")
	public String openPage(@PathVariable String page) {
		return page;
	}
}
