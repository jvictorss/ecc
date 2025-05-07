package org.ecc.entity;

    import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    import javax.persistence.*;
    import javax.validation.constraints.Email;
    import javax.validation.constraints.NotBlank;
    import javax.validation.constraints.NotNull;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    @JsonIgnoreProperties({"hibernateLazyInitializer"})
    @Entity
    @Table(name = "setorial")
    @SequenceGenerator(
            name = "sq_setorial_id",
            sequenceName = "sq_setorial_id",
            allocationSize = 1
    )
    public class SetorialEntity extends BaseEntity {

        @NotNull
        @NotBlank
        private String nomeSetor;

        @NotNull
        @NotBlank
        private String nomeCasalSetorial;

        @NotNull
        @NotBlank
        private String contatoCasalSetorial;

        @NotNull
        @NotBlank
        @Email
        private String emailCasalSetorial;

        @NotNull
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "diocese_id", nullable = false)
        private DioceseEntity diocese;

        private String observacao;
    }