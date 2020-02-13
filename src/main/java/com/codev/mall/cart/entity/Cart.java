
package com.codev.mall.cart.entity;
 
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
 
 
import lombok.Data;
import lombok.experimental.Accessors;
 
/**
 * <p>
 * $!{table.comment}
 * </p>
 *
 * @author godV
 * @since 2020-02-12
 */
@Data
@Accessors(chain = true)
public class Cart implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@TableId(value="seq", type= IdType.AUTO)
    private Integer seq;     
    private Integer ciseq;     
    private Double num;     
    private Integer useq;     
 

}

