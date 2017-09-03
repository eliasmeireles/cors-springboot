package br.com.appteste.appteste.controller;

import br.com.appteste.appteste.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user/")
public class UsuarioController {


    @RequestMapping(value = "new", produces = "application/json; charset=UTF-8")
    private ResponseEntity<Usuario> newUser(@RequestBody Usuario usuario) {
        System.out.println(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }
}
