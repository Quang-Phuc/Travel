package edu.fa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Home {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int homeId;
	private String homeTitle;
	@Column(length = 4000)
	private String imageHome;
	@Column(length = 4000)
	private String homeShortContents;
	@Column(length = 4000)
	private String homeContents;
	private int point;
	public int getHomeId() {
		return homeId;
	}
	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}
	
	public String getImageHome() {
		return imageHome;
	}
	public void setImageHome(String imageHome) {
		this.imageHome = imageHome;
	}
	public String getHomeTitle() {
		return homeTitle;
	}
	public void setHomeTitle(String homeTitle) {
		this.homeTitle = homeTitle;
	}
	
	public String getHomeShortContents() {
		return homeShortContents;
	}
	public void setHomeShortContents(String homeShortContents) {
		this.homeShortContents = homeShortContents;
	}
	public String getHomeContents() {
		return homeContents;
	}
	public void setHomeContents(String homeContents) {
		this.homeContents = homeContents;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Home() {
		super();
	}
	public Home(int homeId, String homeTitle, String imageHome,
			String homeShortContents, String homeContents, int point) {
		super();
		this.homeId = homeId;
		this.homeTitle = homeTitle;
		this.imageHome = imageHome;
		this.homeShortContents = homeShortContents;
		this.homeContents = homeContents;
		this.point = point;
	}
	@Override
	public String toString() {
		return "Home [homeId=" + homeId + ", homeTitle=" + homeTitle
				+ ", imageHome=" + imageHome + ", homeShortContents="
				+ homeShortContents + ", homeContents=" + homeContents
				+ ", point=" + point + "]";
	}
	
	
	
	

}
