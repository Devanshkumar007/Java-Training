package Regex;

public class RegexQ {

    public static void main(String[] args) {

        // Q1. Mobile Number
        String regex1 = "^[6-9]\\d{9}$";
        String[] mobileTests = {
                "9876543210",
                "6789012345",
                "8123456789",
                "5123456789"
        };

        testRegex("Q1 Mobile Number", regex1, mobileTests);

        // Q2. Email ID
        String regex2 = "^[A-Za-z0-9._%+-]+@[A-Za-z]+\\.com$";
        String[] emailTests = {
                "john.doe@gmail.com",
                "user_123@yahoo.com",
                "abc+test@domain.com",
                "john@gmail.in",
                "@gmail.com"
        };

        testRegex("Q2 Email ID", regex2, emailTests);

        // Q3. Password
        String regex3 = "^(?=.*[A-Z])(?=.*\\d).{8,}$";
        String[] passwordTests = {
                "Password1",
                "HELLO123",
                "JavaRocks9",
                "password1",
                "PassWord"
        };

        testRegex("Q3 Password", regex3, passwordTests);

        // Q4. Username
        String regex4 = "^[A-Za-z]\\w{4,14}$";
        String[] usernameTests = {
                "user_1",
                "Devansh_99",
                "A1234",
                "1user",
                "ab"
        };

        testRegex("Q4 Username", regex4, usernameTests);

        // Q5(a). OTP
        String otpRegex = "\\d{6}";
        String[] otpTests = {
                "123456",
                "000999",
                "987654",
                "12345"
        };

        testRegex("Q5(a) OTP", otpRegex, otpTests);

        // Q5(b). PIN
        String pinRegex = "\\d{4}";
        String[] pinTests = {
                "1234",
                "0000",
                "9876",
                "12345"
        };

        testRegex("Q5(b) PIN", pinRegex, pinTests);

        // Q6. Vehicle Number
        String regex6 = "^[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}$";
        String[] vehicleTests = {
                "MH12AB1234",
                "DL01AA9999",
                "KA05MK4321",
                "Mh12AB1234",
                "MH123AB123"
        };

        testRegex("Q6 Vehicle Number", regex6, vehicleTests);

        // Q7. Date (dd-mm-yyyy)
        String regex7 = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$";
        String[] dateTests = {
                "01-01-2024",
                "31-12-1999",
                "15-08-1947",
                "32-01-2024",
                "10-13-2023"
        };

        testRegex("Q7 Date", regex7, dateTests);
    }

    
    private static void testRegex(String title, String regex, String[] tests) {
        System.out.println("\n" + title);
        System.out.println("--------------------------------");

        for (String test : tests) {
            System.out.println(test + " -> " + test.matches(regex));
        }
    }
}
