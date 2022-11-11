public class Exercise {
    public static void main(String[] args) {

        int[] arr = {3,2,1,4,5};
        int result = OddNumbers(arr);
        System.out.println("Respond: " + result );

        int result1 = f(arr);
        System.out.println("Respond1: " + result1 );
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

    static char[]f1 (char[]a, int start, int len){
        if(start <0 || len < 0 || a.length <= start + len -1 ){
            return null;
        }

        char[] respond = new char[len];

        for(int i=start, j=0; j<len; i++, j++){
            respond[j] = a[i];
        }
        return respond;

    }

    static int f2(int n){
        if(n == 0){
            return 0;
        }
        int sign =1;
        if(n < 0){
            sign = -1;
            n = -n;
        }

        int reverse = 0;
        while(n !=0){
            reverse = (reverse *10) + (n%10);
            n /= 10;
        }
        return sign * reverse;
    }

    static int[] f3(int[] first, int[] second){

        if (first == null || second == null)
            return null;
        if (first.length == 0 || second.length == 0)
            return new int[0];
        int min = (first.length < second.length) ? first.length : second.length;

        int[] a, b;
        if (min == first.length)
        {
            a = first;
            b = second;
        }
        else
        {
            a = second;
            b = first;
        }
        int [] result = new int[min];
        int k=0;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<b.length; j++){
                if(a[i] == b[j]){
                    result[k] = a[i];
                    k++;
                }
            }
        }

        int[] retArray = new int[k];
        for (int t = 0; t < retArray.length; t++)
            retArray[t] = result[t];
        return retArray;
    }

    static int f4(int[] a){
        if(a.length < 3){
            return -1;
        }

        int i = 0;
        int j = a.length - 1;
        int idx = 1;
        int leftSum = a[i];
        int rightSum = a[j];
        for (int k = 1; k < a.length - 2; k++)
        {
            if (leftSum < rightSum)
            {
                i++;
                leftSum += a[i];
                idx = i + 1;
            }
            else
            {
                j--;
                rightSum += a[j];
                idx = j - 1;
            }
        }
        if (leftSum == rightSum)
            return idx;
        else
            return -1;
    }
}
