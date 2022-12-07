package lists1;

public class student {
    int age;
    int level;
    String firstname;
    String lastname;
    public student(int age, int level, String firstname, String lastname){
        this.age = age;
        this.level = level;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public int getLevel() {
        return level;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }


    @Override
    public String toString(){
        return firstname + " " + lastname + " Age: " + age + " Class: " + level;
    }
}
