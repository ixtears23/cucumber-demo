package junseok.snr.cucumberdemo;

import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CucumberSpringConfiguration {

    @Test
    void nothing() {
        System.out.println(">>>>> nothing");
    }
}
