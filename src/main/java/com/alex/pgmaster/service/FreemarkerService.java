package com.alex.pgmaster.service;

import com.alex.pgmaster.common.util.FreemarkerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FreemarkerService {

    @Autowired
    private freemarker.template.Configuration configuration;

    public String getString(String template, Object data) {
        return FreemarkerUtil.getString(configuration, template, data);
    }

    public byte[] getBytes(String template, Object data) {
        return getString(template, data).getBytes();
    }

}
