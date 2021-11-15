package my.server.toyprj.board.model;

import lombok.Data;

@Data
public class BoardModel {
    int bno;
    String writer;
    String subject;
    String gender;
    String imgfile;
    String useAt;
}
