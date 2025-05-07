package org.ecc.repository;

import org.ecc.entity.BaseEntity;
import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import javax.transaction.Transactional;
import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, ID extends Serializable>
        extends JpaRepository<T, ID>, DataTablesRepository<T, ID>, JpaSpecificationExecutor<T> {

    @Transactional
    @Modifying
    @Query("UPDATE #{#entityName} set ativo=?2 WHERE id=?1")
    void inativarById(ID id, Boolean status);
}