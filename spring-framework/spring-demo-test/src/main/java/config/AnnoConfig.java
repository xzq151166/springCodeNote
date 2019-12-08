package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AnnoConfig {

    @Bean(name = "configEntity")
    @Scope("prorotype")
    public ConfigEntity setConfig(){
		ConfigEntity configEntity = new ConfigEntity();
		configEntity.setPath("22222");
		configEntity.setTargetAnnotations(null);
		return configEntity;
	}

}
