package listaurant.controller;

import listaurant.common.ListaurantException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController extends ProxyController {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String execute(Model model) throws ListaurantException {
		return "home";
	}

}
