package org.ecc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "paroquia")
@SequenceGenerator(
        name = "sq_paroquia_id",
        sequenceName = "sq_paroquia_id",
        allocationSize = 1
)
public class ParoquiaEntity extends BaseEntity {

    @NotNull
    @NotBlank
    private String nomeParoquia;

    @NotNull
    @NotBlank
    private String cidade;

    @NotNull
    @NotBlank
    private String setorial;

    @NotNull
    @NotBlank
    private String estado;

//    @NotNull
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "diocese_id", nullable = false)
//    private DioceseEntity diocese;

    private String observacao;
}