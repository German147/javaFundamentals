package CodeSignal_BarreraGerman;

public class CharAtMethod {
    public static void main(String[] args) {

        int num = 123445;
        String number = num + "";
        int countRight = 0;
        int countLeft = 0;
        for (int i = 0; i < number.length() / 2; i++) {
            int left = number.charAt(i);
            int right = number.charAt(number.length() - 1 - i);
            countRight+= right - left;
        }
        System.out.println(countRight);

    }
}
