import java.util.List;

public class Student {
    private String name;
    private int rollNumber;
    private String email;
    List<Subjects> subjects;

    public Student(String name, int rollNumber,String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
    }

    public Student(String name, int rollNumber,String email, List<Subjects> subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.subjects = subjects;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }
}
