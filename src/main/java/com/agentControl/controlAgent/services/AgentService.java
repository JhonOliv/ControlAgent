package com.agentControl.controlAgent.services;

import org.springframework.stereotype.Service;
import com.agentControl.controlAgent.DTOs.responses.AgentControlResponseDTO;

@Service
public interface AgentService {
	
	public AgentControlResponseDTO agentCreate();
	
	
}
