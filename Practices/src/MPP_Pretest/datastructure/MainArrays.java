package MPP_Pretest.datastructure;

public class MainArrays {
    public static void main(String[] args) {
        int [] intArr = new int[]{5, 1, 23, 21, 17, 2, 3, 9, 12};
        int testInt = 22;
        System.out.println(testForSum(intArr, testInt));

    }

    public static boolean testForSum(int [] intArr, int testInt){
        for(int i = 0; i < intArr.length; i ++){
            for(int j = 0; j < intArr.length; j ++){
                for(int k = 0; k < intArr.length; k ++){
                    if(i != j && i!= k && j!=k && intArr [i] + intArr[j] + intArr[k] == testInt){
                        System.out.println( "Numbers: " + intArr [i] + " - "+ intArr[j] + " - "+ intArr[k]);
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
