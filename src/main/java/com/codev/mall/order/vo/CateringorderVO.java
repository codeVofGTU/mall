package com.codev.mall.order.vo;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * CateringorderVO.
 * </p>
 *
 * @author godV, 2020-02-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class CateringorderVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer seq;

    private Integer useq;

    private LocalDateTime trandate;

    private Integer status;

    private Double remittance;

    private String info;

    private Integer bseq;

    private String adress;


}
