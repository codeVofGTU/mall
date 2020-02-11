package com.codev.mall.sys.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * UserVO.
 * </p>
 *
 * @author godV, 2020-01-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class UserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private Integer userId;

    private String phoneNumber;


}
