package com.agentControl.controlAgent.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tab_tasks")
public class Tasks {
	
	@Id
	@GeneratedValue(strategy =GenerationType.UUID )
	private String id;
	@Column(length = 255, nullable = false)
	private String externalIdTrello;
	@Column(length = 150, nullable = false)
	private String title;
	@Column(length = 255, nullable = false)
	private String description;
	@ManyToOne()
	@JoinColumn(name  = "project_id")
	private Projects project;
	@Enumerated(EnumType.STRING)
	private Status statusTask;
	@Column(nullable = false)
	private LocalDateTime createAt;
	@Column(nullable = false)
	private LocalDateTime updateAt;
	
	@PrePersist
	public void onCreate() {
		this.createAt = LocalDateTime.now();
		this.updateAt = LocalDateTime.now();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updateAt = LocalDateTime.now();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getExternalIdTrello() {
		return externalIdTrello;
	}

	public void setExternalIdTrello(String externalIdTrello) {
		this.externalIdTrello = externalIdTrello;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	public Status getStatusTask() {
		return statusTask;
	}

	public void setStatusTask(Status statusTask) {
		this.statusTask = statusTask;
	}
	
	
	

}
