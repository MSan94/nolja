package my.server.toyprj.board.service;

import my.server.toyprj.board.model.BoardModel;

public interface BoardService {

    /** 글 등록 **/
    public int insertBoard(BoardModel boardModel) throws Exception;

}
