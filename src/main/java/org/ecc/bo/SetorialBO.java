package org.ecc.bo;

import org.ecc.entity.SetorialEntity;
import org.ecc.repository.SetorialRepository;
import org.springframework.stereotype.Component;

@Component
public class SetorialBO extends BaseBO<SetorialEntity, Long> {

    public SetorialBO(SetorialRepository setorialRepository) {
        super(setorialRepository);
    }

//    public SetorialEntity save(SetorialEntity setorial) {
//        try {
//            Long id = this.manterObject(setorial);
//            return ((SetorialRepository) this.baseRepository).findById(id).orElseThrow(() -> new RuntimeException("Setorial não encontrado após salvar"));
//        } catch (Exception e) {
//            throw new RuntimeException("Erro ao salvar Setorial", e);
//        }
//    }
}
