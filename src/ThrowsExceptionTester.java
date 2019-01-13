public class ThrowsExceptionTester {
    public static void main(String[] args) {

        int hours = -3;
        int numbersOfSeconds = 0;

        ThrowsExceptionTester throwsExceptionTester = new ThrowsExceptionTester();
        try {
            numbersOfSeconds = throwsExceptionTester.getNumberOfSeconds(hours);
        } catch (Exception e) {
            numbersOfSeconds = throwsExceptionTester.getNumberOfSeconds(hours * -1);
        }

        System.out.println("Liczba sekund to: " + numbersOfSeconds);


    }

    public int getNumberOfSeconds(int hours){
        if(hours<0){
            throw new IllegalArgumentException("Liczba godzin musi być niezerowa! " + hours);
        }
        return hours*60*60;
    }

}
