
package com.codev.mall.catering.entity;
 
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
public class Cateringinfo implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
	@TableId(value="seq", type= IdType.AUTO)
    private Integer seq;     
    private String cateringname;     
    private Integer ccseq;     
    private Integer num;     
    private Double price;     
    private String info;     
    private String picturePath;     
    private Integer bseq;
	
 
    

}

