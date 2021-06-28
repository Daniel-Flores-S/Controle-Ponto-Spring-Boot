package com.ControlePonto.ControlePonto.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Occurrences {
    private Long id;
    private String name;
    private String description;

}
