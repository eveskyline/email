import util.MailSenderInfo;
import util.SimpleMailSender;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date date =new Date();

        MailSenderInfo mailInfo = new MailSenderInfo();
        mailInfo.setMailServerHost("smtp.sina.com");
        mailInfo.setMailServerPort("25");
        mailInfo.setValidate(true);
        mailInfo.setUserName("");
        mailInfo.setPassword("");//您的邮箱密码
        mailInfo.setFromAddress("");
        mailInfo.setToAddress("");
        mailInfo.setSubject("设置邮箱标题 "+date);
        mailInfo.setContent("设置邮箱内容 "+date);
        String[] filename={"/Users/taylor/Downloads/image.jpg","/Users/taylor/Downloads/57559-102.jpg"};
        mailInfo.setAttachFileNames(filename);
        //这个类主要来发送邮件
        SimpleMailSender sms = new SimpleMailSender();
        sms.sendTextMail(mailInfo);//发送文体格式
//        sms.sendHtmlMail(mailInfo);//发送html格式
        System.out.print("end"+date);
    }
}
