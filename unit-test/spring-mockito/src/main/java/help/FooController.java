package help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {
	
	@Autowired
	FooService1 service;
	
	@GetMapping("/test/{p1}/{p2}")
	public String findAll(@PathVariable String p1, @PathVariable String p2 ) {
		String rt = service.function1(p1, p2);
		return rt;
	}
}
