package com.example.demoelarning.models;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

@Entity
public class Traineeship {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column
	private String title;
	@NotBlank
	private String description;
	@Column
	private String level;
	@NotBlank
	private String state;
	@NotNull
	private String totalOfHours;
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Date startDate;
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private Date finalDate;
	@NotNull
	private String price;
	@NotBlank
	private String startTime;
	@Column
	private String meetingHour;
	@ManyToMany
	@JoinTable(name = "inscription", joinColumns = @JoinColumn(name = "traineeship_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private List<User> users = new ArrayList<User>();
	
	public Traineeship(Long id, String title, @NotBlank String description, String level, @NotBlank String state,
			String totalOfHours, Date startDate, Date finalDate, String price, @NotBlank String startTime,
			String meetingHour, List<User> users) {
		super();
		this.title = title;
		this.description = description;
		this.level = level;
		this.state = state;
		this.totalOfHours = totalOfHours;
		this.startDate = startDate;
		this.finalDate = finalDate;
		this.price = price;
		this.startTime = startTime;
		this.meetingHour = meetingHour;
		this.users = users;
	}
	public Traineeship() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
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
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTotalOfHours() {
		return totalOfHours;
	}
	public void setTotalOfHours(String totalOfHours) {
		this.totalOfHours = totalOfHours;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getMeetingHour() {
		return meetingHour;
	}
	public void setMeetingHour(String meetingHour) {
		this.meetingHour = meetingHour;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public void abonner(User a) {
		this.users.add(a);
		
	}
	
	

}
