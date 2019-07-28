package com.npcgo.fallback;

import com.npcgo.api.UserAPI;
import com.npcgo.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserAPIFallback implements UserAPI {
    public String getString(User user) {
        return "调用失败！！";
    }

    public String HelloWorld() {
        return null;
    }
}
