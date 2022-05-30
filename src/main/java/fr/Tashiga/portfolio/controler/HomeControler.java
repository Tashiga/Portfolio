package fr.Tashiga.portfolio.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeControler {

    public HomeControler(){
        System.out.println("Hello");
    }

}
