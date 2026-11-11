package com.agentControl.controlAgent.models;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tab_agentExecution")
public class AgentExecution {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Enumerated(EnumType.STRING)
	private AgentType agentType;
	@ManyToOne
	private Projects project;
	@ManyToOne
	private Tasks task;
	@OneToMany(mappedBy = "agent")
	private List<Execution> execution;
	@Column(length = 255, nullable = false)
	private String agentDescription;
	@OneToOne
	private AgentFunction agentFunstion;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public AgentType getAgentType() {
		return agentType;
	}
	public void setAgentType(AgentType agentType) {
		this.agentType = agentType;
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
	public List<Execution> getExecution() {
		return execution;
	}
	public void setExecution(Execution execution) {
		this.execution.add(execution);
	}
	public String getAgentDescription() {
		return agentDescription;
	}
	public void setAgentDescription(String agentDescription) {
		this.agentDescription = agentDescription;
	}
	public AgentFunction getAgentFunstion() {
		return agentFunstion;
	}
	public void setAgentFunstion(AgentFunction agentFunstion) {
		this.agentFunstion = agentFunstion;
	}
	

}
