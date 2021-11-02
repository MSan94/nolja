package my.server.toyprj.user.web;

import my.server.toyprj.user.model.UserModel;
import my.server.toyprj.user.service.UserService;
import org.mindrot.jbcrypt.BCrypt;
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
    @GetMapping("/test")
    public void Test() throws Exception{
        String salt = BCrypt.gensalt(10);
        service.insertHash(salt);

    }

    /** 해쉬값 가져오기 **/


    /** 로그인 **/
    @PostMapping("/select/user")
    public HashMap<String, Object> selectUser(@RequestParam("id") String id, @RequestParam("pw") String pw) throws Exception {
        HashMap<String, Object> map = new HashMap<>();
        UserModel entity = new UserModel();
        entity.setUserName(id);
        String hash = service.getHash();
        String userpw = service.getId(id);
        System.out.println("결과 : " + BCrypt.checkpw(pw,userpw));
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
    public HashMap<String, Object> insertUser(
            @RequestParam("id") String id,
            @RequestParam("pw") String pw,
            @RequestParam("email") String email,
            @RequestParam("nick") String nick
    )throws Exception{
        UserModel entity = new UserModel();
        HashMap<String, Object> map = new HashMap<>();
        String hash = service.getHash();
        String bCryptPw = BCrypt.hashpw(pw,hash);
        System.out.println("hash : " + hash + " / pw : " + pw + " / 결과 : " + bCryptPw);
        entity.setUserName(id);
        entity.setUserPassWord(bCryptPw);
        entity.setUserEmail(email);
        entity.setUserNick(nick);
        int result = service.insertUser(entity);
        map.put("result", result);

        return map;
    }
}
