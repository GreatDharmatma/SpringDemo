package org.rapideagle.tutorials.springdemo.config;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ApplicationInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(ApplicationConfiguration.class);

        Dynamic servlet = servletContext.addServlet("appServlet", new DispatcherServlet(ctx));
        Map<String, String> initParams = new HashMap<String, String>();
        initParams.put("contextClass", "org.springframework.web.context.support.AnnotationConfigWebApplicationContext");
        initParams.put("contextConfigLocation", "org.rapideagle.tutorials.springdemo.config.ApplicationConfiguration");
        servlet.setInitParameters(initParams);
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }

}