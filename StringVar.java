public class StringVar {



    public static void main(String[] args){

        String firstName = "siva";
        String lastName = "ramisetty";

        System.out.println( firstName + " " + lastName + " " + "naidu" ); //concatenation 


        String password = "sivaramisetty@  ";

        System.out.println(password.contains("@"));

        System.out.println(password.length());
        password =password.trim();
        System.out.println(password.length());

        System.out.println(firstName.toUpperCase());
        System.out.println(lastName.toUpperCase());


        String promoCode = "siva50";

        String userEnterCode = "SIVA50";

        promoCode = promoCode.toLowerCase();
        userEnterCode = userEnterCode.toLowerCase();


        System.out.println(promoCode.equals(userEnterCode));






    }
    
}
