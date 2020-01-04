package com.xnj.multidatasource.db1.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.xnj.multidatasource.domain.BaseValue;

import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author NingkitTse
 * @since 2020-01-04
 */
@Accessors(chain = true)
public class Test extends BaseValue {

    private static final long serialVersionUID = 1L;

    @TableField("NAME")
    private String name;

    @TableField("AGE")
    private Integer age;

    @TableField("COMMENT")
    private String comment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
