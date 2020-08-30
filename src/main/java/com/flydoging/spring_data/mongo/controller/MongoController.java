/*
 * Copyright (C) 2020 Baidu, Inc. All Rights Reserved.
 */
package com.flydoging.spring_data.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flydoging.spring_data.mongo.service.MongoService;

@RestController
@RequestMapping("mongo")
public class MongoController {

    @Autowired
    private MongoService mongoService;
}
