package org.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SpringController {
	
@RequestMapping("/welcome")	
 public String welcome() {
return "NewFile";
}

}
