package my.server.toyprj.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

// application.properties 파일에 적힌 설장값을 토대로 데이터 접근을 위한 기본 클래스
@Configuration
public class DataSourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().build();
    }
}
