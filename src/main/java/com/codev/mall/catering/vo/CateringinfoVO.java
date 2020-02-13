package com.codev.mall.catering.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * CateringinfoVO.
 * </p>
 *
 * @author godV, 2020-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class CateringinfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private String cateringname;

    private Integer ccseq;

    private Integer num;

    private Double price;

    private String info;

    private String picturePath;

    private Integer bseq;


}
