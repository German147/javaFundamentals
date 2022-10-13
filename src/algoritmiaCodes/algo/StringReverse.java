package algoritmiaCodes.algo;

public class StringReverse {

      //  private static final Logger LOGGER = Logger.getLogger(Runner.class.getName());
        public static void main(String[] args) {
            System.out.println("Reversed string: " + reverse("German"));
        }

    /**
     * Here I did Debug and learnt how the code works
     * @param input
     * @return
     */
    public static String reverse(String input){
           // input = input.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
            char[] in = input.toCharArray();
            int begin=0;
            int end=in.length-1;
            char temp;

            while(end>begin){
                temp = in[begin];
                in[begin]=in[end];
                in[end] = temp;
                end--;
                begin++;
            }
            return new String(in);
        }

}
