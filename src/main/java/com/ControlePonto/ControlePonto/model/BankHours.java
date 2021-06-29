package com.ControlePonto.ControlePonto.model;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class BankHours {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class BankHoursId implements Serializable {
        private Long idBank;
        private Long idMoviment;
        private Long idUser;
    }
    @EmbeddedId
    private BankHoursId id;
    private LocalDateTime dateJob;
    private BigDecimal quantityHours;
    private BigDecimal balanceHours;

}
