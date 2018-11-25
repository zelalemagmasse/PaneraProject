package com.panera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panera.model.ClaimAdjustment;
import com.panera.repo.PaneraRepo;
@Service
public class PaneraServiceImpl implements PaneraService {
	@Autowired
	private PaneraRepo paneraRepo;

	@Override
	public void createClaimAdjustment(ClaimAdjustment clmdadjs) throws Exception {
		if(clmdadjs==null) {
			throw new NullPointerException("Claim adjustment can not be null"); 
		}
		paneraRepo.saveAndFlush(clmdadjs);
		
	}

	@Override
	public ClaimAdjustment getClaimAdjustment(Long id) throws Exception {
		if(id==null) {
			throw new NullPointerException("Claim adjustment ID can not be null"); 
		}
		
		return paneraRepo.getOne(id);
	}

	@Override
	public List<ClaimAdjustment> getClaimAdjustmentList(List<String> claimKeys) {
		if(claimKeys==null||claimKeys.isEmpty()) {
			throw new NullPointerException("Claim  adjustment key can not be null"); 
		}
		return paneraRepo.getClaimAdjustmentByClaimKey(claimKeys);
	}

	@Override
	public List<ClaimAdjustment> getAllClaimAdjustment() {
		return paneraRepo.findAll();
	}
		
	
}
