package MPP_Pretest.polimorphims;

public abstract class Person {
    private String name;
    private String lastname;
    private int age;

    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public abstract String getNamePerson();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printBirthday(int year){
        return "This person with age" + age + " was born in the year " + year;
    }

    public String printBirthday(int year, int month){
        return "This person with age" + age + " was born in the year " + year + "and month " + month ;
    }

}
