/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.vulns.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 用户
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("vuln_project")
public class VulnProjectEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 项目ID
     */
    @TableId
    private Long projectID;
    /**
     * 项目名称
     */
    private String name;
    /**
     * 报告路径
     */
    private String reportFilePath;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

}
