package com.codev.mall.catering.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * ClassificationVO.
 * </p>
 *
 * @author godV, 2020-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class ClassificationVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private String name;


}
