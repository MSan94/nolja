package my.server.toyprj.user.dao;

import my.server.toyprj.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    /** 테스트 **/
    public UserModel getUser(int userIdx) throws Exception;

    /** 회원등록 **/
    public int selectUser(UserModel userModel) throws Exception;
}
