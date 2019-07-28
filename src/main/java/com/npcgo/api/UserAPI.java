package com.npcgo.api;

import com.npcgo.domain.User;
import com.npcgo.fallback.UserAPIFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "${service-provider.name}",fallback = UserAPIFallback.class)
public interface UserAPI {

    @PostMapping("/greeting")
    String getString(User user);

    @GetMapping("/index")
    String HelloWorld();

}
