package org.codejudge.sb.controller;

import io.swagger.annotations.ApiOperation;

import org.codejudge.sb.common.LeadDetailRequest;
import org.codejudge.sb.common.LeadDetailsResponse;
import org.codejudge.sb.common.MarkLeadSuccessResponse;
import org.codejudge.sb.common.UpdateLeadResponse;
import org.codejudge.sb.service.ILeadManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AppController {

  @Autowired
  private ILeadManagerService leadManagerService;

  @ApiOperation("This is the hello world api")
  @GetMapping("/hello-world")
  public String hello() {
    return "Hello World!!";
  }

  @RequestMapping(value = "/api/leads",
      method = RequestMethod.GET)
  @ApiOperation(value = "Get leads by leadId.")
  public @ResponseBody LeadDetailsResponse getLeadsByLeadId(@RequestParam("lead_id") Long leadId)
      throws Exception {
    return leadManagerService.getLeadDetailsById(leadId);
    
  }

  @RequestMapping(value = "/api/leads",
      method = RequestMethod.PUT)
  @ApiOperation(value = "update leads by leadId.")
  public @ResponseBody UpdateLeadResponse updateLeadsByLeadId(@RequestParam("lead_id") Long leadId,
      @RequestBody LeadDetailRequest request) throws Exception {
    return leadManagerService.updateLeadDetails(request, leadId);
  }

  @RequestMapping(value = "/api/leads",
      method = RequestMethod.DELETE)
  @ApiOperation(value = "delete leads by leadId.")
  public @ResponseBody UpdateLeadResponse deleteLeadsByLeadId(@RequestParam("lead_id") Long leadId)
      throws Exception {
    return leadManagerService.deleteLeadDetailsById(leadId);
  }


  @RequestMapping(value = "/api/mark_lead",
      method = RequestMethod.PUT)
  @ApiOperation(value = "Mark leads by leadId.")
  public @ResponseBody MarkLeadSuccessResponse markLeadsByLeadId(
      @RequestParam("lead_id") Long leadId, @RequestBody String communication) throws Exception {
    return leadManagerService.markLeadById(leadId, communication);
  }


}
