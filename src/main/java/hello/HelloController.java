package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);
    @RequestMapping("/")
    public String index() {
        log.info("logger hi");
        return "Greetings from Spring Boot! ci in johnkins";
    }
    
}
