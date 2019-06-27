package hello;


import com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController


public class HomeController {
   public Map<String, Object> greeting(){
return Collections.singletonMap("massage","HelloWorld");
    }
}
