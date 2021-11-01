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
}
