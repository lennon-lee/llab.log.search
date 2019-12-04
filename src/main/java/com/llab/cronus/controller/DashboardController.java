package com.llab.cronus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = { "/dashboard" })
public class DashboardController {

	@RequestMapping(value = { "/system" })
	public String system() {
		return "/dashboard/system";
	}

}
