package test2.springbootweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/test")
    public String hello(String word){
        return String.format("Welcome, %s",word);
    }
}
