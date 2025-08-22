public class Cart {

    public static void main(String[] args) {
        System.out.println("details of cart");

        Cart cartobj = new Cart();
        cartobj.addToCart();

        Authentication authObj = new Authentication();
        authObj.login();

    }

    public void  addToCart(){

        System.out.println("items added to cart");
    }
    
}
