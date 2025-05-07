package org.ecc.exceptions;

import org.ecc.dto.ErrorDTO;
import org.ecc.enums.ErrorCodesEnum;
import org.springframework.stereotype.Component;

import static org.ecc.constants.Constants.MSG_GENERIC;
import static org.ecc.constants.Constants.TITLE_GENERIC;

@Component
public class MensagemError {
    public static ErrorDTO gerarErrorDTO(String cod, String title, String msg){
        return ErrorDTO.builder()
                .codigo(cod)
                .titulo(title)
                .mensagem(msg)
                .build();
    }

    public static ErrorDTO gerarExceptionGenerica(Throwable e){
        return ErrorDTO.builder()
                .codigo(ErrorCodesEnum.COD_GENERICO.getCodigo())
                .titulo(TITLE_GENERIC)
                .mensagem(MSG_GENERIC)
                .exception(e.getClass().getSimpleName())
                .build();
    }
}
