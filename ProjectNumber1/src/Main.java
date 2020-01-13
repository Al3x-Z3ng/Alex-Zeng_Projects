

public class Main {
    //Code your solution to problem number one here
    static int problemOne(String s){
        int answer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals("a")||s.substring(i,i+1).equals("e") ||s.substring(i,i+1).equals("i")|| s.substring(i,i+1).equals("o")|| s.substring(i,i+1).equals("u") ) {
                answer = answer + 1;
            }
        }
    //your code here
        return answer;
    }
    //Code you problem number two here
    static int problemTwo(String s){
        int answer = 0;
        for (int i = 0; i < s.length()-2; i++){
            if (s.substring(i,i+3).equals("bob")) {
                answer++;
            }
        }
        return answer;
    }
    //Code your solution to problem number 3 here
    static String problemThree(String s){
        //your code here\
        // not finished
        char temp = s.charAt(0);
        char temp2 = s.charAt(1);


        for (int i = 0; i < s.length()-2;i++) {
            if(temp2 > temp || temp2 == temp) {
                System.out.print(s.charAt(i));
            }
            if (temp2 < temp) {
                System.out.print(" ");
            }
                temp = s.charAt(i + 1);
                temp2 = s.charAt((i + 1) + 1);

        }

        return s;
    }
    public static void main(String[] args) {
        /*
        Set s to a string and run your method using s as the parameter
        Run your method in a println statement to determine what the output was
        Once you think you have it working try running the tests.
        The tests will put your method through several different  Strings to test
        all possible cases.  If you have 100% success then there is no bugs in your methods.
         */
        String s;
    }
}
