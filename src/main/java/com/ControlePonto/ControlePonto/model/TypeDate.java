package com.ControlePonto.ControlePonto.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class TypeDate {
    @Id
    private Long id;
    private String description;



}
