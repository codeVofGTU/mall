
package com.codev.mall.cart.entity;
 
import java.io.Serializable;
 
 
import lombok.Data;
import lombok.experimental.Accessors;
 
/**
 * <p>
 * $!{table.comment}
 * </p>
 *
 * @author godV
 * @since 2020-02-15
 */
@Data
@Accessors(chain = true)
public class Cart implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
    private Integer seq;     
    private Integer ciseq;     
    private Double num;     
    private Integer useq;     
 

}

