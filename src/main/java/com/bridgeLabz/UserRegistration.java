package com.bridgeLabz;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public boolean validateFirstName(String name) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastName(String name) {

        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateEmail(String eMail) {

        System.out.print("Enter Email id:- ");
        Pattern pattern2 = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        Matcher matcher2 = pattern2.matcher(eMail);
        if (matcher2.matches()) {
return true;
        } else {
            return false;
        }
    }

    public boolean validateMobileNumber(String mobileNumber) {

        System.out.print("Enter Mobile number:- ");
        Pattern pattern3 = Pattern.compile("^[7-9][0-9]{9}$");
        Matcher matcher3 = pattern3.matcher(mobileNumber);
        if (matcher3.matches()) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validatePassword(String password) {

        System.out.print("Enter the Password:- ");
        Pattern pattern4 = Pattern.compile("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");
        Matcher matcher4 = pattern4.matcher(password);
        if (matcher4.matches())
            return true;
        else
            return false;


    }
}
