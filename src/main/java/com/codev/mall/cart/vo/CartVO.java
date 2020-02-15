package com.codev.mall.cart.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * CartVO.
 * </p>
 *
 * @author godV, 2020-02-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class CartVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private Integer ciseq;

    private Double num;

    private Integer useq;


}
