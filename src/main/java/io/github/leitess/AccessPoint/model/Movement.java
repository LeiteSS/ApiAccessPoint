package io.github.leitess.AccessPoint.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movement
{
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovementId implements Serializable
    {
        private long idMovement;

        private long idUser;
    }

    @Id
    @EmbeddedId
    private MovementId id;

    private LocalDateTime inputDate;

    private LocalDateTime outputDate;

    private BigDecimal stayPeriod;

    @ManyToOne
    private Occurrence occurrence;

    @ManyToOne
    private Calendar specialDate;
}
