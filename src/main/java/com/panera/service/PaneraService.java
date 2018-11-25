package com.panera.service;

import java.util.List;

import com.panera.model.ClaimAdjustment;

public interface PaneraService {
	public void createClaimAdjustment(ClaimAdjustment clmdadjs) throws Exception;
	public ClaimAdjustment getClaimAdjustment(Long id) throws Exception;
	public List<ClaimAdjustment> getClaimAdjustmentList(List<String> claimKeys);
	public List<ClaimAdjustment> getAllClaimAdjustment();
}

