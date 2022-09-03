import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("mark123","LAL123");
        logininfo.put("daw123","car123");
        logininfo.put("camile123","plane123");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
