package MPP_Pretest.datastructure;

import MPP_Pretest.polimorphims.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {

        List<Person> listPerson = Arrays.asList(new Person[] {new Person("Pepito","Alvarez", 20),
                new Person("Ana","Aldaz", 21),
                new Person("Carla","Cevallos", 5)
        });

        System.out.println(listPerson);

        System.out.println(getUnderAge(listPerson));

    }

    public static List<Person> getUnderAge(List<Person> listPerson){
        List<Person> listUnderAge = new ArrayList<>();
        for(int i=0; i < listPerson.size(); i++){
            if(listPerson.get(i).getAge() < 18){
                listUnderAge.add(listPerson.get(i));
            }
        }
        return listUnderAge;
    }
}
