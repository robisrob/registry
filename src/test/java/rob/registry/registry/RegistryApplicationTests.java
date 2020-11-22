package rob.registry.registry;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

@SpringBootTest
class RegistryApplicationTests {

	@Test
	void contextLoads() {
		try {
			new RestTemplate().exchange("http://localhost:5432", HttpMethod.GET, null, String.class);

		} catch(Exception e) {
			System.out.println("robrobrob" + e);
		}

	}
}
