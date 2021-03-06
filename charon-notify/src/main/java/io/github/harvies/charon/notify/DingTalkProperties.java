package io.github.harvies.charon.notify;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * github配置
 */
@Getter
@Setter
@ConfigurationProperties(prefix = Constants.DING_TALK_PROPERTIES_PREFIX)
public class DingTalkProperties {

    /**
     * webHook地址
     */
    private String webHookUrl;
}