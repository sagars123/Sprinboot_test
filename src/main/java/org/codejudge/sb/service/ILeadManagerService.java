package org.codejudge.sb.service;

import org.codejudge.sb.common.LeadDetailRequest;
import org.codejudge.sb.common.LeadDetailsResponse;
import org.codejudge.sb.common.MarkLeadSuccessResponse;
import org.codejudge.sb.common.UpdateLeadResponse;

public interface ILeadManagerService {
/**
 * 
 * @param id
 * @return
 */
  public LeadDetailsResponse getLeadDetailsById(Long id);
  /**
   * 
   * @param leadDetailRequest
   * @return
   */
  public LeadDetailsResponse generateLead(LeadDetailRequest leadDetailRequest);
/**
 * 
 * @param leadDetailRequest
 * @param id
 * @return
 */
  public UpdateLeadResponse updateLeadDetails(LeadDetailRequest leadDetailRequest, Long id);
/**
 * 
 * @param id
 * @return
 */
  public UpdateLeadResponse deleteLeadDetailsById(Long id);
/**
 * 
 * @param id
 * @param communication
 * @return
 */
  public MarkLeadSuccessResponse markLeadById(Long id, String communication);

}
