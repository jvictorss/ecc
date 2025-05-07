package org.ecc.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name = "conjuge")
@SequenceGenerator(
        name = "sq_conjuge_id",
        sequenceName = "sq_conjuge_id",
        allocationSize = 1
)
public class ConjugeEntity extends BaseEntity {
    @NotNull
    @NotBlank
    private String nome;

    @NotNull
    @NotBlank
    private String cidade;

    @NotNull
    @NotBlank
    private String estado;

    private String observacao;
}
