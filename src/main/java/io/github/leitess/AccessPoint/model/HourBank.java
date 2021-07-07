package io.github.leitess.AccessPoint.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.ManyToOne;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class HourBank
{
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class HourBankId implements Serializable
    {
        private long idBankHour;

        private long idMovement;

        private long idUser;
    }

    @Id
    @EmbeddedId
    private HourBankId id;

    @ManyToOne
    private UserCategory userCategory;

    private LocalDateTime workedHours;

    private BigDecimal quantityWorkedHours;

    private BigDecimal balanceWorkedHours;
}
