package cn.itcast12.feign.client;

import cn.itcast12.feign.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "userserice")
public interface UserClient {

    @GetMapping("/user/{id}")
    User findByID(@PathVariable Long id);
}
