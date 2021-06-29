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
public class Movement {

        @AllArgsConstructor
        @NoArgsConstructor
        @EqualsAndHashCode
        @Embeddable
        public class MovementId implements Serializable {
            private Long idMoviment;
            private Long idUser;
        }

        @EmbeddedId
        private MovementId id;
        private LocalDateTime dateEntrance;
        private LocalDateTime dateExit;
        private BigDecimal timeCourse;
        private Occurrences occurrences;
        private Calendario calendar;




}
