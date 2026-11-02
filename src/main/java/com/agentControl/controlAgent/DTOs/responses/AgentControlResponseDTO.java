package com.agentControl.controlAgent.DTOs.responses;

import com.agentControl.controlAgent.models.AgentType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public record AgentControlResponseDTO(
		AgentType type, String msgStatus
		) {

}
