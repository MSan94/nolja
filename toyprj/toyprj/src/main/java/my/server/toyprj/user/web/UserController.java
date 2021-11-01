package my.server.toyprj.user.web;

import my.server.toyprj.user.model.UserModel;
import my.server.toyprj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/test")
    public HashMap<String, Object> Test() throws Exception{
        UserModel model = new UserModel();
        HashMap<String, Object> map = new HashMap<>();
        model = service.getUser(1);
        if(model == null){
            map.put("result", "fail");
            map.put("data","noData");
        }else{
            map.put("result", "success");
            map.put("data",model);
        }
        return map;
    }

}
