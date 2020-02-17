package com.codev.mall.catering.vo;

import java.io.Serializable;

import com.codev.mall.catering.entity.Classification;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * CateringinfoVO.
 * </p>
 *
 * @author godV, 2020-02-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@Getter
@Setter
public class CateringinfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private String cateringname;

    private Classification classification;

    private Integer num;

    private Double price;

    private String info;

    private String picturePath;

    private Integer bseq;

	public CateringinfoVO(Integer seq, String cateringname, Classification classification, Integer num, Double price,
			String info, String picturePath, Integer bseq) {
		super();
		this.seq = seq;
		this.cateringname = cateringname;
		this.classification = classification;
		this.num = num;
		this.price = price;
		this.info = info;
		this.picturePath = picturePath;
		this.bseq = bseq;
	}

	public CateringinfoVO() {
		super();
	}

	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	public String getCateringname() {
		return cateringname;
	}

	public void setCateringname(String cateringname) {
		this.cateringname = cateringname;
	}

	public Classification getClassification() {
		return classification;
	}

	public void setClassification(Classification classification) {
		this.classification = classification;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getPicturePath() {
		return picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public Integer getBseq() {
		return bseq;
	}

	public void setBseq(Integer bseq) {
		this.bseq = bseq;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}
