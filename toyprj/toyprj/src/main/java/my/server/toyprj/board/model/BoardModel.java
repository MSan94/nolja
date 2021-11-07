package my.server.toyprj.board.model;

import lombok.Data;

@Data
public class BoardModel {
    private int bno;
    private String writer;
    private String subject;
    private String type;
    private String use_at;
    private String imgfile;
}
