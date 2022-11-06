package MPP_Pretest.recursion;

public class MainPalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("anas"));
    }

    public static boolean palindrome(String data){
        if(data.length() ==0 || data.length() ==1){
            return true;
        }
        if(data.charAt(0) == data.charAt(data.length() -1)){
            return palindrome(data.substring(1, data.length()-1));
        }
        return false;
    }
}
