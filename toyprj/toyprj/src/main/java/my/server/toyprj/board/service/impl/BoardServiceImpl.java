package my.server.toyprj.board.service.impl;

import my.server.toyprj.dao.BoardDao;
import my.server.toyprj.board.model.BoardModel;
import my.server.toyprj.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {


    @Autowired
    private BoardDao dao;

    @Override
    public int insertBoard(BoardModel boardModel) throws Exception {
        return dao.insertBoard(boardModel);
    }
}
