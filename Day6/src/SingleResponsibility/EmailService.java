package SingleResponsibility;

/**
 * Created by badkass on 7/25/2017.
 */
class EmailService{

    void sendEmail(String user,String email,String message){
        if(LocationService.checkLocation(LocationService.retrieveLocation(email))){
            if(checkPermission(user)){
                if(exists(email)){
                    System.out.println("Email is sent!!!");
                }
            }
        }
    }

    boolean exists(String email){
        //20 loc to check in DB
        if(email.endsWith(".com")) {
            return true;
        }else{
            return false;
        }
    }

    boolean checkPermission(String user){
        //20 loc to check in DB
        if(user.equals("admin")) {
            return true;
        }else{
            return false;
        }
    }


}
