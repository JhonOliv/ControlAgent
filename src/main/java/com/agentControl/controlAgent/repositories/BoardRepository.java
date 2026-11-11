package com.agentControl.controlAgent.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agentControl.controlAgent.models.Boards;

public interface BoardRepository extends JpaRepository<Boards, String> {

}
