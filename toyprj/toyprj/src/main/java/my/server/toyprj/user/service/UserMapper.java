package my.server.toyprj.user.service;

import my.server.toyprj.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    public List<UserModel> getAllUser() throws Exception;

}
