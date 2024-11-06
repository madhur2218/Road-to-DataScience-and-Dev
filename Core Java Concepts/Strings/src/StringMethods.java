public class StringMethods {
    public static void main(String[] args) {
        String birthDate = "25/11/1982";
        int stringIndex = birthDate.indexOf("1982");
        System.out.println("STARTING INDEX = "+ stringIndex);
        System.out.println("Birth year is =" + birthDate.substring(stringIndex));

        //Get month value
        int monthIndex= birthDate.indexOf("11");
        System.out.println(monthIndex);
        System.out.println("Birth month is = "+birthDate.substring(monthIndex,5));

        //Get date value
        int dayIndex = birthDate.indexOf("25");
        System.out.println(dayIndex);
        System.out.println("BirthDay is = "+birthDate.substring(dayIndex,2));

        String name = "Madhur";
        String subString = name.substring(3,6);
        System.out.println(subString);
        System.out.println(subString.indexOf("h"));

        String joinName= String.join(" ","Madhur","Nagrath");
        System.out.println(joinName);

        String newDate = String.join("/","25","11","1985");

        newDate = "25";
        newDate=newDate.concat("/");
        newDate=newDate.concat("11");
        newDate=newDate.concat("/");
        newDate=newDate.concat("1985");
        System.out.println(newDate);

        newDate = "25"+"/"+"11"+"/"+"1985";
        System.out.println(newDate);

        newDate="25".concat("/").concat("11").concat("/").concat("1985");
        System.out.println(newDate);

        System.out.println(newDate.replace('/','-'));

        System.out.println(newDate.replaceFirst("/","---"));
        System.out.println(newDate.replaceAll("/","==="));

        System.out.println("-".repeat(20));
        System.out.println("ABC\n".repeat(3).indent(8));
        System.out.println("-".repeat(20));






        //substring
        //indexof
        //String.join
        //.concat
        //.replace
        //.indent
        //.replace



    }

}
