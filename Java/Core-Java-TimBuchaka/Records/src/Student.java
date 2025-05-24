public class Student {

    private int id;
    private String name;
    private String dateofbirth;
    private String classList;

    public Student(String classList, String dateofbirth, int id, String name) {
        this.classList = classList;
        this.dateofbirth = dateofbirth;
        this.id = id;
        this.name = name;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "classList='" + classList + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", dateofbirth='" + dateofbirth + '\'' +
                '}';
    }
}
