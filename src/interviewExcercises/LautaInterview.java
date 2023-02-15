//package interviewExcercises;

//public class LautaInterview {

//    public class Main {
//        public static void main(String[] args) {
//            String a = "10[a11[b]]";
//
//            while (a.contains("[")) {
//                int open = a.lastIndexOf('[');
//                int close = a.substring(open).indexOf(']');
//                int back = open-1;
//                while(back >=0 && a.substring(back, open).matches("([0-9])+")){
//                    back--;
//                    if (back < 0 || !a.substring(back, open).matches("([0-9])+")) {
//                        back++;
//                        break;
//                    }
//                }
//                int times = Integer.valueOf(a.substring(back, open));
//                String before = a.substring(back, open + close+1);
//                String after = a.substring(open+1, open + close).repeat(times);
//                a = a.replace(before, after);
//            }
//            System.out.println(a);
//        }
//    }

//}
