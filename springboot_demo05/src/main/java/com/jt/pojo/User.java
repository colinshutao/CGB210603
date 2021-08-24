package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)

//1.将对象与表进行关联
@TableName("demo_user")
//规则1: 如果表名与对象名一致    则名称可以省略
//规则2: 如果字段名与属性名一致, 则注解可以省略

//序列化接口：保证网络传输，头发还是头发，肚子还是肚子，腿还是腿
//序列化接口作用: 保证对象网络传输的有效性!!!
public class User implements Serializable {
    @TableId(type = IdType.AUTO)//主键
    private Integer id;
//    @TableField("name")
    private String name;
//    @TableField("aee")
    private Integer age;
//    @TableField("sex")
    private String sex;
}
