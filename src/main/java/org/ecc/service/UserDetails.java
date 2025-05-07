package org.ecc.service;

import org.ecc.entity.UsuarioEntity;
import org.ecc.enums.ErrorCodesEnum;
import org.ecc.exceptions.GenericException;
import org.ecc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetails implements UserDetailsService {

    private final UsuarioRepository repository;

    @Autowired
    public UserDetails(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public UsuarioEntity loadUserByUsername(String email) throws UsernameNotFoundException {

        Optional<UsuarioEntity> user = repository.findByEmail(email);

        user.orElseThrow(() -> new UsernameNotFoundException(email + " Não encontrado."));

        if(user.get().getAtivo().equals(Boolean.FALSE)){
            throw GenericException.builder()
                    .code(ErrorCodesEnum.COD_USUARIO.getCodigo())
                    .title("Erro ao efetuar login")
                    .detail("Acesso inativo, favor entrar em contato com o administrador")
                    .trace(null)
                    .build();
        }

        return user.get();
    }
}