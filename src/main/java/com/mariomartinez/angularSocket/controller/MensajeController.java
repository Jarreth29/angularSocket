package com.mariomartinez.angularSocket.controller;


import com.mariomartinez.angularSocket.models.Mensaje;
import com.mariomartinez.angularSocket.services.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mensajes")
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    //Endpoint para guardar un mensaje
    @PostMapping
    public Mensaje guardarMensaje (@RequestBody Mensaje mensaje) {
        return mensajeService.guardarMensaje(mensaje);
    }

    // Endpoint para obtener todos los mensajes
    @GetMapping
    public List<Mensaje> obtenerTodosLosMensajes(){
        return mensajeService.obtenerTodosLosMensajes();
    }

    @GetMapping("/usuario/{username}")
    public List<Mensaje> obtenermensajesPorUsuario(@PathVariable String username){
        return mensajeService.obtenerMensajesPorUsuario(username);
    }
}
