package org.spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
public class HelloWorldController {
	@RenderMapping("/HelloWorld")
	public String helloWorldSample() {
		return  "HelloWorld";
	}
	@RenderMapping("/")
	public String index() {
		return  "index";
	}

}
