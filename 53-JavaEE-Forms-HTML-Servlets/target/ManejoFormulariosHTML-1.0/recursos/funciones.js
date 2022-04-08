function validarForma(forma){//funcion que recibe de la forma manejoFormulariosHTML "this"
    var usuario = forma.usuario; //Obtiene usuario de la forma
    if(usuario.value == "" || usuario.value == "Escribir usuario"){//Si el campo usuario esta vacio o si no ha sido modificado
        alert("Debe proporcionar un nombre de usuario");//mostrar alerta de que debe ser agregado
        usuario.focus();//resaltar usuario
        usuario.select(); //mandar la seleccion ahi para que sepa que debe modificar
        return false;
    }
    
    var password = forma.password; //obtener el password de la forma
    if(password.value == "" || password.value.length < 3){//validacion del largo del password
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();//resaltar
        password.select();//mandar la seleccion ahi
        return false;
    }
    
    var tecnologias = forma.tecnologia;//obtener tecnologias de la forma
    var checkSeleccionado = false;
    
    for(var i = 0; i < tecnologias.length; i++){//los checkbox mandan arrays, asi que se usa un for loop
        if(tecnologias[i].checked){//si de tecnologias esta seleccionado
            checkSeleccionado = true;//entonces mandar true
        }
    }
    
    if(!checkSeleccionado){//elemento requerido, rechazar envio si no hay nada seleccionado
        alert("Debe seleccionar una tecnología");
        return false;
    }
    
    var generos = forma.genero;//recuperar genero de la forma
    var radioSeleccionado = false;
    
    for(var i = 0; i < generos.length; i++){
        if(generos[i].checked){//revisar si hay cuadros selecionados
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){//Si no hay genero seleccionado
        alert("Debe seleccionar un genero");//
        return false;
    }
    
    var ocupacion = forma.ocupacion;//recuperar ocupacion de la forma
    if(ocupacion.value == ""){// si esta vacio
        alert("Debe seleccionar una ocupacion");//alertar
        return false;
    }
    
    //Formulario es valido
    alert("Formulario valido, enviado datos al servidor");// si no hay problemas, entonces informar
    return true; // y seguir adelante
}