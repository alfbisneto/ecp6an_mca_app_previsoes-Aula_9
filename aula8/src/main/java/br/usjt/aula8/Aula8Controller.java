package br.usjt.aula8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Aula8Controller {
	
	@GetMapping("/clima")
	public String clima() {
		return "Aula8";
	}

}
