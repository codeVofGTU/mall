package com.codev.mall.catering.vo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.codev.mall.catering.entity.Classification;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * CateringinfoVO.
 * </p>
 *
 * @author godV, 2020-02-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CateringinfoVO implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="seq", type= IdType.AUTO)
    private Integer seq;

    private String cateringname;
    
    private Integer ccseq; 
    
    private String name;

    private Integer num;

    private Double price;

    private String info;

    private String picturePath;

    private Integer bseq;
    
    private String username;

	
	
}
