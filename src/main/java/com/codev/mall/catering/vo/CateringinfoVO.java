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

	
}
