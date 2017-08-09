package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
class SecurityService{
    public static boolean checkPermission(String user){
        if(user.equals("admin")) {
            return true;
        }else{
            return false;
        }
    }

    public static boolean userExists(String user){
        if(user.equals("admin")) {
            return true;
        }else{
            return false;
        }
    }
}
