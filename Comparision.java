public class Comparision {

    public static void main(String[] args){

        String dbEmail = "siva@gmail.com";
        String dbPassword = "siva";

        String userEmail = "siva@gmail.com";
        String userPassword = "siva";

        System.out.println(dbEmail == userEmail);
        userEmail = "siva1@gmail.com";
        System.out.println(dbEmail == userEmail);

        System.out.println(dbPassword == userPassword);


        int loggedinUserId = 10;
        int viewingUserId= 5;

        System.out.println(loggedinUserId != viewingUserId);


        int purchasedAmount = 450;
        int getOfferAmount = 500;

        System.out.println(purchasedAmount > getOfferAmount);

        purchasedAmount = 500;
        System.out.println(purchasedAmount >= getOfferAmount);



    }
    
}
