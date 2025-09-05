public class LoopTwo {

    public static void main(String[] args) {
        
        int[] prices = {
            20000, 25000, 30000, 450000
        };

        // // for ( int i = 0; i < prices.length; i++){
        // //     system.out.println(prices[i]);

        // //     if ( prices[i] == 30000)
                
        // //         break;

            
        // // }

        for (int i = 0; i<prices.length; i++){

            if (prices[i] == 30000){

                continue;
            }
            System.out.println(prices[i]);
           

        }

        String[] names = {"siva", "ram", "prasad", "ramisetty"};

        for (int i = 0; i <names.length; i++){

            System.out.println(names[i]);
            if (names[i] == "ram" ){
                break;
            }
        }
    }
    
}
