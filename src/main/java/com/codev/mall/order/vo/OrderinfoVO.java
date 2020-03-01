package com.codev.mall.order.vo;

import java.io.Serializable;

import javax.swing.text.Caret;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.codev.mall.catering.entity.Cateringinfo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * OrderinfoVO.
 * </p>
 *
 * @author godV, 2020-02-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)

public class OrderinfoVO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @TableId(value="seq", type= IdType.AUTO)
    private Integer seq;

    private Integer oseq;

    private Integer ciseq;
    
    private String cateringname;  
    
    private Double cprice;     
    
    private String picturePath;

    private Integer number;

    private Double price;


}
