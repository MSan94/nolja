package my.server.toyprj.user.service.impl;

import my.server.toyprj.user.model.UserModel;
import my.server.toyprj.user.dao.UserDao;
import my.server.toyprj.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao dao;

    @Override
    public UserModel getUser(int userIdx) throws Exception {
        return dao.getUser(userIdx);
    }

    /**
     * 회원등록
     * @param userModel
     * @return
     * @throws Exception
     */
    @Override
    public int selectUser(UserModel userModel) throws Exception {
        return dao.selectUser(userModel);
    }
}
