package edu.fa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "Planes")
public class Planes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JoinColumn(name = "planesId")
	private int planesId;

	@JoinColumn(name = "planesLink")
	@Column(length = 4000)
	private String planesLink;

	public int getPlanesId() {
		return planesId;
	}

	public void setPlanesId(int planesId) {
		this.planesId = planesId;
	}

	public String getPlanesLink() {
		return planesLink;
	}

	public void setPlanesLink(String planesLink) {
		this.planesLink = planesLink;
	}

	public Planes() {
		super();
	}

	public Planes(int planesId, String planesLink) {
		super();
		this.planesId = planesId;
		this.planesLink = planesLink;
	}
	
	

	

	
}
