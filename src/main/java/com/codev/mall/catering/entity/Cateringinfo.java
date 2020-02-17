
package com.codev.mall.catering.entity;
 
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
 
 
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.Getter;
import lombok.Setter;
 
/**
 * <p>
 * $!{table.comment}
 * </p>
 *
 * @author godV
 * @since 2020-02-16
 */
@Data
@Accessors(chain = true)
public class Cateringinfo implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@TableId(value="seq", type= IdType.AUTO)
    private Integer seq;     
    private String cateringname;     
    private Integer ccseq;     
    private Integer num;     
    private Double price;     
    private String info;     
    private String picturePath;     
    private Integer bseq;
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
	public Integer getCcseq() {
		return ccseq;
	}
	public void setCcseq(Integer ccseq) {
		this.ccseq = ccseq;
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
 
    

}

