


public class Otp {

    public static  void main(String[] args){

        double generateOtp = Math.random();
        System.out.println(generateOtp*1000000);

        int otp = (int) (generateOtp*1000000);

        System.out.println(otp);


    }
    
}
