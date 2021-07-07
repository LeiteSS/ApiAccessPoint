package io.github.leitess.AccessPoint.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class User
{
    @Id
    private Long id;

    @ManyToOne
    private UserCategory userCategory;

    private String name;

    @ManyToOne
    private Company company;

    @ManyToOne
    private LevelAccess levelAccess;

    @ManyToOne
    private WorkTime workTime;

    private BigDecimal lateTolerance;

    private LocalDateTime startWorkingDay;

    private LocalDateTime endOfWorkday;
}
