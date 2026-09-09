public class VerifyOtpException extends Exception {

    public VerifyOtpException(String message) {
        super(message);
    }

    public static void verifyOtp(String otp) throws VerifyOtpException {
        try {
            int val = Integer.parseInt(otp);
            System.out.println("Valid numeric OTP: " + val);
        } catch (NumberFormatException e) {
            throw new VerifyOtpException("Please enter numeric OTP only.");
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println("Calling verifyOtp with integer.");
            verifyOtp("123456");

            System.out.println("Calling verifyOtp with invalid input.");
            verifyOtp("abc");

        } catch (VerifyOtpException e) {
            System.out.println(e.getMessage());
        }
    }
}
