package edu.fa.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Travel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int travelId;
	@Column(length = 4000)
	private String title;

	@OneToMany
	@JoinColumn(name = "travelId")
	private List<TravelContent> travelContents = new ArrayList<>();

	public int getTravelId() {
		return travelId;
	}

	public void setTravelId(int travelId) {
		this.travelId = travelId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<TravelContent> getTravelContents() {
		return travelContents;
	}

	public void setTravelContents(List<TravelContent> travelContents) {
		this.travelContents = travelContents;
	}

	public Travel() {
		super();
	}

	public Travel(int travelId, String title, List<TravelContent> travelContents) {
		super();
		this.travelId = travelId;
		this.title = title;
		this.travelContents = travelContents;
	}

	@Override
	public String toString() {
		return "Travel [travelId=" + travelId + ", title=" + title
				+ ", travelContents=" + travelContents + "]";
	}
	

}
