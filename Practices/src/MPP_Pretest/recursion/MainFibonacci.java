package MPP_Pretest.recursion;

public class MainFibonacci {
    public static void main(String[] args) {
        long a = 4;
        System.out.println("Number: " + fibonacci(a));

        for(int i=0; i< a; i++){
            System.out.println(fibonacci(i) + " ");
        }

    }

    public static long fibonacci(long number){
        if(number == 0 || number ==1){
            return number;
        }
        else{
            return fibonacci(number -1) + fibonacci(number-2);
        }
    }
}
