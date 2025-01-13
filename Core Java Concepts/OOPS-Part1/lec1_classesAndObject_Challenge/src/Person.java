public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName= firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 100 || age < 0){
            this.age=0;
        }
        this.age=age;
    }

    public boolean isTeen(){
        return this.age < 20 && this.age > 12;
    }

    public String getFullName(){
        if(this.getFirstName().isEmpty() && this.getLastName().isEmpty()){
            return " ";
        } else if (getLastName().isEmpty()) {
            return this.firstName;
        }
        else if (getFirstName().isEmpty()) {
            return this.lastName;
        }
        else{
            return this.getFirstName() + " " + this.getLastName();
        }
    }


}
