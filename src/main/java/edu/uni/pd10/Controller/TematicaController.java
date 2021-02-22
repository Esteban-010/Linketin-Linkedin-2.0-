package edu.uni.pd10.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.uni.pd10.Service.TematicaService;
import edu.uni.pd10.bean.Tematica;

@RestController
@RequestMapping("/tematica")
public class TematicaController {
    @Autowired
    TematicaService tematicaService;

    @GetMapping("/{id}")
    public Tematica getTemetica(@PathVariable int id){
        return tematicaService.getTematica(id);
    }
}
