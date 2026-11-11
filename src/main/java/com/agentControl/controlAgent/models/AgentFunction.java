package com.agentControl.controlAgent.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tab_agentFunction")
public class AgentFunction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Enumerated(EnumType.STRING)
	@Column(length = 50, nullable = false)
	private AgentType agentType;
	@Column(length = 255, nullable = false)
	private String descriptionFunctionAgent;
	
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
	public String getDescriptionFunctionAgent() {
		return descriptionFunctionAgent;
	}
	public void setDescriptionFunctionAgent(String descriptionFunctionAgent) {
		this.descriptionFunctionAgent = descriptionFunctionAgent;
	}
	

}
