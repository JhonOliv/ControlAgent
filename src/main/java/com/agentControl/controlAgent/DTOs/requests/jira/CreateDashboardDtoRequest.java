package com.agentControl.controlAgent.DTOs.requests.jira;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public record CreateDashboardDtoRequest(String name, String boardType) {}
