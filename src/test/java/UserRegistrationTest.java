import org.example.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    void givenFirstNameRerurnTrue(){
        boolean actualValue = userRegistration.validateFirstName("Vamshi");
        Assertions.assertTrue(actualValue);
        System.out.println("FirstName Successfully Validate.");
    }
    @Test
    void givenLastNameReturnTrue(){
        boolean actualFirstName = userRegistration.validateLastName("Reddy");
        Assertions.assertTrue(actualFirstName);
        System.out.println("LastName Successfully Validate.");
    }

    @Test
    void givenEmailRerurnTrue(){
        boolean actualEmail = userRegistration.validateEmail("Vamshireddy@gmail");
        Assertions.assertTrue(actualEmail);
        System.out.println("Email Successfully Validate.");
    }

    @Test
    void givenMobileNumberRerurnTrue(){
        boolean actualMobileNumber = userRegistration.validateMobileNumber("+91 7730006563");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Mobile Number Successfully Validate.");
    }

    @Test
    void givenPasswordRerurnTrue(){
        boolean actualMobileNumber = userRegistration.validatePassword("Vamshi@9");
        Assertions.assertTrue(actualMobileNumber);
        System.out.println("Password Successfully Validate.");
    }

}