public class Human {
    private String name;
    private int age;
    private String birthplace;

    
    public Human(String name, int age, String birthplace) {
        this.name = name;
        this.age = age;
        this.birthplace = birthplace;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Human [name=" + name + ", age=" + age + ", birthplace=" + birthplace + "]";
    }


    public String getBirthplace() {
        return birthplace;
    }


    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    
}
