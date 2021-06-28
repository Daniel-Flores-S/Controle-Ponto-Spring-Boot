package com.ControlePonto.ControlePonto.model;

import lombok.*;

import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class User {
    private Long id;
    @ManyToOne
    private CategoryUser categoryUser;
    private String name;
    @ManyToOne
    private Company company;
    @ManyToOne
    private AccessLevel accessLevel;
    @ManyToOne
    private WorkJourney workJourney;
    private BigDecimal tolerance;
    private LocalDateTime initJourney;
    private LocalDateTime endJourney;
}
