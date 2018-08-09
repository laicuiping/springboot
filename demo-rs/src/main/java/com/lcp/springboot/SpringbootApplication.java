package com.lcp.springboot;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@RestController
@SpringBootApplication(scanBasePackages = {"com.lcp.springboot.*"})
@MapperScan({"com.lcp.springboot.dao"})
public class SpringbootApplication extends WebMvcConfigurerAdapter {
	private static final Logger LOG = Logger.getLogger(SpringbootApplication.class);
	public static void main(String[] args) {
		LOG.info("启动成功");
		System.out.println("111");
		SpringApplication.run(SpringbootApplication.class, args);

	}
	/**
	 * 提供datasource
	 *
	 * @return the datasource
	 * @since train-rs 0.1.0
	 */
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {

		return new DataSource();
	}

	/**
	 * 提供SqlSessionFactory
	 *
	 * @return the sql session factory
	 * @throws Exception the exception
	 * @since train-rs 0.1.0
	 */
	@Bean
	public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();

        /* DateSource */
		sqlSessionFactoryBean.setDataSource(dataSource());


        /* Mapper */
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver
				.getResources("classpath:/mapper/**/*.xml"));

		return sqlSessionFactoryBean.getObject();
	}
	@RequestMapping("/index")
    public String index() {
		System.out.println("111");
		return "HelloWord";
    }
}
