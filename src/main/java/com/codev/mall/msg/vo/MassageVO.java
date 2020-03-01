package com.codev.mall.msg.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * MassageVO.
 * </p>
 *
 * @author godV, 2020-02-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class MassageVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private String context;

    private Integer oseq;

    private Integer useq;
    
    private String username;


}
