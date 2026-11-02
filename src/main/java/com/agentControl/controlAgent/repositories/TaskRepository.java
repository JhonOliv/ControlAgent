package com.agentControl.controlAgent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agentControl.controlAgent.models.Tasks;

public interface TaskRepository extends JpaRepository<Tasks, String> {

}
