package my.server.toyprj.user.service;

import my.server.toyprj.user.model.UserModel;
import org.springframework.stereotype.Service;

public interface UserService {
    public void insertHash(String hash) throws Exception;

    /** 해쉬값 가져오기 **/
    public String getHash() throws Exception;
    public UserModel getUserInfo(String id) throws Exception;
    /** 아이디 중복 체크 **/
    public int selectId(String id) throws Exception;
    /** 로그인 **/
    public int selectUser(UserModel userModel) throws Exception;
    /** 회원가입 **/
    public int insertUser(UserModel userModel) throws Exception;
}
