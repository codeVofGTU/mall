package com.codev.mall.user.vo;

import java.io.Serializable;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * MemberVO.
 * </p>
 *
 * @author godV, 2020-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class MemberVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private String grade;

    private Double discount;

    private String description;

    private Double remittance;


}
