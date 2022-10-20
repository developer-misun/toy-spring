package misun.toy.oas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name ="OAS 예제")
@RestController
@RequestMapping("/oas")
public class OasController {
    
    @Operation(summary = "인사")
    @GetMapping("/greeting")
    public String getGreeting(){

        return "안녕하세요." ;
    }

    @GetMapping("/getOas")
    public OasVo getOasVo(){

        return new OasVo() ;
    }


}
