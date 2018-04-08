package springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import springframework.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @Autowired // not necessary
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}