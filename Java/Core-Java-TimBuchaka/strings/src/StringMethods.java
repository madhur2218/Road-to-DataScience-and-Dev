public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "22/10/2000";
        int startingIndex = birthDate.indexOf("2000");
        System.out.println(startingIndex);
        System.out.println(birthDate.substring(startingIndex));
        System.out.println("Month: "+ birthDate.substring(3,5));

        String newDate = String.join("/","22","10","2000");
        System.out.println("New date: "+newDate);

        newDate = "25";
        newDate= newDate.concat("/");
        newDate = newDate.concat("22");
        ///Above is not a good way as it creates objects every time;

        newDate = "25"+"/"+"2022"; //This is better than previous approach as this is a single string
        System.out.println(newDate.replace("/","-"));
        System.out.println("------".repeat(20)); // repeats this string



    }
}
