package request;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {


    String name = "Henrique";

    // GET é uma requisição de busca na API

    @GetMapping("/hello")
    public String helloWorld() {
        return "Primeira chamada de serviço de API";
    }

    @PostMapping("/user")
    public String helloWorld(@RequestBody UserRequest userRequest) {
        return "Primeira chama de API: " + userRequest.getName();
    }

    @GetMapping
    public UserRequest getUser(@RequestParam UUID userID) {
        return null;
    }

    @GetMapping("/user/id-do-usuario")
    public int getById(UserRequest userRequest) {
        return userRequest.getId();
    }

    @PutMapping
    public UserRequest updateUser(UserRequest userRequest) {
        System.out.println("Chegou o update");
        return userRequest;
    }
}



/*

teremos o POST que vai receber um @RequestBody UserRequest userRequest

no get, não recebe nada e retorna um List<UserRequest>

no getById retorna um UserRequest e recebe um Id

no update retorna um UserRequest e recebe um UserRequest e Id

no delete temos que ver se não vamos retornar nada ou se vamos retornar uma mensagem (recebemos um id)
consegue mapear isso mais ou menos?
 */
