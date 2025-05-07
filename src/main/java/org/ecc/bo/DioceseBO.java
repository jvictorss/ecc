package org.ecc.bo;

import org.ecc.entity.DioceseEntity;
import org.ecc.repository.DioceseRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DioceseBO extends BaseBO<DioceseEntity, Long> {

    private final DioceseRepository dioceseRepository;

    public DioceseBO(DioceseRepository dioceseRepository) {
        super(dioceseRepository);
        this.dioceseRepository = dioceseRepository;
    }

    public List<DioceseEntity> findAll() {
        return dioceseRepository.findAll();
    }
}
