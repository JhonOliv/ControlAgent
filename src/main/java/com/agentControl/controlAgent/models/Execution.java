package com.agentControl.controlAgent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

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
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Tasks getTask() {
		return task;
	}
	public void setTask(Tasks task) {
		this.task = task;
	}
	public AgentExecution getAgent() {
		return agent;
	}
	public void setAgent(AgentExecution agent) {
		this.agent = agent;
	}
	public Status getExecutionStatus() {
		return ExecutionStatus;
	}
	public void setExecutionStatus(Status executionStatus) {
		ExecutionStatus = executionStatus;
	}
	
	@Override
	public String toString() {
		return "Execution [task=" + task + ", agent=" + agent + ", ExecutionStatus=" + ExecutionStatus + "]";
	}
		

}
