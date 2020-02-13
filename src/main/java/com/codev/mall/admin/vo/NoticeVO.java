package com.codev.mall.admin.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * NoticeVO.
 * </p>
 *
 * @author godV, 2020-02-12
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class NoticeVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private LocalDateTime time;

    private String message;

    private Integer aseq;


}
