
package com.codev.mall.order.entity;
 
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

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
public class Orderinfo implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@TableId(value="seq", type= IdType.AUTO)
    private Integer seq;     
    private Integer oseq;     
    private Integer ciseq;     
    private Integer number;     
    private Double price;     
 

}

