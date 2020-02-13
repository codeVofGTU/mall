package com.codev.mall.order.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * OrderinfoVO.
 * </p>
 *
 * @author godV, 2020-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class OrderinfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private Integer oseq;

    private Integer ciseq;

    private Integer number;

    private Double price;


}
