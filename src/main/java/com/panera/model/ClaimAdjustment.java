package com.panera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity

public class ClaimAdjustment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @Column
	private String claimKey;
    
    @Column
	private String batchKey;
    
    @Column
	private String status;
    
    @Column
	private String patientConditonCode;
     
    @Column
	private String patientDescription;

	
    
}
