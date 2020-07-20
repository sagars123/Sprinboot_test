package org.codejudge.sb.service;

import org.codejudge.sb.common.LeadDetailRequest;
import org.codejudge.sb.common.LeadDetailsResponse;
import org.codejudge.sb.common.MarkLeadSuccessResponse;
import org.codejudge.sb.common.ResourceNotFoundException;
import org.codejudge.sb.common.UpdateLeadResponse;
import org.codejudge.sb.dao.ILeadRepository;
import org.codejudge.sb.dao.LeadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LeadManagerService implements ILeadManagerService {

  @Autowired
  private ILeadRepository leadRepository;


  public LeadDetailsResponse getLeadDetailsById(Long id) {
    LeadDetailsResponse fetchLeadDetailsResponse = new LeadDetailsResponse();
    try {
      fetchLeadDetailsResponse = LeadRepositoryMapper.mapEntityToResponse(leadRepository.getById(id));
    } catch (Exception e) {
      throw new ResourceNotFoundException(HttpStatus.NOT_FOUND,"id not found");
    }

    return fetchLeadDetailsResponse;
  }

  public LeadDetailsResponse generateLead(LeadDetailRequest leadDetailRequest) {
    LeadDetailsResponse response = null;
    try { 
      LeadEntity entity = LeadRepositoryMapper.mapRequestToEntity(leadDetailRequest);
      entity = leadRepository.save(entity);
      response = LeadRepositoryMapper.mapEntityToResponse(entity);
    } catch (Exception e) {
      response.setStatus("failure");
      return response;
    }
    
    return response;
  }

  public UpdateLeadResponse updateLeadDetails(LeadDetailRequest leadDetailRequest, Long id) {
    UpdateLeadResponse updateLeadResponse = new UpdateLeadResponse();
    try {
      LeadEntity entity = LeadRepositoryMapper.mapRequestToEntity(leadDetailRequest);
      entity = leadRepository.save(entity);
      updateLeadResponse.setStatus("success");
    } catch (Exception e) {
      updateLeadResponse.setStatus("failure");
      updateLeadResponse.setReason("Exception Occured while updating " + e);
    }
    return updateLeadResponse;
  }

  public UpdateLeadResponse deleteLeadDetailsById(Long id) {
    UpdateLeadResponse updateLeadResponse = new UpdateLeadResponse();
    try {
      leadRepository.delete(id);
      updateLeadResponse.setStatus("success");
    } catch (Exception e) {
      updateLeadResponse.setStatus("failure");
      updateLeadResponse.setReason("Exception Occured while deleting " + e);
    }
    return updateLeadResponse;
  }

  public MarkLeadSuccessResponse markLeadById(Long id, String communication) {
    MarkLeadSuccessResponse markLeadSuccessResponse = new MarkLeadSuccessResponse();
    try {
      LeadEntity entity = leadRepository.getById(id);
      entity.setCommunication(communication);
      entity = leadRepository.save(entity);
      markLeadSuccessResponse.setStatus("success");
      markLeadSuccessResponse.setCommunication(communication);
      return markLeadSuccessResponse;
    } catch (Exception e) {
      markLeadSuccessResponse.setStatus("failure");
      return markLeadSuccessResponse;
    }

  }
}
