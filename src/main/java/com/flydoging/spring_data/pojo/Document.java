/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.flydoging.spring_data.pojo;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Document {
    @Id
    private Long id;
    private String content;
    private int seq;
    private Long createBy;
    private Long createTime;
    private Long updateBy;
    private Long updateTime;
}
