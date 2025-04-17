package request;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

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

    //POST
    @PostMapping
    public UserRequest postUser(UserRequest userRequest) {
        return userRequest;
    }

    //GET
    @GetMapping
    public List<UserRequest> getUser() {
        List<UserRequest> listausuario = new ArrayList<>();
        return listausuario;
    }

    //GETBYID
    @GetMapping("/user/id_do_usuario")
    public UserRequest getById(UserRequest userRequest) {
        return userRequest;
    }

    //UPDATE
    @PutMapping
    public UserRequest updateUser(UserRequest userRequest) {
        System.out.println("Chegou o update");
        return userRequest;
    }

    //DELETE
    @DeleteMapping
    public UserRequest deleteUser(UserRequest userRequest) {
        System.out.println("Deletar usuário?");
        return userRequest;
    }
}

/*

TO DO:
-   post (retorno = usuario com id | parametros = informações do usuario (como UserRequest))
-   get (retorno = lista de UserRequest | parametros = nada)
-   get-by-id (retorno = UserRequest | parametros = id)
-   update (retorno = UserRequest alterado | parametros = id + informações do usuario (como UserRequest))
-    delete (retorno = nada ou um aviso ou um http statuscode DELETED | parametros = id)

*/