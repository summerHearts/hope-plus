package com.hope.config;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @program:hope-plus
 * @ClassName:SsoConfig
 * @author:aodeng
 * @blog:低调小熊猫(https://aodeng.cc)
 * @create:2019-03-31 12:30
 * @Description: TODO
 * @Version 1.0
 **/
@Configuration
public class SsoConfig implements InitializingBean,DisposableBean {

    @Value("${sso.redis.address}")
    private String redisAddress;

    @Value("${sso.redis.expire.minite}")
    private int redisExpireMinite;

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
