package com.example.hessiandemo;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.hessiandemo.hessian.DemoServiceHessianServlet;
import com.example.hessiandemo.services.DemoService;

@Configuration
public class HessianDemoConfiguration {

	@Bean
	public ServletRegistrationBean<DemoServiceHessianServlet> demoServiceHessianServlet(DemoService service) {
		ServletRegistrationBean<DemoServiceHessianServlet> servRegBean = new ServletRegistrationBean<>();
		servRegBean.setServlet(new DemoServiceHessianServlet(service));
		servRegBean.addUrlMappings(DemoService.SERVICE_PATH);
		servRegBean.setLoadOnStartup(1);
		return servRegBean;
	}
}
