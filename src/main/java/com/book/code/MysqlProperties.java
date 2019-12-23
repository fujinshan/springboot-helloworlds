package com.book.code;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component                               //构件
@ConfigurationProperties(prefix = "mysql")  //配置属性类
@Data                                       //自动生成get和set方法
public class MysqlProperties {

    private String jdbcName;

    private String dbUrl;

    private String userName;

    private String password;




}
