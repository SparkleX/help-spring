package help;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class FooService2Test {
	@Autowired
    FooService2 service2;


    @Test
    void function2() {
    	String rt = service2.function2("1", "2");
        assertEquals("1-2", rt);
    }
}
