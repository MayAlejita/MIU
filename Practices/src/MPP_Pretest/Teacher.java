package MPP_Pretest;

public class Teacher extends Person{

    public Teacher(String name, String lastname, int age, String school) {
        super(name, lastname, age);
        this.school = school;
    }

    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String getNamePerson(){
        return "This teacher is:" + getName();
    }
}
