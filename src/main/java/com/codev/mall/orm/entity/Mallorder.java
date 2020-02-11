
package com.codev.mall.orm.entity;
 
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
 * @since 2020-01-21
 */
@Data
@Accessors(chain = true)
public class Mallorder implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@TableId(value="order_seq", type= IdType.AUTO)
    private Integer orderSeq;     
    private String orderName;     
    private String orderPmt;     
 

}

