package com.dsi.atfollow.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer"})
public class PhysicalStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false, length = 100, name = "project_name")
    private String projectName;

    @Column(nullable = false, length = 100, name = "project_name_with_code")
    private String projectNameWithCode;

    @Column(nullable = false, length = 100, name = "project_code")
    private String projectCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = false, name = "neighbourhood_id")
    private Neighbourhood neighbourhood;
    private Date registrationDate;
    private Integer numberOfHangersMade;

    private Integer numberOfCadastreParcels;
    private Integer numberOfNewPlots;
    private Integer numberOfBusiness;

    private String stage;
    private String registrationYear;
    private String methodOfApplication;

    private Float area;
    private Float plannedPath;
    private Float path;

    private Float plannedStabilized;
    private Float stabilized;
    private Float registration;

    private Float wagesNumber;
    private Float plannedDrainage;
    private Float drainage;

    private Float plannedStoneCollection;
    private Float stoneCollection;
    private Float plannedLevelling;

    private Float levelling;
    private Float aggregationRate;
    private Float enterpriseNumberOfPlotsOld;

    private Float numberOfBusinessPlotsNew;
    private Float oldORTParcelFaceSize;
    private Float avgNewParcelFaceSize;

    private Float OKPRate;


}
