public class Authentication {

    public static void main(String[] args) {
        System.out.println("ok");

        Authentication obj1 = new Authentication();
        obj1.login();
        obj1.signUp();
        obj1.resetPassword();
        
    }

    public void login(){
        System.out.println("login success");

    }


    public void signUp(){

        System.out.println("Account cerated");

    }

    public void resetPassword(){

        System.out.println("Reset password successfully");

    }
    
}
