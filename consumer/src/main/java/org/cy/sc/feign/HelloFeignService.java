package org.cy.sc.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(name = "producer", fallback = HelloFeignProviderHystrix.class)
public interface HelloFeignService {

    /**
     * @param name
     * @return
     */
    @GetMapping("/hello/")
    String hello(@RequestParam(value = "name") String name);


    /**
     * 自定义Filter
     * @param name
     * @return
     */
    @GetMapping("/hello/customFilter")
    String customFilter(@RequestParam (value = "name") String name);

}
