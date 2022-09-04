import java.util.HashMap;

public class IDandPasswords {
    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("jack","lakers");
        logininfo.put("david","car");
        logininfo.put("camile","plane");
    }

    protected HashMap getLoginInfo(){
        return logininfo;
    }
}
