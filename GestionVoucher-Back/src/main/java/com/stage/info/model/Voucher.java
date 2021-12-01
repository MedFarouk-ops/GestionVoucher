package com.stage.info.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Voucher {
	@Id
	@GeneratedValue
	private long idVch;
	@CreatedDate
	@Column(name = "createdate", nullable = false)
	@JsonIgnore
	private Date createdate;
	@LastModifiedDate
	@Column(name = "updatedate")
	@JsonIgnore
	private Date updateDate;
	private String titre;
	private String noVoucher;
	private float prixVoucher;
	private String descVoucher;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateExp;
	@JsonIgnore
	@ManyToOne
	private Categorie type;

	public Voucher() {
		super();
	}

	public Voucher(Date createdate, Date updateDate, String descVoucher, String titre, String noVoucher,
			float prixVoucher, Date dateExp,Categorie cat) {
		super();
		this.createdate = createdate;
		this.updateDate = updateDate;
		this.titre = titre;
		this.noVoucher = noVoucher;
		this.descVoucher = descVoucher;
		this.prixVoucher = prixVoucher;
		this.dateExp = dateExp;
		this.type=cat;
	}

	public long getIdVch() {
		return idVch;
	}

	public void setIdVch(long idVch) {
		this.idVch = idVch;
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

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getNoVoucher() {
		return noVoucher;
	}

	public void setNoVoucher(String noVoucher) {
		this.noVoucher = noVoucher;
	}

	public float getPrixVoucher() {
		return prixVoucher;
	}

	public void setPrixVoucher(float prixVoucher) {
		this.prixVoucher = prixVoucher;
	}

	public Date getDateExp() {
		return dateExp;
	}

	public void setDateExp(Date dateExp) {
		this.dateExp = dateExp;
	}


	public Categorie getType() {
		return type;
	}

	public void setType(Categorie type) {
		this.type = type;
	}

	public String getDescVoucher() {
		return descVoucher;
	}

	public void setDescVoucher(String descVoucher) {
		this.descVoucher = descVoucher;
	}

}
