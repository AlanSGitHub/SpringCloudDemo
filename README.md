# SpringCloudDemo

> SpringCloud微服务框架，微服务框架Demo搭建与学习。

## 组件：

- Eureka

  > 描述：服务注册与发现，Eureka是Netflix开发的服务发现框架，本身是一个基于REST的服务，主要用于定位运行在AWS域中的中间层服务，以达到负载均衡和中间层服务故障转移的目的。SpringCloud将它集成在其子项目spring-cloud-netflix中，以实现SpringCloud的服务发现功能。

  > 注意：Eureka 2.0以后版本，官方宣告代码不再维护，继续使用风险自负。
  >
  > Eureka Github Wiki : [https://github.com/Netflix/eureka/wiki](https://github.com/Netflix/eureka/wiki)

  - 模块：
    - [服务中心](https://github.com/AlanSGitHub/SpringCloudDemo/tree/master/eureka-server)：`eureka-server：8888`
    - 服务生产者模块：`eureka-producer：8281`、`eureka-producer：8282`、`eureka-producer：8283`

- Rebbion + RestTamplate

  - 模块：
    - 服务消费者模块：`service-ribbon：8080`

- Feign

- Hystri

- Zuul
