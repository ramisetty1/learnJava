public class IfElse {
    

    public static void main(String[] args) {
        String dbEmail = "siva@gmail.com";
        String dbPassword = "siva";

        String userEmail = "siva@gmail.com";
        String userPassword = "siva1";

        if ( (userEmail == dbEmail) && (userPassword == dbPassword) ){

            System.out.println("login success");
        }
        else {
            System.out.println("invalid credentials");
        }





        int orderedPrice = 200;
        int getOfferAmount = 300;

        if (orderedPrice>getOfferAmount){
            System.out.println("get 10% discount");
        }
        else {
            int diffPrice =getOfferAmount-orderedPrice;
            System.out.println("purchase another " +  diffPrice + " to get discount ");
        }
        
    }
}
