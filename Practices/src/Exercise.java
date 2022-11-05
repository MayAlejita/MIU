public class Exercise {
    public static void main(String[] args) {

        int[] arr = {3,2,1,4,5};
        int result = OddNumbers(arr);
        System.out.println("Respond: " + result );
    }

     static int OddNumbers(int [] a) {
        if (a == null)
            return 0;
        if (a.length == 1)
            return 1;
        if (a.length % 2 == 0)
            return 0;

        int midIndex = a.length / 2 ;
        int middleItem = a[midIndex];

        for(int i=0; i< a.length; i++) {
            if (i != midIndex && middleItem >= a[i]){
                return 0;
            }
        }
        return 1;
    }

    static int f(int[] a)
    {
        int sumEven = 0;
        int sumOdd = 0;

        for (int i=0; i<a.length; i++)
        {
            if (a[i]%2 == 0)
                sumEven += a[i];
            else
                sumOdd += a[i];
        }

        return sumOdd - sumEven;
    }
}
