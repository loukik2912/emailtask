package tddtask;

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
        Email email = new Email();
        String emailId = email.getEmailID();
        assertNotNull(emailId);
    }

    @Test
    public void testSubjectLength () {
        Email email = new Email();
        int subjectLength = email.getSubject().length();
        assertTrue((subjectLength > 0) && (subjectLength <= 25));
    }

    @Test
    public void testValidSubjectChars () {
        Email email = new Email();
        String subjectLine = email.getSubject();
        bool isValid = true;
        for (char ch : " _/*&#".toCharArray()) {
            if (subjectLine.contains(ch)) {
                isValid = false;
                break;
            }
        }
        assertTrue(isValid);
    }

    @Test
    public void testSubjectNotNull () {
        Email email = new Email();
        assertNotNull(email.getSubject());
    }

    @Test
    @Ignore
    public void testBody () {
        assertTrue(true);
    }

    @Test
    public void testAttachment () {
        Email email = new Email();
        List<String> attachment = email.getEmailAttachment();
        if (attachment != null) {
            assertTrue(attachment.size() < 100);
        }
    }

    @Test(timeout = 3000)
    public void testSendEmail() {
        Email email = new Email();
        email.sendEmail(2500);
    }
}