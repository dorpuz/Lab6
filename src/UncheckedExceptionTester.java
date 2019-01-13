public class UncheckedExceptionTester {

    public static void main(String[] args) {
        UncheckedExceptionTester uncheckedExceptionTester = new UncheckedExceptionTester();
        int i = uncheckedExceptionTester.getNumberFromString("5n");
        if(i!=-1)System.out.println("Oto nasza liczba pomnożona przez 99: " + (i*99));
    }

    public int getNumberFromString(String number){
        try {
            return Integer.parseInt(number);
        } catch (NumberFormatException nfe){
            System.out.println("Coś poszło nie tak.. Upewnij się, że przekazywany string jest liczbą");

        }
        return -1;
    }
}
