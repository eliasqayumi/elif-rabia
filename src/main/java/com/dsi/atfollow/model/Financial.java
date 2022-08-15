package com.dsi.atfollow.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Financial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    private String theContractor;
    private String discoveryAndContactFeeEntry;
    private String discoveryAndContactFee;

    private Date date;
    private String dateInYear;
    private String progressNo;

    private Double expenditureSF;
    private Double ff;
    private Double KDV;

    private Double totalPayment;
    private Double remainder;
    private Float cashRealization;

    private Double agreement;
    private String part;
}
