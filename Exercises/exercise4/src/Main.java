import java.util.regex.Pattern;

public class Main {

    private static void testPattern(String pattern, String testString, String description) {
        System.out.println("Testing " + description + ": " + testString);
        boolean match = Pattern.matches(pattern, testString);
        System.out.println("Does it match: " + (match ? "Yes" : "No") + "\n");
    }

    public static void main(String[] args) {

        //Email
        String emailPattern = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        testPattern(emailPattern, "example@example.com", "email validation (positive)");
        testPattern(emailPattern, "example.com", "email validation (negative)");

        //Phone Number
        String phonePattern = "^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$";
        testPattern(phonePattern, "(123) 456-7890", "phone number validation (positive)");
        testPattern(phonePattern, "1234567", "phone number validation (negative)");

        //Date (YYYY-MM-DD)
        String datePattern = "^\\d{4}-\\d{2}-\\d{2}$";
        testPattern(datePattern, "2024-01-01", "date format validation (positive)");
        testPattern(datePattern, "01-01-2024", "date format validation (negative)");

        //URL
        String urlPattern = "^(https?://)?(www\\.)?([\\w]+\\.)+[\\w]{2,}/?$";
        testPattern(urlPattern, "http://www.example.com", "URL validation (positive");
        testPattern(urlPattern, "example", "URL validation (negative)");

        //Password
        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$";
        testPattern(passwordPattern, "Password123", "password strength (positive)");
        testPattern(passwordPattern, "pw", "password strength (negative)");
    }

}