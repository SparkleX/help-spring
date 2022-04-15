package help;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
public class FooService1Test {
	@Mock
    FooService2 service2;
	
	@InjectMocks
	FooService1 service1;
	
    @Test
    void function1() {
    	Mockito.when(service2.function2("1", "2")).thenReturn("4");
    	String rt = service1.function1("1", "2");
        assertEquals("4", rt);
    }
}
