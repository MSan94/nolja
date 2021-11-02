package my.server.toyprj.user.web;

import my.server.toyprj.user.model.UserModel;
import my.server.toyprj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/test")
    public HashMap<String, Object> Test(@RequestParam("userIdx") int userIdx) throws Exception{
        UserModel model = new UserModel();
        HashMap<String, Object> map = new HashMap<>();
        model = service.getUser(userIdx);
        if(model == null){
            map.put("result", "fail");
            map.put("data","noData");
        }else{
            map.put("result", "success");
            map.put("data",model);
        }
        return map;
    }

    @PostMapping("/select/user")
    public HashMap<String, Object> selectUser(@RequestParam("id") String id, @RequestParam("pw") String pw) throws Exception {
        System.out.println("호출"+ " " + id + " " + pw);
        HashMap<String, Object> map = new HashMap<>();
        UserModel entity = new UserModel();
        entity.setUserName(id);
        entity.setUserPassWord(pw);
        System.out.println("호출2"+ " " + entity.getUserName() + " " + entity.getUserPassWord());
        int result = service.selectUser(entity);
        System.out.println("결과 : " + result);

        if(result < 1){
            map.put("result", "fail");
        }else{
            map.put("result", "success");
            map.put("data",entity);
        }
        return map;
    }

    @PostMapping("/insert/user")
    public HashMap<String, Object> insertUser(@RequestParam UserModel model){
        HashMap<String, Object> map = new HashMap<>();



        return map;
    }
}
