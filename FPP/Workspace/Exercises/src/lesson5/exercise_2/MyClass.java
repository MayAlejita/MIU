package lesson5.exercise_2;

class MyClass extends MySuperClass {
public static void main(String[] args) {
MySuperClass cl = new MyClass();
System.out.println(cl.getType());
}
public int getType() {
return 3;
}
}
class MySuperClass {
public int getType() {
return 2;
}
}
