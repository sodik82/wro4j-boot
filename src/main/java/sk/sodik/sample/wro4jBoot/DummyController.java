package sk.sodik.sample.wro4jBoot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Just dummy controller providing sample HTML.
 * 
 * @author sodik
 */
@Controller
public class DummyController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
