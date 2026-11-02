package com.agentControl.controlAgent.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.agentControl.controlAgent.DTOs.requests.jira.CreateDashboardDtoRequest;
import com.agentControl.controlAgent.DTOs.responses.jira.DashboardDtoResponse;
import com.agentControl.controlAgent.configuration.JiraConnectionConfiguration;

@FeignClient(
		name = "jiraApi",
		url = "${jira.url}",
		configuration = JiraConnectionConfiguration.class
		)
public interface ManagerDashboards {

	@PostMapping(
			value = "/rest/api/v3/dashboard",
			consumes = "application/json"	
			)
	public DashboardDtoResponse  createDashboard(CreateDashboardDtoRequest request);
	
	public DashboardDtoResponse	updateDashboardData();
	public DashboardDtoResponse findDashboard(String id);
	public DashboardDtoResponse deleteDashboard(String id);
	 
}
