package org.ecc.bo;

import org.ecc.entity.CasalEntity;
import org.ecc.entity.DioceseEntity;
import org.ecc.repository.CasalRepository;
import org.ecc.repository.DioceseRepository;
import org.springframework.stereotype.Component;

@Component
public class CasalBO extends BaseBO<CasalEntity, Long> {

    public CasalBO(CasalRepository casalRepository) {
        super(casalRepository);
    }

    @Override
    public Long manterObject(CasalEntity dto) throws Exception {
        if (dto.getDataFalecimentoEle() != null || dto.getDataFalecimentoEla() != null) {
            dto.setAtivo(false);
        }

        return super.manterObject(dto);
    }

}
