package org.ecc.bo;

import org.ecc.entity.SetorialEntity;
import org.ecc.repository.SetorialRepository;
import org.springframework.stereotype.Component;

@Component
public class SetorialBO extends BaseBO<SetorialEntity, Long> {

    public SetorialBO(SetorialRepository setorialRepository) {
        super(setorialRepository);
    }
}
