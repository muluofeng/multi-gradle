### gradle 多模块项目构建介绍

项目结构：
    根项目  multiproject
    子项目  multi-service
    子项目  multicontroller
    


根项目setting.gradle 定义多模块：
```
rootProject.name = 'multiproject'
include 'multi-service'
include 'multicontroller'
```

根项目build.gradle 定义一些常用配置，比如仓库地址，插件：

子项目build.gradle 定义子项目的自定义的配置