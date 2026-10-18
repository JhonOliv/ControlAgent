package com.agentControl.controlAgent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tab_execution")
public class Execution {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@ManyToOne
	private Tasks task;
	@ManyToOne
	private AgentExecution agent;
	@Enumerated(EnumType.STRING)
	private Status ExecutionStatus;
	

}
