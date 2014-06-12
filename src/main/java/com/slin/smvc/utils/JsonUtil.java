package com.slin.smvc.utils;

/**
 * Created by Administrator on 14-6-12.
 */


import java.io.IOException;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializerProvider;
import org.springframework.stereotype.Component;


/**
 * json处理工具类
 *
 * @author zhangle
 */
@Component
public class JsonUtil extends ObjectMapper {

    private static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";


    @Override
    public String writeValueAsString(Object value) throws IOException, JsonGenerationException, JsonMappingException {
        return super.writeValueAsString(value);
    }

    public JsonUtil() {
        super();
        // 空值处理为空串
        this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
            @Override
            public void serialize(
                    Object value,
                    JsonGenerator jg,
                    SerializerProvider sp) throws IOException, JsonProcessingException {

                jg.writeString("");
            }
        });
    }
}
