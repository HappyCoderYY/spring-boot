package org.corgiking;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class AppTest {

	private MockMvc mvc;

	public void setUp() {
		mvc = MockMvcBuilders.standaloneSetup(new Application()).build();
	}

	@Test
	public void hello() throws Exception {
	mvc.perform(MockMvcRequestBuilders.get("/hello") .accept(MediaType.
	APPLICATION_JSON))
	.andExpect(status() .isOk())
	. andExpect (content() . string (equalTo ("Hello World")));
	}

}
