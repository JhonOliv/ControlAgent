package com.agentControl.controlAgent.DTOs.responses.jira;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public record DashboardDtoResponse(String status, String msg) {

}
