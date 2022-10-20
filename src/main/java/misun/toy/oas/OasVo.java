package misun.toy.oas;

import lombok.Data;

@Data
public class OasVo {
    
 
    private String id ;

    public String getGreeting(){

        return "Hello " + id;
    }

}
