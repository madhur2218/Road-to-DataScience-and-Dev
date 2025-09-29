public class Student {
    private String name;
    private int rollNum;
    private String pno;

    public Student(String name, int rollNum, String pno) {
        this.name = name;
        this.rollNum = rollNum;
        this.pno = pno;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                ", pno='" + pno + '\'' +
                '}';
    }
}
