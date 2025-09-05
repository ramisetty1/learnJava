public class Whileloop {
    
    public static void main(String[] args){

        int[] prices = {20000, 30000, 45000, 50000};

        int i = 0;

        boolean priceMax = false;

        while ( priceMax == false){
            if (prices[i]> 45000){
                priceMax = true;
                System.out.println("at index "+ i );
            }
            i++;
        }

        String[] emails = { "siva@gmail.com", "ram@gmail.com", "setty@gmail.com"};


        boolean isSentEmail = false;
        int j = 0;

        while ( isSentEmail == false){

            if ( emails[j] == "setty@gmail.com"){

                System.out.println("email sent to " + emails[j]);
                isSentEmail = true;

            }
            j++;
        }


        

    }
}
