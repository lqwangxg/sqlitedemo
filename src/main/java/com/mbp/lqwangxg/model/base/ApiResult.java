package com.mbp.lqwangxg.model.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@ApiModel
public class ApiResult
{
    @ApiModelProperty(value = "返回状态状态码", name = "code")
    private int code;

    @ApiModelProperty(value = "数据", name = "data")
    private Object data;
}
