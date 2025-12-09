package cat.itacademy.s04.t02.n01.controllers;

import cat.itacademy.s04.t02.n01.services.FruitService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(FruitController.class)
public class FruitControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@MockitoBean
	private FruitService fruitService;
	@Autowired
	private ObjectMapper objectMapper;

}
