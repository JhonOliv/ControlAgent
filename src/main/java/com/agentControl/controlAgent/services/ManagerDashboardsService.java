package com.agentControl.controlAgent.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import com.agentControl.controlAgent.DTOs.responses.jira.DashboardDtoResponse;
import com.agentControl.controlAgent.configuration.JiraConnectionConfiguration;

@Service
public class ManagerDashboardsService implements ManagerDashboards {

	@Override
	public DashboardDtoResponse createDashboard(String name, String description, String[] editPermission,
			String[] sharePermission) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public DashboardDtoResponse updateDashboardData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DashboardDtoResponse findDashboard(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DashboardDtoResponse deleteDashboard(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
