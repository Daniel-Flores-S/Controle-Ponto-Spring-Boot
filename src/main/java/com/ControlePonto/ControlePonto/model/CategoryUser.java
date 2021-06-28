package com.ControlePonto.ControlePonto.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoryUser {
    private Long id;
    private String description;
}
