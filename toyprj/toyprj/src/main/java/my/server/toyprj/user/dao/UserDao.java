package my.server.toyprj.user.dao;

import my.server.toyprj.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public UserModel getUser(int userIdx) throws Exception;

}
