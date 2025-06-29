package conceptAndCoding.SpringBoot.BeanLearn;

import org.springframework.stereotype.Component;


// Component --> tells String that it has to create and manage the object

@Component
public class MyFirstBean {
    String userName;
    String email;

    MyFirstBean(){
        // If I have given @Component --> I need to provide default constructor!
        System.out.println("Constructor with 0 Params");
    }

    MyFirstBean(String userName, String email){
        System.out.println("My custom default constructor");
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
