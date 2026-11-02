package com.agentControl.controlAgent.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tab_executionProcess")
public class ExecutionProcess {

	@Column(nullable = false)
	@ManyToOne
	private AgentExecution agent;
	@Column(nullable = false)
	@ManyToOne
	private Projects project;
	@Column(nullable = false)
	@ManyToOne
	private Tasks task;
	@Column(length = 255, nullable = false)
	private String logExcution;
	
}
