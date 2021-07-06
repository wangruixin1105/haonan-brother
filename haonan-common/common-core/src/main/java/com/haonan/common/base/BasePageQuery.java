package com.haonan.common.base;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 分页请求对象
 */
@Data
public class BasePageQuery {

    @ApiModelProperty(value = "当前页", example = "1")
    private Integer pageNum = 1;

    @ApiModelProperty(value = "每页记录数", example = "10")
    private Integer pageSize = 10;
}
