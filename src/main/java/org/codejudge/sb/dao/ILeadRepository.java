package org.codejudge.sb.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ILeadRepository extends CrudRepository<LeadEntity, Long> {


  @Query("SELECT ce from LeadEntity ce where id = :id")
  public LeadEntity getById(@Param("id") Long id);

//  @Modifying
//  @Query("update LeadEntity le set le.firstName=:firstName, le.lastName=:lastName, le.mobile=:mobile, le.email=:email, le.locationType=:locationType, le.locationString=:locationString where le.id=:id")
//  public void updateLeadDetailsByid(@Param("firstName") String firstName,
//      @Param("lastName") String lastName, @Param("mobile") String mobile,
//      @Param("email") String email, @Param("locationType") String locationType,
//      @Param("locationString") String locationString, @Param("id") Long id);
//
//
//  @Query("delete le from LeadEntity le where le.id = :id")
//  public void deleteLeadDetailsByid(@Param("id") Long id);
//
//
//  @Modifying
//  @Query("update le LeadEntity le set le.communication=:communication,le.status=contacted where le.id=:id")
//  public void updateCommunicationById(@Param("communication") String communication,
//      @Param("id") Long id);

}
