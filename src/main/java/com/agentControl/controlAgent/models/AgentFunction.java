package com.agentControl.controlAgent.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
	@Column(length = 255, nullable = false)
	private String descriptionFunctionAgent;

}
