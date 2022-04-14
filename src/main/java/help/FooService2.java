package help;

import org.springframework.stereotype.Service;

@Service
public class FooService2 {

	public String function2(String p1, String p2) {
		
		return p1 + "-" + p2;
	}

}
