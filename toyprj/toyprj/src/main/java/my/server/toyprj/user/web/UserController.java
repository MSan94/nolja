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
    /** DB 테스트 **/
    @PostMapping("/test")
    public HashMap<String, Object> Test(@RequestParam("userIdx") int userIdx) throws Exception{
        UserModel model = new UserModel();
        HashMap<String, Object> map = new HashMap<>();
        return map;
    }

    /** 로그인 **/
    @PostMapping("/select/user")
    public HashMap<String, Object> selectUser(@RequestParam("id") String id, @RequestParam("pw") String pw) throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        UserModel entity = new UserModel();
        entity.setUserName(id);
        entity.setUserPassWord(pw);
        int result = service.selectUser(entity);
        if(result < 1){
            map.put("result", "fail");
        }else{
            map.put("result", "success");
            map.put("data",entity);
        }
        return map;
    }

    /** 아이디 중복 체크 **/
    @PostMapping("/select/id")
    public HashMap<String, Object> selectId(@RequestParam("id") String id) throws Exception{
        HashMap<String,Object> map = new HashMap<>();
        int result = service.selectId(id);
        map.put("result",result);
        return map;
    }

    /** 회원가입 **/
    @PostMapping("/insert/user")
    public HashMap<String, Object> insertUser(@RequestParam UserModel model){
        HashMap<String, Object> map = new HashMap<>();



        return map;
    }
}
