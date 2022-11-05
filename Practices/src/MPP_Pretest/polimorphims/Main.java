package MPP_Pretest.polimorphims;

public class Main {
    public static void main(String[] args) {

        Person student = new Student("Mayra", "Pullupaxi", 33, "A" );
        System.out.println(student.getNamePerson());

        Person teacher = new Teacher("Jimmy", "Palma", 32, "ABC" );
        System.out.println(teacher.getNamePerson());

        System.out.println(student.printBirthday(1989));
        System.out.println(student.printBirthday(1989, 3));



    }
}
