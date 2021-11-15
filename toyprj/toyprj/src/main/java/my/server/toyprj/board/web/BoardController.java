package my.server.toyprj.board.web;

import my.server.toyprj.board.model.BoardModel;
import my.server.toyprj.board.service.BoardService;
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
public class BoardController {

    @Autowired
    BoardService service;

    /** 글 등록 **/
    @PostMapping("/insert/board")
    public HashMap<String, Object> insertBoard(
            @RequestParam("writer") String writer,
            @RequestParam("subject") String subject,
            @RequestParam("gender") String gender,
            @RequestParam("imgfile") String imgfile) throws Exception {
        System.out.println("들어옴");
        HashMap<String, Object> map = new HashMap<>();
        BoardModel entity = new BoardModel();
        entity.setWriter(writer);
        entity.setSubject(subject);
        entity.setGender(gender);
        entity.setImgfile(imgfile);
        int result = service.insertBoard(entity);
        if(result > 0){
            map.put("result","1");
        }else{
            map.put("result","0");
        }
        return map;
    }

}
