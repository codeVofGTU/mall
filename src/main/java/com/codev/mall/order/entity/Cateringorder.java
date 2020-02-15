
package com.codev.mall.order.entity;
 
import java.time.LocalDateTime;
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
public class Cateringorder implements Serializable {
 
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

