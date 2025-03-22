public class Subjects {
    String subjects;

    public Subjects(String subjects) {
        this.subjects = subjects;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "subjects='" + subjects + '\'' +
                '}';
    }
}
