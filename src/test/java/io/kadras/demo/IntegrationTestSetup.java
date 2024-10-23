package io.kadras.demo;

import org.springframework.boot.devtools.restart.RestartScope;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.ollama.OllamaContainer;

@TestConfiguration(proxyBeanMethods = false)
public class IntegrationTestSetup {
  @Bean
  @RestartScope
  @ServiceConnection
  OllamaContainer ollama() {
    return new OllamaContainer("ollama/ollama").withReuse(true);
  }

}

