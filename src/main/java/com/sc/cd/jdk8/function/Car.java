package com.sc.cd.jdk8.function;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String name;
    private String code;
    private Double limit;
    private Boolean isNew;
    private Double weight;
    private Double height;
    private Boolean isGT5Year;
}
