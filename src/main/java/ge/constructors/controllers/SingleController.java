package ge.constructors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SingleController {
    @GetMapping("/single")
    public String single(){
        return "single";
    }
}
