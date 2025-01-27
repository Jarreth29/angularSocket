package com.mariomartinez.angularSocket.models;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "mensajes")

public class Mensaje {

    @Id
    private String id;
    private String autor;
    private String username;
    private String contenido;
    private String color;
    private LocalDateTime fechaEnvio;

    public Mensaje() {
    }

    public Mensaje(String autor, String username, String contenido, String color, LocalDateTime fechaEnvio) {
        this.autor = autor;
        this.username = username;
        this.contenido = contenido;
        this.color = color;
        this.fechaEnvio = fechaEnvio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDateTime fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}
