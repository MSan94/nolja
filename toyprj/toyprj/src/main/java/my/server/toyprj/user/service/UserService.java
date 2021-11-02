package my.server.toyprj.user.service;

import my.server.toyprj.user.model.UserModel;
import org.springframework.stereotype.Service;

public interface UserService {
    public UserModel getUser(int userIdx) throws Exception;

    /** 회원등록 **/
    public int selectUser(UserModel userModel) throws Exception;
}
