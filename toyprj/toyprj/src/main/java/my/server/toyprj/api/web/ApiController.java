package my.server.toyprj.api.web;

import my.server.toyprj.api.service.MailModel;
import my.server.toyprj.api.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ApiController {

    @Autowired
    private MailService service;

    @RequestMapping("/testApi")
    public String test(){
        return "Hello";
    }

    /** 인증메일 **/
    @RequestMapping("/requestMail")
    public HashMap<String, Object> requestMail(@RequestParam("receiverMail") String receiverMail){
        MailModel entity = new MailModel();
        StringBuilder sb = new StringBuilder();
        HashMap<String, Object> map = new HashMap<>();

        for(int i=0; i<6; i++) {
            int randNum = (int) ((Math.random() * 10000) % 10);
            sb.append(String.valueOf(randNum));
        }
        String makeString = sb.toString();
        entity.setReceiverMail(receiverMail);
        entity.setMessage(makeString);
        entity.setSubject("Nolja 인증메일 입니다.");
        service.sendMail(entity);
        map.put("mailString", makeString);
        return map;
    }


}
