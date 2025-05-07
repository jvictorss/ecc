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
@Table(name = "casal")
@SequenceGenerator(
        name = "sq_casal_id",
        sequenceName = "sq_casal_id",
        allocationSize = 1
)
public class CasalEntity extends BaseEntity {
    // Dados dele
    @NotNull
    @NotBlank
    private String nomeEle;
    @NotNull
    @NotBlank
    private String apelidoEle;
    @NotNull
    @NotBlank
    private String telefoneEle;
    @NotNull
    @NotBlank
    private String emailEle;
    @NotNull
    @NotBlank
    private String dataNascimentoEle;

    private String dataFalecimentoEle;

    // Dados dela
    @NotNull
    @NotBlank
    private String nomeEla;
    @NotNull
    @NotBlank
    private String apelidoEla;
    @NotNull
    @NotBlank
    private String telefoneEla;
    @NotNull
    @NotBlank
    private String emailEla;
    @NotNull
    @NotBlank
    private String dataNascimentoEla;
    private String dataFalecimentoEla;

    // Dados do casal
    private String dataCasamentoReligioso;
    @NotNull
    @NotBlank
    private String dataCasamentoCivil;
    @NotNull
    @NotBlank
    private String endereco;
    @NotNull
    @NotBlank
    private String bairro;
    @NotNull
    @NotBlank
    private String cidade;
    @NotNull
    @NotBlank
    private String estado;
    @NotNull
    @NotBlank
    private String paroquiaEcc;
    private String paroquiaAtual;
    @NotNull
    @NotBlank
    private String dataPrimeiraEtapa;
    private String dataSegundaEtapa;
    private String dataTerceiraEtapa;

    private Boolean isActive;
}
