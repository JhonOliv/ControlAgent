package com.agentControl.controlAgent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agentControl.controlAgent.models.ExecutionProcess;

public interface ExecutionProcessRepository extends JpaRepository<ExecutionProcess, String>{

}
