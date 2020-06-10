package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private CarService carService;

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "hello";
	}

	@RequestMapping(value = "cars", method = RequestMethod.GET)
	public String printCars(@RequestParam(value = "locale", required = false,
			defaultValue = "ru") String locale, ModelMap model){
//		Locale locale1 = new Locale.Builder().setLanguage("en").build();
//		Locale locale2 = new Locale.Builder().setLanguage("ru").setScript("Cyrl").build();
		List<String> messages = new ArrayList<>();
		if (locale.equals("ru")) {
			messages.add("МАШИНЫ");
		}
		if (locale.equals("en")) {
			messages.add("CARS");
		}
		List<Car> carList = carService.getAllCars();
		model.addAttribute("messages", messages);
		model.addAttribute("carList", carList);
		return "cars";
	}

}