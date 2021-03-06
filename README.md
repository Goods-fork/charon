## 项目介绍

代码库

![Maven Package](https://github.com/harvies/charon/workflows/Maven%20Package/badge.svg)

## 项目要求

- JDK8

## 项目结构介绍

- [charon-core](./charon-core) 核心工具包
- [charon-dependencies](./charon-charon-dependencies) 依赖管理
- [charon-facade](./charon-facade)  rpc接口父模块
- [charon-eureka-server](./charon-eureka-server) eureka服务端
- [charon-socks-proxy-server](./charon-socks-proxy-server)  使用netty实现的socks5代理，摘自netty example
- [charon-spring-boot-admin-server](./charon-spring-boot-admin-server) spring-boot-admin服务端
- [charon-spring-boot-starters](./charon-spring-boot-starters)  charon-spring-boot-starter父模块
  -  [charon-spring-boot-starter](./charon-spring-boot-starters/charon-spring-boot-starter)  拓展spring-boot-starter,其他starter依赖此模块,新增配置/opt/charon/charon.properties加载(方便本地调试)
  -  [charon-web-spring-boot-starter](./charon-spring-boot-starters/charon-web-spring-boot-starter) 拓展spring-boot-starter,新增健康检查Controller及线程查看等运维工具
  -  [charon-apollo-spring-boot-starter](./charon-spring-boot-starters/charon-apollo-spring-boot-starter) 集成apollo
  -  [charon-dubbo-spring-boot-starter](./charon-spring-boot-starters/charon-dubbo-spring-boot-starter) 集成dubbo
  -  [charon-elasticjob-lite-spring-boot-starter](./charon-spring-boot-starters/charon-elasticjob-lite-spring-boot-starter) 集成elasticjob-lite
  -  [charon-elasticsearch-spring-boot-starter](./charon-spring-boot-starters/charon-elasticsearch-spring-boot-starter) 集成elasticsearch
  -  [charon-elk-spring-boot-starter](./charon-spring-boot-starters/charon-elk-spring-boot-starter) 输出logback日志到elk
  -  [charon-fastjson-spring-boot-starter](./charon-spring-boot-starters/charon-fastjson-spring-boot-starter) springmvc使用fastjson序列化
  -  [charon-mongo-spring-boot-starter](./charon-spring-boot-starters/charon-mongo-spring-boot-starter)  拓展mongo-spring-boot-starter,新增多数据源功能
  -  [charon-notify-spring-boot-starter](./charon-spring-boot-starters/charon-notify-spring-boot-starter) 一个推送(通知)starter，支持钉钉等消息推送
  -  [charon-oss-spring-boot-starter](./charon-spring-boot-starters/charon-oss-spring-boot-starter) 一个oss starter，支持阿里云OSS及GitHub
  -  [charon-redis-spring-boot-starter](./charon-spring-boot-starters/charon-redis-spring-boot-starter) 拓展redis-spring-boot-starter,集成redisson(更好的redis分布式锁实现)
  -  [charon-swagger-spring-boot-starter](./charon-spring-boot-starters/charon-swagger-spring-boot-starter)  集成swagger及bootstrap主题
  -  [charon-shardingsphere-jdbc-spring-boot-starter](./charon-spring-boot-starters/charon-shardingsphere-jdbc-spring-boot-starter) 集成shardingsphere-jdbc
  -  [charon-spring-boot-admin-client-starter](./charon-spring-boot-starters/charon-spring-boot-admin-client-starter) 集成spring-boot-amin-client
- [docker](./docker) 常用docker镜像


## Maven 配置文件
https://code.aliyun.com/harvies/configs/raw/75d678e4c5a0c1b847d44edb469a342aa76bd9cb/.m2/settings.xml

## 编译

```bash
mvn clean install -DskipTests -U -s 'xxxx/settings.xml'
```

## 部署
```bash
mvn clean deploy -DskipTests -U -s 'xxx/settings.xml'
```

## 常用工具

### oh-my-zsh(zsh配置管理工具)
```
sh -c "$(curl -fsSL https://raw.githubusercontent.com/robbyrussell/oh-my-zsh/master/tools/install.sh)"
```
### arthas(Java诊断工具)
```
curl -O https://alibaba.github.io/arthas/arthas-boot.jar

java -jar arthas-boot.jar -repo-mirror aliyun

```
### htop(系统监控)