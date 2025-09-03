public class AndOrNot {
    public static void main(String[] args) {
        
        String dbEmail = "siva@gmail.com";
        String dbpassowrd = "siva";

        String userEmail = "siva@gmail.com";
        String userpassowrd = "siva";

        System.out.println( (dbEmail==userEmail) && (dbpassowrd==userpassowrd));


        int adminId=1;
        int editorId = 15;
        int userLoggedId = 15;

        System.out.println( (adminId == editorId) || (editorId == userLoggedId));
        
    }
    
}
