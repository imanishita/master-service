package com.harmonique.masters.master_service.config;
import com.hazelcast.config.Config;
import com.hazelcast.config.MapConfig;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HazelcastConfig {

    @Bean
    public HazelcastInstance hazelcastInstance() {
        Config config = new Config();
        config.setInstanceName("master-cache");
        config.addMapConfig(new MapConfig().setName("genreMain"));
        return Hazelcast.newHazelcastInstance(config);
    }
}
