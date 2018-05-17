package org.spring.cloud.feignaaa.server;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

	@Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }

}
