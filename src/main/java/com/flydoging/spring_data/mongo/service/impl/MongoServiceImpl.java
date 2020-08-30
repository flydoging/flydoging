/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.flydoging.spring_data.mongo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.flydoging.spring_data.mongo.service.MongoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MongoServiceImpl implements MongoService {

    @Autowired
    private MongoTemplate mongoTemplate;
}
