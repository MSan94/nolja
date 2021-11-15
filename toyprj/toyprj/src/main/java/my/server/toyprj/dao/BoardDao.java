package my.server.toyprj.dao;

import my.server.toyprj.board.model.BoardModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardDao {

    /** 글 등록 **/
    public int insertBoard(BoardModel boardModel) throws Exception;
}
