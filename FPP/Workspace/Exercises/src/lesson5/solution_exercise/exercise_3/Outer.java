package lesson5.solution_exercise.exercise_3;

public class Outer {	
    private int data = 10;   
    public static void main(String[] args) {    
        Outer outer = new Outer(); 
        outer.printVal(20);     
    }
    void printVal(int bound) {
    	if(data < bound) { 
    		ValGetter vg = () -> data;
            System.out.println("Using lambda: " + vg.getValue());
            
        } else {
            System.out.println("Inside outer: " + (data - bound));
        }
    }
}




