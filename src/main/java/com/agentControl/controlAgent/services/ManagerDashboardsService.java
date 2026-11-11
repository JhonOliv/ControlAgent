package com.agentControl.controlAgent.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agentControl.controlAgent.DTOs.requests.jira.CreateDashboardDtoRequest;
import com.agentControl.controlAgent.DTOs.responses.jira.DashboardDtoResponse;
import com.agentControl.controlAgent.repositories.BoardRepository;

@Service
public class ManagerDashboardsService implements ManagerDashboards {
	
	@Autowired
	private BoardRepository repositoryBoard;

	@Override
	public DashboardDtoResponse createDashboard(CreateDashboardDtoRequest request) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public DashboardDtoResponse findDashboard(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}
