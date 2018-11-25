package com.panera.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.panera.model.ClaimAdjustment;
@Repository
public interface PaneraRepo extends JpaRepository<ClaimAdjustment,Long> {
 @Query("select * from ClaimAdjustment c where c.claimKey in (:claimKeys)")
		public List<ClaimAdjustment> getClaimAdjustmentByClaimKey(@Param("claimKeys")List<String> claimkeys);

}
