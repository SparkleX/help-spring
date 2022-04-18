package help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FooService2Impl implements FooService2{
	
	@Autowired
	FooService1 svc1;

	public String function2(String p1, String p2) {
		
		return p1 + "-" + p2;
	}

}
