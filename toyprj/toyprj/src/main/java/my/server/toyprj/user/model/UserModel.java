package my.server.toyprj.user.model;

import lombok.Data;

@Data
public class UserModel {
    private String userIdx;
    private String userName;
    private String userPassWord;
    private String userEmail;
    private String UserNick;
}
