package algoritmiaCodes.algo.WorkingWithStrings;

public class MutableStrings {
    public static void main(String[] args) {
        StringBuffer x = new StringBuffer("Luis");
        StringBuffer y = new StringBuffer(" German");
        x.append(y);
        int d = x.lastIndexOf(y.toString());
        System.out.println(y);
        System.out.println(d);
    }
}
