package org.codejudge.sb.service;

import org.codejudge.sb.common.LeadDetailRequest;
import org.codejudge.sb.common.LeadDetailsResponse;
import org.codejudge.sb.dao.LeadEntity;

public class LeadRepositoryMapper {

  public static LeadDetailsResponse mapEntityToResponse(LeadEntity leadEntity) {
    LeadDetailsResponse leadDetailsResponse = new LeadDetailsResponse();
    leadDetailsResponse.setId(leadEntity.getId());
    leadDetailsResponse.setFirstName(leadEntity.getFirstName());
    leadDetailsResponse.setEmail(leadEntity.getEmail());
    leadDetailsResponse.setLastName(leadEntity.getLastName());
    leadDetailsResponse.setMobile(leadEntity.getMobile());
    leadDetailsResponse.setStatus(leadEntity.getStatus());
    leadDetailsResponse.setLocationType(leadEntity.getLocationType());

    return leadDetailsResponse;
  }

  public static LeadEntity mapRequestToEntity(LeadDetailRequest response) {
    LeadEntity entity = new LeadEntity();
    
    entity.setCommunication(response.getCommunication());
    entity.setEmail(response.getEmail());
    entity.setFirstName(response.getFirstName());
    entity.setId(response.getId());
    entity.setLastName(response.getLastName());
    entity.setLocationType(response.getLocationType());
    entity.setMobile(response.getMobile());
    entity.setStatus(response.getStatus());
    
    return entity;
  }
  
}
