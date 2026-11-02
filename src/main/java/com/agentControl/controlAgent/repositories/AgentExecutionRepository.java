package com.agentControl.controlAgent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agentControl.controlAgent.models.AgentExecution;

public interface AgentExecutionRepository extends JpaRepository<AgentExecution, String>{

}
