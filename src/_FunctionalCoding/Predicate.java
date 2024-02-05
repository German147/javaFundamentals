package _FunctionalCoding;

public class Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneValid("07000000000"));
        System.out.println(isPhoneValid("094534689000"));

        System.out.println(isPhoneValidFunctional.test("07000000000"));

    }

    static boolean isPhoneValid(String number) {
        return number.startsWith("07") && number.length() == 11;
    }

   static java.util.function.Predicate<String> isPhoneValidFunctional=
            number->number.startsWith("07") && number.length() == 11;

}
