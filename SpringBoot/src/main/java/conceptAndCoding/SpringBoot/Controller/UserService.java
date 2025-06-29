package conceptAndCoding.SpringBoot.Controller;

import conceptAndCoding.SpringBoot.BeanLearn.MyFirstBean;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/User")
public class UserService {

    @Autowired
    MyFirstBean myFirstBean;

    @GetMapping(path = "/GetName")
    public String UserName(){
        System.out.println("Request Received");
        String name = "Vivek";
        return name;
    }

    @GetMapping(path = "/CreateUser")
    public String CreateUser(@RequestParam("name") String userName,
                             @RequestParam(value = "email", required = false) String userEmail){

        return userEmail + " , " + userName;
    }

}
