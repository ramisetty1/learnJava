public class Numbers {

    public static void main(String[] args){

        String price = "19.9";

        String quantity = "2";




        System.out.println(Float.parseFloat(price) * Integer.parseInt(quantity)); //type casting

        float totalPrice = Float.parseFloat(price) * Integer.parseInt(quantity);

        System.out.println(String.valueOf(totalPrice));



    }
    
}
