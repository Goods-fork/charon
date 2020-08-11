package io.github.harvies.charon.spring.boot.test.web;

import com.alibaba.fastjson.JSONObject;
import io.github.harvies.charon.spring.boot.web.Constants;
import io.github.harvies.charon.util.JsonUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.server.LocalServerPort;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CharonSpringBootWebTest extends BaseTest {

    @LocalServerPort
    private int port;

    protected static String host = "http://localhost:";

    @Resource
    private RestTemplateBuilder restTemplateBuilder;

    @Test
    public void testHealthStatus() {
        String forObject = restTemplateBuilder.build().getForObject(host + port + "/health/status?a=b", String.class);
        JSONObject jsonObject = JsonUtils.parseObject(forObject);
        assertEquals(Constants.SUCCESS, jsonObject.getString("data"));
    }

    @Test
    public void testThreadDump() {
        String forObject = restTemplateBuilder.build().getForObject(host + port + "/thread/dumpAllThreads", String.class);
        assertNotNull(forObject);
    }

}
