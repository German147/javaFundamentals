package CodeSignal_BarreraGerman;

import java.util.HashSet;

public class FirstDuplicate {

    public static void main(String[] args) {
        int[] myarray1 = {1,2,3,4,5,6,7,8,9,7,2};
        //System.out.println(firstDuplicate(myarray1));
        System.out.println(usingHashMapSolution(myarray1));

    }

    public static int firstDuplicate(int[] array) {

        int min_second_index = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    min_second_index = Math.min(min_second_index, j);
                }
            }
        }
        if (min_second_index == array.length)return -1;
        else return array[min_second_index];
    }

    //it is a solution from n2 to n2
    public static int usingHashMapSolution(int[] array){

        HashSet<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (duplicate.contains(array[i])){
                return array[i];
            }else {
                duplicate.add(array[i]);
            }
        }
        return -1;
    }
}
