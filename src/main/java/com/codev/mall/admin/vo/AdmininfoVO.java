package com.codev.mall.admin.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * AdmininfoVO.
 * </p>
 *
 * @author godV, 2020-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class AdmininfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private String name;

    private String password;

    private String adminname;


}
