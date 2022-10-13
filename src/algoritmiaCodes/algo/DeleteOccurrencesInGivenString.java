package algoritmiaCodes.algo;

public class DeleteOccurrencesInGivenString {

    public static void main(String[] args) {

        //given any String
        String x = "spidersliers";
        //to get char by char I convert it into char array
        char y[] = x.toCharArray();
        //get the size
        int size = x.length();
        //get the char to be deleted
        char key = 's';
        //initialize i
        int i = 0;
        //create the empty String to be displayed
        String res = "";

        //here I create the loop to be done
        while (i!=size){

            if (y[i] != key){
                res = res + y[i];
            }
            ++i;
        }
        System.out.println(res);

    }
}
