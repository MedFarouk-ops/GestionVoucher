package com.stage.info.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Categorie{
	@Id
	@GeneratedValue
	private long idCat;
	@CreatedDate
	@Column(name = "createdate", nullable = false)
	@JsonIgnore
	private Date createdate;
	@LastModifiedDate
	@Column(name = "updatedate")
	@JsonIgnore
	private Date updateDate;
	private String nomCat;
	private String description;
	@OneToMany(mappedBy = "type")
	private List<Voucher> vouchers;
	
	
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(Date createdate, Date updateDate, String nomCat, String description) {
		super();
		this.createdate = createdate;
		this.updateDate = updateDate;
		this.nomCat = nomCat;
		this.description = description;
	}
	public long getidCat() {
		return idCat;
	}
	public void setidCat(long idCat) {
		this.idCat = idCat;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Voucher> getVouchers() {
		return vouchers;
	}
	public void setVouchers(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	

}
