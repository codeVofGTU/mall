
package com.codev.mall.order.entity;
 
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
 
 
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.Getter;
import lombok.Setter;
 
/**
 * <p>
 * $!{table.comment}
 * </p>
 *
 * @author godV
 * @since 2020-02-16
 */
@Data
@Accessors(chain = true)
@Getter
@Setter
public class Cateringorder implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@TableId(value="seq", type= IdType.AUTO)
    private Integer seq;     
    private Integer useq;     
    private LocalDateTime trandate;     
    private String status;     
    private Double remittance;     
    private String info;         
    private String adress;     
 

}

