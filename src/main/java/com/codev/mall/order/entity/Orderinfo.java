
package com.codev.mall.order.entity;
 
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
public class Orderinfo implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
    private Integer seq;     
    private Integer oseq;     
    private Integer ciseq;     
    private Integer number;     
    private Double price;     
 

}

