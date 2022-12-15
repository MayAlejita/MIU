package lesson5.solution_exercise.exercise_2;

public class Outer {	
    private int data = 12;   
    public static void main(String[] args) {    
        Outer outer = new Outer(); 
        outer.printVal(20);     
    }
    void printVal(int bound) {
    	if(data < bound) { 
    		//Notice Inner is not accessible outside if block
            class Inner {       
                public int getValue() {                    
                    return data;
                }
            }
            Inner inner = new Inner();
            System.out.println("Inside inner: " + inner.getValue());
        } else {
            System.out.println("Inside outer: " + (data - bound));
        }
    }
}




