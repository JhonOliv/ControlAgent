package com.agentControl.controlAgent.models;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tab_project")
public class Projects {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@Column(length = 150, nullable = false)
	private String name;
	@Column(length = 255, nullable = false)
	private String description;
	@Column(length = 255, nullable = false)
	private String repositoryURL;
	@Column(length = 25, nullable = false)
	private String branchName;
	@OneToMany(mappedBy = "project")
	private List<Tasks> task;
	@Column(nullable = false)
	private LocalDateTime createAt;
	@Column(nullable = false)
	private LocalDateTime updateAt;
	

	@PrePersist
	public void onCreated() {
		this.createAt = LocalDateTime.now();
		this.updateAt = LocalDateTime.now();
	}
	
	@PreUpdate
	public void onUpdate() {
		this.updateAt = LocalDateTime.now();
	}

		
}
