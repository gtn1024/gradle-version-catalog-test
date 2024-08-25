package com.github.gtn1024.shared;

import cn.hutool.core.bean.BeanUtil;

import java.util.Map;

public class BeanUtils {
    public static Map<String, Object> beanToMap(Object bean) {
        return BeanUtil.beanToMap(bean);
    }
}
