package org.ecc.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CasalDto {

    private UUID id;
    @NotNull
    private ConjugeDto ele;
    @NotNull private ConjugeDto ela;
    private String dataCasamentoReligioso;
    @NotNull private String dataCasamentoCivil;
    @NotNull private String endereco;
    @NotNull private String bairro;
    @NotNull private String cidade;
    @NotNull private String estado;
    private String paroquiaEcc;
    private String paroquiaAtual;
    @NotNull private String dataPrimeiraEtapa;
    private String dataSegundaEtapa;
    private String dataTerceiraEtapa;
    private Boolean isActive;
}
