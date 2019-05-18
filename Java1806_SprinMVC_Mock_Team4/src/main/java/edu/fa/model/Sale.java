package edu.fa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sale {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int saleId;
	@Column(length = 4000)
	private String saleTitle;
	@Column(length = 4000)
	private String saleImage;
	@Column(length = 4000)
	private String saleShort;
	@Column(length = 4000)
	private String saleContent;
	@Column(length = 4000)
	private String saleDate;
	public int getSaleId() {
		return saleId;
	}
	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}
	public String getSaleTitle() {
		return saleTitle;
	}
	public void setSaleTitle(String saleTitle) {
		this.saleTitle = saleTitle;
	}
	
	public String getSaleImage() {
		return saleImage;
	}
	public void setSaleImage(String saleImage) {
		this.saleImage = saleImage;
	}
	public String getSaleShort() {
		return saleShort;
	}
	public void setSaleShort(String saleShort) {
		this.saleShort = saleShort;
	}
	public String getSaleContent() {
		return saleContent;
	}
	public void setSaleContent(String saleContent) {
		this.saleContent = saleContent;
	}
	public String getSaleDate() {
		return saleDate;
	}
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
	}
	public Sale() {
		super();
	}
	public Sale(int saleId, String saleTitle, String saleImage,
			String saleShort, String saleContent, String saleDate) {
		super();
		this.saleId = saleId;
		this.saleTitle = saleTitle;
		this.saleImage = saleImage;
		this.saleShort = saleShort;
		this.saleContent = saleContent;
		this.saleDate = saleDate;
	}
	@Override
	public String toString() {
		return "Sale [saleId=" + saleId + ", saleTitle=" + saleTitle
				+ ", saleImage=" + saleImage + ", saleShort=" + saleShort
				+ ", saleContent=" + saleContent + ", saleDate=" + saleDate
				+ "]";
	}
	
}
