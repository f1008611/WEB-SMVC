package com.slin.smvc.utils;

/**
 * Created by Administrator on 14-6-12.
 */


import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Component
public class JsonUtil extends ObjectMapper {

    public JsonUtil() {
        super();
        registerModule(new JodaModule());
        setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));



    }

}
