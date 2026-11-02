package com.agentControl.controlAgent.DTOs.requests.jira;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public record CreateDashboardDtoRequest(String name, String[] editPermission, 
		String descripstion, String[] sharePermission) {

}
