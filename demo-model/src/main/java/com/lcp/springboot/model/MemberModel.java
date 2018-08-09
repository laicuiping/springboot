package com.lcp.springboot.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <b><code>MemberModel</code></b>
 * <p>
 * <p/>
 * <p>
 * Description
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 10:36.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */
@ApiModel(value = "员工类")
public class MemberModel {
    /**
     * The Id.
     */
    @ApiModelProperty(value = "员工id")
    private Integer id;
    /**
     * The Name.
     */
    @ApiModelProperty(value = "员工姓名")
    private String name;
    /**
     * The Age.
     */
    @ApiModelProperty(value = "员工年龄")
    private Integer age;
    /**
     * The Deptment.
     */
    @ApiModelProperty(value = "员工所在部门")
    private String deptment;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Gets deptment.
     *
     * @return the deptment
     */
    public String getDeptment() {
        return deptment;
    }

    /**
     * Sets deptment.
     *
     * @param deptment the deptment
     */
    public void setDeptment(String deptment) {
        this.deptment = deptment;
    }
}
