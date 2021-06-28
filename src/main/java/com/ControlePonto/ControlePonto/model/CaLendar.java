package com.ControlePonto.ControlePonto.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CaLendar {
    private Long id;
    private TypeDate typeDate;
    private LocalDateTime dateSpecial;

}
