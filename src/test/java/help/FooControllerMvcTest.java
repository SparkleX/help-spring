package help;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@WebMvcTest(FooController.class)
public class FooControllerMvcTest {
	@Autowired
	private MockMvc mvc;

	@MockBean
	private FooService1 service;

	@Test
	public void findAll() throws Exception
	{
		BDDMockito.given(this.service.function1("1","2")).willReturn("3");
		
		this.mvc.perform(MockMvcRequestBuilders.get("/test/1/2")
				.accept(MediaType.TEXT_PLAIN))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andExpect(MockMvcResultMatchers.content().string("3"));
	}
}
