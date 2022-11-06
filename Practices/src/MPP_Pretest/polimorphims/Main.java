package MPP_Pretest.polimorphims;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person student = new Student("Mayra", "Pullupaxi", 33, "A" );
        //System.out.println(student.getNamePerson());

        Person teacher = new Teacher("Jimmy", "Palma", 32, "ABC" );
        //System.out.println(teacher.getNamePerson());

        System.out.println(student.printBirthday(1989));
        System.out.println(student.printBirthday(1989, 3));

        List<Person> listPerson = new ArrayList<>();
        Person person1 = new Person("Ana", "Lopez",12);
        Person person2 = new Person("Luis", "Luna", 25);
        listPerson.add(person1);
        listPerson.add(person2);
        listPerson.add(student);

        System.out.println(listPerson);

        Student student1 = new Student("Jose", "Perez", 22, "A");
        Person person3 = student1;

        //Student student2 = (Student) person1; //nooooo

        System.out.println(person3);




    }
}
