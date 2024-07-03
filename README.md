# nursing-home
基于Springboot+Vue的智慧养老服务管理系统

#### 介绍
随着人口老龄化趋势的加剧，老年人口比例不断增加，传统的养老服务模式已经难以满足现代老年人的多元化需求。因此，如何高效、精准地提供养老服务，成为了社会关注的焦点。信息化与智能化的发展为养老服务带来了新的机遇。智慧养老作为新兴的养老服务模式，正逐步改变传统的养老服务格局。

**有偿获得完整源码+Q：1902317191**

**CSDN项目合集：http://t.csdnimg.cn/j7xXJ**

#### 软件架构
软件架构说明
![image](https://github.com/luooin/nursing-home/assets/85004172/0c85cc0e-2b22-4f70-ad5f-c50667acd3a2)



#### 安装教程

1. 运行环境准备mysql8+java8+node14.16.1

2. 配置maven路径，加载依赖

3. 运行sql文件，确保application.yml的数据库名称和账号密码是数据库所在主机的账号密码

#### 使用说明

1. 登入

   账号：admin	密码：admin
   账号：user	密码：123456

2.运行流程

前端初始化指令：
> npm install

前端运行指令(有两个端，一个是管理端，一个是用户端)：
> npm run serve

部署详情可以查看这篇csdn博客：http://t.csdnimg.cn/kpuxS

#### 项目演示

+ 普通用户

访问者可以在最顶端看到系统的导航栏，根据自己的需求点击需要去到的页面。用户可以单击“入院指南”，在入院指南界面的输入框中输入标题并进行搜索，就可以查看标题、发布时间、注意事项、发布人、封面等其他信息，在个人中心界面中，可以看见家属的账号、密码和性别等基本信息，还可以对这些信息进行更新操作。

![GIF 2024-6-17 19-49-40](GIF 2024-6-17 19-49-40-1718630421956.gif)


+ 管理员

管理员单击家属管理，在家属管理页面中输入家属的各项信息后，在页面中进行查询、新增或删除家属信息等操作。管理员点击护工管理，在护工管理页面中输入护工的所有信息，然后在页面上可以点击详情来查看护工的详细情况，点击修改来修改护工的信息，点击删除来删除护工的信息。管理员单击房间资料管理，在这个页面中可以对房间资料的信息进行管理。管理员单击床位管理，可以查看房间号、楼房名称等各项信息，还可以点击修改来修改床位信息，点击删除来删除床位信息。管理员还可以对老人入住进行管理，在这个界面中可以查看像入住编号、老人年龄等老人入住的详细信息，可以在界面顶端输入具体信息来查找，还可以点击删除来进行删除操作。管理员单击外出报备管理，在外出报备管理界面中可以查看老人的外出报备情况。

![GIF 2024-6-17 19-53-01](https://github.com/luooin/nursing-home/assets/85004172/385d167e-a4d4-4c9d-908d-1d41cbb35e65)


+ 首页

![image](https://github.com/luooin/nursing-home/assets/85004172/96c278d3-fd40-45ea-b336-04f4d28c9080)

+ 入院指南页面

![image](https://github.com/luooin/nursing-home/assets/85004172/fdbda507-3498-465c-8973-5b9ea36617e2)

+ 个人中心页面

![image](https://github.com/luooin/nursing-home/assets/85004172/7b603c45-61af-4718-8e96-72f87b249499)


+ 管理员登录界面

![image](https://github.com/luooin/nursing-home/assets/85004172/f6f654d3-f519-4095-a2b0-a1fdcd228ff4)

+ 护工管理界面

![image](https://github.com/luooin/nursing-home/assets/85004172/7b8625e9-8359-43c7-ae0b-529ab44563e7)


#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)

有偿获得源码+Q：1902317191


