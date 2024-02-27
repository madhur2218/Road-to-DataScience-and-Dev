class Student{
    private int rollNo;
    private String name;


    public void setrollNo(int rollNo){
        this.rollNo = rollNo;
    }

    public int getrollNo(){
        return rollNo;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }




}

public class Encapsulation1 {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.setrollNo(12);
        s1.setName("madhur");

        System.out.println(s1.getName());
        System.out.println(s1.getrollNo());

    }
}
