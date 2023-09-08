package br.com.example.restExemplo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

//agrega responceBody e controller
//poderia ser feito se adicionasse @controller e @responceController
@RestController

public class GreetingController {
private static final String templat = "hello, %s! ";
//papel desse cara é mockar um id
private final AtomicLong counter = new AtomicLong();
   //caminho padrão
    @RequestMapping("/greetting")
//@requestParam, ele é um query param, ou query string.
public Greeting greeting (@RequestParam(value = "name", defaultValue = "world") String name){
return  new Greeting(counter.incrementAndGet(), String.format(templat, name));
}

}
