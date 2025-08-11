package org.ecc.bo;

import org.ecc.entity.ParoquiaEntity;
import org.ecc.repository.ParoquiaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ParoquiaBO extends BaseBO<ParoquiaEntity, Long> {

    private final ParoquiaRepository paroquiaRepository;

    public ParoquiaBO(ParoquiaRepository paroquiaRepository) {
        super(paroquiaRepository);
        this.paroquiaRepository = paroquiaRepository;
    }

    public List<ParoquiaEntity> findAll() {
        return paroquiaRepository.findAll();
    }
}
