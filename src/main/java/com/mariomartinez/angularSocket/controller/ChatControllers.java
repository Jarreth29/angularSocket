package com.mariomartinez.angularSocket.controller;


import com.mariomartinez.angularSocket.models.Mensaje;
import com.mariomartinez.angularSocket.repositories.MensajeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

@Controller

public class ChatControllers {

    @Autowired
    private MensajeRepository mensajeRepository;

    
    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibeMensaje(Mensaje mensaje) {
        mensaje.setFechaEnvio(LocalDateTime.now());

        if (mensaje.getUsername() == null || mensaje.getUsername().isEmpty()) {
            mensaje.setUsername("Usuario Anonimo");
        }

        Mensaje mensajeGuardado = mensajeRepository.save(mensaje);

        System.out.println("Mensaje guardado" + mensajeGuardado);

        return mensajeGuardado;
    }
}
