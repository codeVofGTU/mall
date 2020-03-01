
package com.codev.mall.msg.entity;
 
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
 * @since 2020-02-29
 */
@Data
@Accessors(chain = true)
public class Massage implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@TableId(value="seq", type= IdType.AUTO)
    private Integer seq;     
    private String context;     
    private Integer oseq;     
    private Integer useq;     
 

}

