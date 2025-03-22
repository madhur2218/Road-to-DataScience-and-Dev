import java.util.List;

public class Students {
    String name;
    int rollNumber;
    double height;
    List<Subjects> subjects;

    public Students(String name, int rollNumber, double height) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.height = height;
    }

    public Students(String name, int rollNumber, double height, List<Subjects> subjects) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.height = height;
        this.subjects = subjects;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
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

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subjects> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", height=" + height +
                ", subjects=" + subjects +
                '}';
    }
}
