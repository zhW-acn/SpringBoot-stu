package com.aca.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLGenerator;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

/**
 * @Description:
 * @Author: aca
 * @Date: 2024/03/01
 */
public class MyYamlHttpMessageConvert extends AbstractHttpMessageConverter<Object> {

    private ObjectMapper objectMapper = null;

    public MyYamlHttpMessageConvert(){
        // 支持哪种媒体类型
        super(new MediaType("text","yaml", Charset.forName("UTF-8")));
        YAMLFactory factory = new YAMLFactory().disable(YAMLGenerator.Feature.WRITE_DOC_START_MARKER);
        this.objectMapper = new ObjectMapper(factory);
    }
    @Override
    protected boolean supports(Class<?> clazz) {
        // 在这里判断类加载器是否支持转为yaml格式
        return true;
    }

    // 如何读取对象，@RequestBody
    @Override
    protected Object readInternal(Class<?> clazz, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        return null;
    }

    // 如何写出对象，@ResponseBody
    @Override
    protected void writeInternal(Object methodReturnValue, HttpOutputMessage outputMessage) throws IOException,
            HttpMessageNotWritableException {
        try(OutputStream body = outputMessage.getBody()){
            this.objectMapper.writeValue(body,methodReturnValue);
        }
        ;

    }
}
