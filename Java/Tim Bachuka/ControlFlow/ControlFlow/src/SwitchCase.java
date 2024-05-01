public class SwitchCase {
    public static void main(String[] args) {
        int switchCase=5;

        switch (switchCase){
            case 1 :
                System.out.println("value is 1");
                break;
            case 2 :
                System.out.println("value is 2");
                break;
            case 3 :
                System.out.println("value is 3");
                break;

            case 4 : case 5 : case 6 :
                System.out.println("Either 4, 5 ,or 6");
                break;

            default:
                System.out.println("Neither of the numbers");
                break;
        }


        System.out.println(getQuarter("Dec"));
        System.out.println(getQuarter1("Jan"));


    }


    public static String getQuarter(String month){
        switch(month) {
            case "January":
            case "Feb":
            case "Mar":
            case "Apr":
                return "1st";

            case "May":
            case "Jun":
            case "Jul":
            case "Aug":
                return "2st";

            case "Sep":
            case "Oct":
            case "Nov":
            case "Dec":
                return "3rd";
                default:
                System.out.println("No more months");
        }

        return "bad";
    }

    public static String getQuarter1(String month){
        return switch(month){
            case "Jan", "Feb", "Mar","Apr" -> {yield "q1" ;}
            case "May", "Jun", "Jul","Aug" -> "qt2";
            case "Sep", "Oct", "Nov","Dec" -> "qt3";
            default -> {
                String badresponse = month + "ha ha bad";
                     yield badresponse;
            }
        };

    }
}
