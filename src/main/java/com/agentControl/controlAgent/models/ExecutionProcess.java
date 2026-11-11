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
	
	public AgentExecution getAgent() {
		return agent;
	}
	public void setAgent(AgentExecution agent) {
		this.agent = agent;
	}
	public Projects getProject() {
		return project;
	}
	public void setProject(Projects project) {
		this.project = project;
	}
	public Tasks getTask() {
		return task;
	}
	public void setTask(Tasks task) {
		this.task = task;
	}
	public String getLogExcution() {
		return logExcution;
	}
	public void setLogExcution(String logExcution) {
		this.logExcution = logExcution;
	}
	
	
}
