package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
public class LocationService {

    public static String retrieveLocation(String email){
        if(email.endsWith(".com")) {
            return "Valid";
        }else{
            return "Invalid";
        }
    }

    public static boolean checkLocation(String location){
        if(location.equals("Valid")) {
            return true;
        }else{
            return false;
        }
    }
}
