package MPP_Pretest.recursion.prob1;
import java.util.*;
public class Prob1 {
	private HashMap<String, Integer> h = new HashMap<String, Integer>();
	public void frequencies(List<String> input) {
		//use recursion to populate the HashMap h with 
		//the frequency of each string in the input list

		for(int i=0; i< input.size(); i++){
			if(h.containsKey(input.get(i))){
				int a = h.get(input.get(i));
				h.put(input.get(i), ++a);
			}
			else{
				h.put(input.get(i), 1);
			}
		}

	}
	
	
	//test your code here
	//Expected output: {feather=2, Tom=3, cat=2, rich=1, dog=2, bull=1}
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			{
				add("Tom");add("cat"); add("Tom"); add("dog");
				add("cat");add("Tom");add("feather"); add("dog");
				add("bull"); add("rich"); add("feather");
			}
		};
		Prob1 p = new Prob1();
		p.frequencies(list);
		System.out.println(p.h);
	}
}
