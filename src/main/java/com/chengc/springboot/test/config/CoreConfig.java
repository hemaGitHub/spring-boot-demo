package com.chengc.springboot.test.config;

import com.chengc.springboot.test.custom.CustomizationBean;
import com.chengc.springboot.test.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;


/**
 * @Bean can be used to bind properties to third-party components that out of your control
 */
@Configuration
//@MapperScan(basePackages = "com.jumei.shepherd.search.dao.db")
public class CoreConfig {


    @Autowired
    Environment env;

    /**
     * As well as using @ConfigurationProperties to annotate a class, you can also use it on public @Bean methods.
     * This can be particularly useful when you want to bind properties to third-party components that are outside of your control.
     * @return
     * @throws Exception
     */
    @Bean
    public Person addInfoToPerson(){
        Person person = new Person();
        person.setId(env.getProperty("person.id","999"));
        person.setName(env.getProperty("person.name","Yangguang"));
        return person;
    }

    /*@Bean(name="searchDataSource",destroyMethod = "close")
    public DruidDataSource searchDataSource() {


        DruidDataSource ds = new DruidDataSource();
        ds.setUrl(env.getProperty("search.jdbc.url"));
        ds.setUsername(env.getProperty("search.jdbc.user"));
        ds.setPassword(env.getProperty("search.jdbc.password"));
        ds.setInitialSize(env.getProperty("search.jdbc.init.size", Integer.class));
        ds.setMinIdle(env.getProperty("search.jdbc.min.idle", Integer.class));
        ds.setMaxActive(env.getProperty("search.jdbc.max.active", Integer.class));
        ds.setMaxWait(env.getProperty("search.jdbc.max.wait", Integer.class));
        ds.setTimeBetweenEvictionRunsMillis(env.getProperty("search.jdbc.checkout.connect.time.millis", Long.class));
        ds.setMinEvictableIdleTimeMillis(env.getProperty("search.jdbc.min.active.time.millis", Long.class));
        ds.setPoolPreparedStatements(env.getProperty("search.jdbc.pool.prepared.flag", Boolean.class));
        return ds;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(){
        DataSourceTransactionManager dt = new DataSourceTransactionManager();
        dt.setDataSource(searchDataSource());
        return dt;
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sfb = new SqlSessionFactoryBean();
        sfb.setDataSource(searchDataSource());
        sfb.afterPropertiesSet();
        return sfb.getObject();
    }*/
//
//    @Bean
//    public MapperScannerConfigurer mapperScannerConfigurer() throws Exception{
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        msc.setBasePackage("com.jumei.shepherd.search.dao");
//        msc.setSqlSessionFactoryBeanName("sqlSessionFactory");
//        msc.afterPropertiesSet();
//        return msc;
//    }





}
