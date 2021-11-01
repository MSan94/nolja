package my.server.toyprj.user.service;

import my.server.toyprj.user.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserModel> getAllUser() throws Exception;
}
