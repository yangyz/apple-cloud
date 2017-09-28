package com.cachexic.cloud.security.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author tangmin
 * @Description:顶级的配置
 * @date 2017-09-28 17:36:03
 */
@ConfigurationProperties(prefix = "apple.security")
public class SecurityProperties {

    private BrowerProperties browser;

    public BrowerProperties getBrowser() {
        return browser;
    }

    public void setBrowser(BrowerProperties browser) {
        this.browser = browser;
    }
}