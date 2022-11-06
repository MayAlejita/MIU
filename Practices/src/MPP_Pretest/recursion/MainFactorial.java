package MPP_Pretest.recursion;

public class MainFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    public static long factorial(long number){
        if(number <= 1){
            return 1;
        }
        else{
            return number * factorial(number -1);
        }
    }
}
