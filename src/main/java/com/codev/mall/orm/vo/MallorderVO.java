package com.codev.mall.orm.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * MallorderVO.
 * </p>
 *
 * @author godV, 2020-01-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class MallorderVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer orderSeq;

    private String orderName;

    private String orderPmt;


}
