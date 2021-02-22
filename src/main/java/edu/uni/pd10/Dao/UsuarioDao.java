package edu.uni.pd10.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import edu.uni.pd10.bean.Usuario;

@Repository
public class UsuarioDao {
    
    @Autowired
    JdbcTemplate template;

    public boolean validarUsuario(String userName, String contrasenia){
        String sql = "SELECT * FROM USUARIO WHERE USERNAME = ? AND CONTRA = ?";
        SqlRowSet rs = template.queryForRowSet(sql, userName, contrasenia);
        return rs.next();
    }
    public Usuario getUsuario(String userName, String contrasenia){
        String sql = "SELECT * FROM USUARIO WHERE USERNAME = ? AND CONTRA = ?";
        Usuario u = null;
        SqlRowSet rs = template.queryForRowSet(sql, userName, contrasenia);
        if(rs.next()){
            u = new Usuario();
            u.setId(rs.getInt("ID"));
            u.setUserName(rs.getString("USERNAME"));
            u.setNombres(rs.getString("NOMBRES"));
            u.setApellidoPaterno(rs.getString("APELLIDO_PAT"));
            u.setApellidoMaterno(rs.getString("APELLIDO_MAT"));
            u.setContrasenia(rs.getString("CONTRA"));
        }
        return u;
    }
    public void setUsuario(Usuario u){
        String sql = "INSERT INTO USUARIO VALUES(DEFAULT, ?, ?, ?, ?, ?)";
        template.update(sql, u.getUserName(), u.getNombres(), u.getApellidoPaterno(), u.getApellidoMaterno(), u.getContrasenia());
    }
}
