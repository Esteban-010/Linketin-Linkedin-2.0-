package edu.uni.pd10.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uni.pd10.Dao.UsuarioDao;
import edu.uni.pd10.bean.Usuario;

@Service
public class UsuarioService {
    @Autowired
    UsuarioDao usuarioDao;

    public Usuario LoginUsuario(String userName, String contrasenia){
        boolean res = usuarioDao.validarUsuario(userName, contrasenia);

        if(res){
            return usuarioDao.getUsuario(userName, contrasenia);
        }else{
            return null;
        }
    }

    public void registerUsuario(Usuario u){
        usuarioDao.setUsuario(u);
    }
}
