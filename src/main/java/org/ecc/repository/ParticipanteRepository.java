package org.ecc.repository;

import org.ecc.entity.ParticipanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipanteRepository extends JpaRepository<ParticipanteEntity, Long> {
    List<ParticipanteEntity> findBySorteio(String sorteio);
}