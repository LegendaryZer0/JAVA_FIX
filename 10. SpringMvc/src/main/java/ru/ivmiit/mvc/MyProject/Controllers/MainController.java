package ru.ivmiit.mvc.MyProject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/url")
public class MainController {
    @GetMapping
    public String getCountryPicture(){
        return null; // казать на вьюшку
    }

}

