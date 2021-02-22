package edu.uni.pd10.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import edu.uni.pd10.bean.Tematica;
import edu.uni.pd10.bean.Curso;

@Repository
public class TematicaDao {
    @Autowired
    JdbcTemplate template;

    public Tematica getTematica(int id){
        String sql = "SELECT * FROM TEMATICA WHERE ID = ?";
        Tematica t = null;
        SqlRowSet rs = template.queryForRowSet(sql, id);
        if(rs.next()){
            t = new Tematica();
            t.setId(rs.getInt("ID"));
            t.setNombre(rs.getString("NOMBRE"));
            t.setListaCursos(null);
        }
        return t;
    }

    public void setCursos(List<Curso> lista, Tematica t){
        t.setListaCursos(lista);
    }
}