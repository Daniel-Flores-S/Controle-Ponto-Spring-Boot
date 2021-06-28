package com.ControlePonto.ControlePonto.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class WorkJourney {
    private Long id;
    private String description;
}
