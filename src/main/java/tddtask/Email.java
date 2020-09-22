package tddtask;

import java.util.*;

public class Email
{
    private String emailId;
    private String emailSubject;
    private String emailBody;
    private List<String> emailAttachments;

    public Email (String _emailId, String _emailSubject, String _emailBody, List<String> _emailAttachments) {
        this.emailId = _emailId;
        this.emailSubject = _emailSubject;
        this.emailBody = _emailBody;
        this.emailAttachments = new ArrayList<String>(_emailAttachments);
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

    public List<String> getEmailAttachments() {
        return emailAttachments;
    }

    public void sendEmail(int timeToSend) {
        try {
            Thread.sleep(timeToSend);
         } catch (Exception e) {
            System.out.println(e);
         }
    }
}
