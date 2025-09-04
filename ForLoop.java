public class ForLoop {

    public static void main(String[] args) {

        String[] tittles = { "iphone 16", "Google", "samsung", "redme" };

        System.out.println( tittles.length);

        for ( int i=0; i<tittles.length; i++ ){

            System.out.println(tittles[i]);

        }


        int[] prices = { 2500, 50000, 80000};

        for ( int j = 0; j < prices.length; j++ ){

            System.out.println(prices[j]);
        }

        System.out.println("===============================");

        for ( int k =prices.length-1; k >=0; k--){

            System.out.println(prices[k]);
        }
        

    }
    
}
