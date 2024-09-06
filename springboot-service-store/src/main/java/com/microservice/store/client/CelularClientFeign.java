package com.microservice.store.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservice.store.models.Celular;

import java.util.List;

@FeignClient(name = "celular-service", url = "localhost:8081")
public interface CelularClientFeign {
  
  @GetMapping("/lista")
  public List<Celular> list();

  @GetMapping("/celular/{id}")
  public  Celular detail(@PathVariable Long id);
}
