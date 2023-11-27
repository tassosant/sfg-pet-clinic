package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping({"","/","index","index.html"}) //params mean that if I request with root slash, or nothing or html or html.index it will return the index.html
    public String index(){
        return "index";
    }
}
