package cn.wr.dataindicator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;

@SpringBootApplication(exclude = {RedisAutoConfiguration.class})
@MapperScan("cn.wr.dataindicator.mapper")
public class DataIndicatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataIndicatorApplication.class, args);
    }

}
