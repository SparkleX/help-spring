package help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService1 {

	@Autowired
	FooService2 fooService2;
	
	public String function1(String p1, String p2) {
		String rt = fooService2.function2(p1, p2);
		return rt;
	}
}
