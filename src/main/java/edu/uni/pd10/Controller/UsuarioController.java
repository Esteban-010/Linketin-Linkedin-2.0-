package edu.uni.pd10.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uni.pd10.Service.UsuarioService;
import edu.uni.pd10.bean.Usuario;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/login/{userName}/{contrasenia}")
    public Usuario LoginUsuario(@PathVariable String userName, @PathVariable String contrasenia){
        return usuarioService.LoginUsuario(userName, contrasenia);
    }

    @PostMapping("/register")
    public void registerUsuario(@RequestBody Usuario u){
        usuarioService.registerUsuario(u);
    }
}
