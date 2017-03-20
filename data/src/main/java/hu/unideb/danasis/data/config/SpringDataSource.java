package hu.unideb.danasis.data.config;

import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class SpringDataSource {

    @Value("${datasource.serverName}")
    private String serverName;

    @Value("${datasource.port}")
    private Integer port;

    @Value("${datasource.database}")
    private String database;

    @Value("${datasource.schema}")
    private String schema;

    @Value("${datasource.user}")
    private String user;

    @Value("${datasource.password}")
    private String password;

    @Primary
    @Bean
    public DataSource createDataSource() {
        PGPoolingDataSource dataSource = new PGPoolingDataSource();
        dataSource.setServerName(serverName);
        dataSource.setPortNumber(port);
        dataSource.setDatabaseName(database);
        dataSource.setCurrentSchema(schema);
        dataSource.setUser(user);
        dataSource.setPassword(password);

        return dataSource;
    }
}
