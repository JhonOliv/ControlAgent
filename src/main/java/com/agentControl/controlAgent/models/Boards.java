package com.agentControl.controlAgent.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "tab_boards")
public class Boards {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String idBoard;
	@Column(length = 255, nullable = false)
	private String name;
	@Enumerated(EnumType.STRING)
	private BoardType type;
	@OneToMany
	private List<Tasks> taskList;
	
	public String getIdBoard() {
		return idBoard;
	}
	public void setIdBoard(String idBoard) {
		this.idBoard = idBoard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BoardType getType() {
		return type;
	}
	public void setType(BoardType type) {
		this.type = type;
	}
	public List<Tasks> getTaskList() {
		return taskList;
	}
	public void setTaskList(Tasks taskList) {
		this.taskList.add(taskList);
	}
	
	
	

}
