package conceptAndCoding.SpringBoot.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
@RequestMapping(path = "/Product")
@ResponseBody
public class ProductService {

    @RequestMapping(method = RequestMethod.GET, path = "/GetProductName")
    public ResponseEntity<String> Product(){
        String name = "laptop";

        return new ResponseEntity<>(name, HttpStatus.OK);
    }
}
