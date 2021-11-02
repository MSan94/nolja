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
    public void insertHash(String hash) throws Exception {
        dao.insertHash(hash);
    }

    @Override
    public String getHash() throws Exception {
        return dao.getHash();
    }

    @Override
    public String getId(String id) throws Exception {
        return dao.getId(id);
    }

    /**
     * 아이디 중복 체크
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public int selectId(String id) throws Exception {
        return dao.selectId(id);
    }

    /**
     * 로그인
     * @param userModel
     * @return
     * @throws Exception
     */
    @Override
    public int selectUser(UserModel userModel) throws Exception {
        return dao.selectUser(userModel);
    }

    @Override
    public int insertUser(UserModel userModel) throws Exception {
        return dao.insertUser(userModel);
    }

}
