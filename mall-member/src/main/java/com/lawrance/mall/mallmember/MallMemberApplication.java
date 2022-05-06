package com.lawrance.mall.mallmember;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 描述: Feign远程调用
 * 1.引入open-feign
 * 2.编写一个接口, 打上@FeignClient标签 然后在标签中写上远程服务名 告诉spring-cloud 这个接口要调用哪个远程服务
 *      1).然后复制需要调用的远程服务接口完整方法签名和请求路径
 * 3.开启远程调用功能 在调用方启动类上打上@EnableFeignClents标签 在标签内写上远程调用接口需要扫描的包路径
 * @author zj
 * @date 2022/5/6
 */
@MapperScan("com.lawrance.mall.mallmember.dao")
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.lawrance.mall.mallmember.feign")
@RefreshScope
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
