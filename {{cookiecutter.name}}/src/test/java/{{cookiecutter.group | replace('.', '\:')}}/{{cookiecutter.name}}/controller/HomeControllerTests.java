package {{cookiecutter.group}}.{{cookiecutter.name}}.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HomeControllerTests {

	@Test
	public void home__onSuccess_returnsHelloWorld() throws Exception {
        HomeController homeController = new HomeController();
        assertEquals("Hello world", homeController.home());
    }
}
