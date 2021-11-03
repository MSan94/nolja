package my.server.toyprj.api.service;

import lombok.Data;

@Data
public class MailModel {
    private String sender;  //발신자
    private String senderMail; //발신자 메일 주소
    private String receiverMail; //수신자 메일 주소
    private String subject; //제목
    private String message; //내용
}
