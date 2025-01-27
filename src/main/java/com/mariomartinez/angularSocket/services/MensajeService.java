package com.mariomartinez.angularSocket.services;


import com.mariomartinez.angularSocket.repositories.MensajeRepository;
import com.mariomartinez.angularSocket.models.Mensaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    // Save message
    public Mensaje guardarMensaje (Mensaje mensaje){
        return mensajeRepository.save(mensaje);
    }

    // Obtain all messages
    public List<Mensaje> obtenerTodosLosMensajes(){
        return mensajeRepository.findAll();
    }

    // Obtain messages from specific user
    public List<Mensaje> obtenerMensajesPorUsuario (String username){
        return mensajeRepository.findByUsername(username);
    }

}
