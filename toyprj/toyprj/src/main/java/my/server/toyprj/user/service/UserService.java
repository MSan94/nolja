package my.server.toyprj.user.service;

import my.server.toyprj.user.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    UserMapper mapper;
    public List<UserModel> getAllUser() throws Exception;
}
