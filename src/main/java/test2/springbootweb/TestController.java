package test2.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String hello(@RequestParam(name = "name", defaultValue = "Test") String word){
        return String.format("Welcome, %s",word);
    }
}
