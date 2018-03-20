package com.company.manager;

import com.company.model.Usuario;

public class ManagerUsuarios {

    public Usuario[] usuarios = new Usuario[100];

    public void crearUsuario(String nombreusuario, String contraseña) {
        for (int i = 0; 1 < usuarios.length; i++)
            if (usuarios[i] == null) {
                usuarios[i] = new Usuario();
                usuarios[i].nombreusuario = nombreusuario;
                usuarios[i].contraseña = contraseña;
                break;
            }
    }

    public boolean  comprovarUsuario (String nombreusuario , String contraseña) {

        for (int i = 0; 1 < usuarios.length; i++) {
            if (usuarios[i] != null && usuarios[i].nombreusuario.equals(nombreusuario) && usuarios[i].contraseña.equals(contraseña);
            return true;
        }
        return false;
    }
}

