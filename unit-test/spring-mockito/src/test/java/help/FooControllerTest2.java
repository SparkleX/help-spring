package help;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class FooControllerTest2 {
	
	@LocalServerPort
    private int port;
	
	@Autowired
    private TestRestTemplate restTemplate;

	@MockBean
	private FooService1 service;

	@Test
	public void findAll() throws Exception
	{
		BDDMockito.given(this.service.function1("1","2")).willReturn("3");

		ResponseEntity<String> response = restTemplate.getForEntity(
				new URL("http://localhost:" + port + "/test/1/2").toString(), String.class);
	        assertEquals("3", response.getBody());
	}
}
