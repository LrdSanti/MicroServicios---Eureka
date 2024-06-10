package com.microservicio.usuario.usuario_service.exceptions;

public class ResourcerNotFoundException extends  RuntimeException{

    public ResourcerNotFoundException(){
        super("Resourcer not found in the server");
    }


    public ResourcerNotFoundException(String message){
        super(message);
    }


}
