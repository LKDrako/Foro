package alura.foro.foro.domain.usuario.validaciones;

import alura.foro.foro.domain.usuario.RegistroUsuarioDTO;

public interface ValidadorDeUsuario {

    public void validate(RegistroUsuarioDTO RegistroUsuarioDTO);
}