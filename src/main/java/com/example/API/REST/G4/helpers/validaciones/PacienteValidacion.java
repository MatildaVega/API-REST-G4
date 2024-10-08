package com.example.API.REST.G4.helpers.validaciones;

import com.example.API.REST.G4.modelos.Paciente;

public class PacienteValidacion {

    //INYECCION DE DEPENDENCIAS
    //LLAMAR A UNA CLASE DENTRO DE OTRA

    private Paciente paciente=new Paciente();

    //CREAR UN METODO PARA CADA DATO QUE DEBO VALIDAR

    public Boolean validarNombre(){
        return true;
    }

    public Boolean validarFechaNacimiento(){
        return true;
    }

    public Boolean validarCiudad(){
        return true;
    }

    public Boolean validarCorreo(){
        return true
    }
    public Boolean validarTelefono (){
        return true;
    }
    public Boolean validarGrupoIngresos(){
        return true;
    }
    public Boolean validarFechaAfiliacion(){
        return true
    }


}
