package tddtask;

import java.util.*;
import static org.junit.Assert.*;

import org.junit.*;

public class TestEmail {

    @BeforeClass
    public static void beforeAllTests () {
        System.out.println("This will execute before all tests");
    }

    @AfterClass
    public static void afterAllTests () {
        System.out.println("This will execute after all tests");
    }

    @Before
    public void beforeTest () {
        System.out.println("This will execute before every test");
    }

    @After
    public void afterTest () {
        System.out.println("This will execute after every test");
    }

    @Test
    public void testValidEmailID () {
        Email email = new Email("laukpb@gmail.com", "Subjectline", null, null);
        String emailId = email.getEmailID();
        assertNotNull(emailId);
    }

    @Test
    public void testSubjectLength () {
        Email email = new Email("laukpb@gmail.com", "Subjectline", null, null);
        assertNotNull(email.getEmailSubject());
        if (email.getEmailSubject() != null) {
            int subjectLength = email.getEmailSubject().length();
            assertTrue((subjectLength > 0) && (subjectLength <= 25));    
        }
    }

    @Test
    public void testValidSubjectChars () {
        Email email = new Email("laukpb@gmail.com", "Subjectline", null, null);
        assertNotNull(email.getEmailSubject());
        if (email.getEmailSubject() != null) {
            String subjectLine = email.getEmailSubject();
            boolean isValid = true;
            for (char ch : " _/*&#".toCharArray()) {
                if (subjectLine.contains(ch+"")) {
                    isValid = false;
                    break;
                }
            }
            assertTrue(isValid);    
        }
    }

    @Test
    @Ignore
    public void testBody () {
        assertTrue(true);
    }

    @Test
    public void testAttachment () {
        Email email = new Email("laukpb@gmail.com", "Subjectline", null, null);
        assertNotNull(email.getEmailAttachments());
        List<Character> attachment = email.getEmailAttachments();
        assertTrue(attachment.size() < 100);
    }

    @Test(timeout = 3000)
    public void testSendEmail() {
        Email email = new Email("laukpb@gmail.com", "Subjectline", null, null);
        email.sendEmail(2500);
    }
}