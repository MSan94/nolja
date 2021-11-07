package my.server.toyprj.board.web;

import my.server.toyprj.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@RestController
public class BoardController {
    @Autowired
    BoardService service;

    @RequestMapping("/insert/board")
    public int insertBoard(
            @RequestParam("id") String writer,
            @RequestParam("subject") String subject,
            @RequestParam("type") String type,
            @RequestParam(value = "imgfile", required = false) MultipartFile imgfile,
            HttpSession httpSession
    ) {
        String defaultPath = httpSession.getServletContext().getRealPath("/");
        String savePath = defaultPath + "APP" + File.separator + "IMG_UPLOAD" + File.separator + "";
        long sizeLimit = 10 * 1024 * 1024;

        File dir = new File(savePath);
        if (!dir.isDirectory()) {
            dir.mkdirs();
        }

        System.out.println(defaultPath);
        return 1;
    }

}
