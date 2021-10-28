package my.server.toyprj.api.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @RequestMapping("/testApi")
    public String test(){
        return "Hello";
    }

}
