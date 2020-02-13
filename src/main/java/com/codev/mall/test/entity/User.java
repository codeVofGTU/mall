
package com.codev.mall.test.entity;
 
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
public class User implements Serializable {
 
	private static final long serialVersionUID = 1L;
 
    private String username;     
    private String password;     
	@TableId(value="userId", type= IdType.AUTO)
    private Integer userId;     
    private String phoneNumber;     
 

}

