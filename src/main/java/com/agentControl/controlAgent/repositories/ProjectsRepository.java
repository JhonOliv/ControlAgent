package com.agentControl.controlAgent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agentControl.controlAgent.models.Projects;

public interface ProjectsRepository extends JpaRepository<Projects, String> {

}
