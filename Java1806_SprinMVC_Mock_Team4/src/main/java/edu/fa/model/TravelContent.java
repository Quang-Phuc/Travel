package edu.fa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class TravelContent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int travelContentId;
	@Column(length = 4000)
	private String travelContentTitle;
	@Column(length = 4000)
	private String travelContentImage;
	@Column(length = 4000)
	private String travelContentShort;
	@Column(length = 4000)
	private String travelContent;
	@Column(length = 4000)
	private int travelContentPoint;
	
	@ManyToOne
	@JoinColumn(name = "travelId")
	private Travel travel;
	public int getTravelContentId() {
		return travelContentId;
	}
	public void setTravelContentId(int travelContentId) {
		this.travelContentId = travelContentId;
	}
	public String getTravelContentTitle() {
		return travelContentTitle;
	}
	public void setTravelContentTitle(String travelContentTitle) {
		this.travelContentTitle = travelContentTitle;
	}
	
	public String getTravelContentImage() {
		return travelContentImage;
	}
	public void setTravelContentImage(String travelContentImage) {
		this.travelContentImage = travelContentImage;
	}
	public String getTravelContentShort() {
		return travelContentShort;
	}
	public void setTravelContentShort(String travelContentShort) {
		this.travelContentShort = travelContentShort;
	}
	public String getTravelContent() {
		return travelContent;
	}
	public void setTravelContent(String travelContent) {
		this.travelContent = travelContent;
	}
	public int getTravelContentPoint() {
		return travelContentPoint;
	}
	public void setTravelContentPoint(int travelContentPoint) {
		this.travelContentPoint = travelContentPoint;
	}
	public Travel getTravel() {
		return travel;
	}
	public void setTravel(Travel travel) {
		this.travel = travel;
	}
	public TravelContent() {
		super();
	}
	public TravelContent(int travelContentId, String travelContentTitle,
			String travelContentImage, String travelContentShort,
			String travelContent, int travelContentPoint, Travel travel) {
		super();
		this.travelContentId = travelContentId;
		this.travelContentTitle = travelContentTitle;
		this.travelContentImage = travelContentImage;
		this.travelContentShort = travelContentShort;
		this.travelContent = travelContent;
		this.travelContentPoint = travelContentPoint;
		this.travel = travel;
	}
	@Override
	public String toString() {
		return "TravelContent [travelContentId=" + travelContentId
				+ ", travelContentTitle=" + travelContentTitle
				+ ", travelContentImage=" + travelContentImage
				+ ", travelContentShort=" + travelContentShort
				+ ", travelContent=" + travelContent + ", travelContentPoint="
				+ travelContentPoint + ", travel=" + travel + "]";
	}
	
	

}
