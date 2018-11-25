package com.panera.Test;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.panera.config.DbConfiguration;
import com.panera.config.PaneraConfig;
import com.panera.model.ClaimAdjustment;
import com.panera.service.PaneraService;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PaneraConfig.class,DbConfiguration.class})
@Slf4j
public class PaneraServiceTest extends TestCase {
 @Autowired
 @Qualifier("PaneraService")
 private PaneraService paneraService;
	
	@Before
	public void setUp() throws Exception {
    
		assertNotNull(paneraService);

	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testCreateClaimingAdjustment () throws Exception {
		ClaimAdjustment claimAdjustment = new ClaimAdjustment();
		claimAdjustment.setBatchKey("bactchKey");
		claimAdjustment.setClaimKey("claimKey");
		claimAdjustment.setPatientConditonCode("patientConditonCode");
		claimAdjustment.setPatientDescription("patientDescription");
		claimAdjustment.setStatus("status");
		//paneraService.createClaimAdjustment(claimAdjustment);
		log.info("Created");
	
	}
	

}
