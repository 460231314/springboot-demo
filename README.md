# springboot-demo
基于springboot的基本架子

## Swagger2
>> 访问localhost:8080/swagger-ui.html<br/>
>> 如果需要关闭swagger2请修改配置文件application.yaml 中swagger.enable为false<br/>

## Mybatis-Plus
>> 在dao模块中test启动GeberatorUIServer.(该项目仅提供UI,生成逻辑均依赖Mybatis原生驱动) <br/>
>> 请注意修改你的数据库配置.<br/>
>> 生成对应文件后请移动到对应的模块目录下.<br/>
>> MybaitsConfig配置了分页插件及其他Mybatis相关配置<br/>

## Redis
>> 有两个与redis相关的配置文件，RedisConfig,RedisTemplateConfig<br/>
>> 有两个与redis相关的工具类，RedisKeyUtils,RedisUtils
