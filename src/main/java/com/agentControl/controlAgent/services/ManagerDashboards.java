package com.agentControl.controlAgent.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.agentControl.controlAgent.DTOs.requests.jira.CreateDashboardDtoRequest;
import com.agentControl.controlAgent.DTOs.responses.jira.DashboardDtoResponse;
import com.agentControl.controlAgent.configuration.JiraConnectionConfiguration;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@FeignClient(
		name = "jiraApi",
		url = "${jira.url}",
		configuration = JiraConnectionConfiguration.class
		)
public interface ManagerDashboards {

	@PostMapping(
			value = "/rest/agile/1.0/board",
			consumes = "application/json"
			)
	public DashboardDtoResponse  createDashboard( @RequestBody CreateDashboardDtoRequest request);
	
	@GetMapping(
			value = "/rest/agile/1.0/board/{boardId}",
			consumes = "application/json"
			)
	public DashboardDtoResponse findDashboard(@PathVariable("boardId") String boardId);
	 
}
