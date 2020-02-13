package com.codev.mall.user.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * UserinfoVO.
 * </p>
 *
 * @author godV, 2020-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class UserinfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private String username;

    private String password;

    private String tel;

    private Integer memberid;

    private Double accout;


}
