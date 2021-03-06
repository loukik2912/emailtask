package tddtask;

import java.util.*;

public class Email
{
    private String emailId;
    private String emailSubject;
    private String emailBody;
    private List<Character> emailAttachments;

    public Email (String _emailId, String _emailSubject, String _emailBody, List<Character> _emailAttachments) {
        this.emailId = _emailId;
        this.emailSubject = _emailSubject;
        this.emailBody = _emailBody;
        this.emailAttachments = new ArrayList<Character>(_emailAttachments);
    }

    public String getEmailID() {
        return emailId;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public List<Character> getEmailAttachments() {
        return emailAttachments;
    }

    public void sendEmail(int timeToSend) {
        System.out.println("Sending email, subject: " + getEmailSubject());
        try {
            Thread.sleep(timeToSend);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
}