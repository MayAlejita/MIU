package MPP_Pretest.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("sdsdf");
        List<String> list = Arrays.asList(new String[]{"good", "better", "best", "best", "first", "last", "last", "last","good"});
        System.out.println(list);
        System.out.println(removeDuplicates(list));
    }

    public static List<String> removeDuplicates(List<String> list){
        List<String> finalList = new ArrayList<>();
        for(int i=0; i< list.size(); i++){
            if(!finalList.contains(list.get(i))){
                finalList.add(list.get(i));
            }
        }
        return finalList;
    }
}
