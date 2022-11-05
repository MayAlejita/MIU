package MPP_Pretest.polimorphims;

public class Student extends Person{

    public Student(String name, String lastname, int age, String grade) {
        super(name, lastname, age);
        this.grade = grade;
    }

    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

//    @Override
//    public String getNamePerson(){
//        return "This student is:" + getName();
//    }
}
