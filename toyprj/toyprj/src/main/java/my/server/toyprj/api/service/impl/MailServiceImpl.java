package my.server.toyprj.api.service.impl;

import my.server.toyprj.api.service.MailModel;
import my.server.toyprj.api.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender sender;

    @Override
    public void sendMail(MailModel model) {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try{
            helper.setTo(model.getReceiverMail());
            helper.setSubject(model.getSubject());
            helper.setText(model.getMessage());
            sender.send(message);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
