package com.agentControl.controlAgent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agentControl.controlAgent.models.Execution;

public interface ExecutionRepository extends JpaRepository<Execution, String>{

}
