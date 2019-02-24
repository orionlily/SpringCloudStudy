# SpringCloudStudy

SpringCloud学习<br/>
1.SpringCloudServer 服务注册中心<br/>
2.SpringCloudClient 服务提供者(需要在服务中心注册) <br/>
3.SpringCloudConsumer 服务消费者(使用Ribbon方式) <br/>
  &nbsp;3.1 增加Hystrix断路由功能，①添加依赖②启动类添加注解③调用服务的方法添加注解</br>
  &nbsp;3.2 增加hystrix仪表盘 ①添加依赖②启动类添加注解 注意：不要使用IE<br/>
4.SpringCloudFeignCsm 服务消费者(使用Feign方式,Feign是对Ribbon的封装) <br/>
5.SpringCloudZuul 服务路由网关(请求分发) zuul再上传带有中文文字的文件时候会乱码，解决办法:直接在uri，前面加上”/zuul”.<br/>
6.SpringCloudConfigServer  （需要新建一个管理配置文件的仓库SpringCloudRepo）<br/> 
   分布式配置中心组件spring cloud config，它支持配置文件放在在配置服务的内存中，也支持放在远程Git仓库里。引入spring cloud config后，我们的外部配置文件就可以集中放置在一个git仓库里，再新建一个config server，用来管理所有的配置文件  <br/>
7.SpringCloudConfigClient  <br/>
    (说明：其实yml和properties文件是一样的原理，主要是说明application和bootstrap的加载顺序。且一个项目上要么yml或者properties，二选一的存在。<br/>
Bootstrap.yml（bootstrap.properties）在application.yml（application.properties）之前加载，就像application.yml一样，但是用于应用程序上下文的引<br/>导阶段。它通常用于“使用Spring Cloud Config Server时，应在bootstrap.yml中指定spring.application.name和spring.cloud.config.server.git.uri”以及一些加密/解密信息。技术上，bootstrap.yml由父Spring ApplicationContext加载。父ApplicationContext被加载<br/>到使用application.yml的之前。
<br/>例如，当使用Spring Cloud时，通常从服务器加载“real”配置数据。为了获取URL（和其他连接配置，如密码等），您需要一个较早的或“bootstrap”配置。因<br/>此，您将配置服务器属性放在bootstrap.yml中，该属性用于加载实际配置数据（通常覆盖application.yml [如果存在]中的内容）。)

8.SpringCloudBus 消息总线
如果不加入消息总线，一旦配置文件有变化，则需要重启配置客户端，才能读到最新的配置信息。而加入Bus之后，
我们只需要发送post请求：http://IP:端口/bus/refresh，你会发现config-client会重新读取配置文件
用的是rabbitMQ，需要安装erlang和rabbitMQ。

9.SpringCloudZipkinServer服务链路追踪 
SpringCloudSleuthPro和SpringCloudSleuthRe两个服务，相互调用,注意两个启动类，都要实例化AlwaysSampler ,因为服务链路追踪默认是0.1的采集率，所以不是每次请求都能捕捉到。

10.SpringCloudTurbine 监控数据聚合(将所有HystrixDashboard集合一起看)
将所有配置了dashboard的应用一起监控，这样就不用每个应用都打开页面监控数据。

11.SpringCloudConsul 不同于Eureka的另外一种服务注册中心，需要下载consul客户端，建议0.9版本

<br/>参考blog:<br/>
http://blog.csdn.net/forezp/article/details/69808079<br/>
博主github:<br/>
https://github.com/forezp/SpringCloudLearning<br/>

程序猿DD：<br/>
http://blog.didispace.com/springcloud1/<br/>

谷歌浏览器限制的一些端口号：
1：    // tcpmux  <br/>
7：    // echo    <br/>
9：    // discard    <br/> 
11：   // systat    <br/>
13：   // daytime    <br/>
15：   // netstat    <br/>
17：   // qotd    <br/>
19：   // chargen    <br/>
20：   // ftp data    <br/>
21：   // ftp access    <br/>
22：   // ssh    <br/>
23：   // telnet    <br/>
25：   // smtp    <br/>
37：   // time    <br/>
42：   // name    <br/>
43：   // nicname    <br/>
53：   // domain    <br/>
77：   // priv-rjs    <br/>
79：   // finger    <br/>
87：   // ttylink    <br/>
95：   // supdup    <br/>
101：  // hostriame    <br/>
102：  // iso-tsap    <br/>
103：  // gppitnp    <br/>
104：  // acr-nema    <br/>
109：  // pop2    <br/>
110：  // pop3    <br/>
111：  // sunrpc    <br/>
113：  // auth    <br/>
115：  // sftp    <br/>
117：  // uucp-path    <br/>
119：  // nntp    <br/>
123：  // NTP    <br/>
135：  // loc-srv /epmap    <br/>
139：  // netbios    <br/>
143：  // imap2    <br/>
179：  // BGP    <br/>
389：  // ldap    <br/>
465：  // smtp+ssl    <br/>
512：  // print / exec    <br/>
513：  // login    <br/>
514：  // shell    <br/>
515：  // printer    <br/>
526：  // tempo    <br/>
530：  // courier    <br/>
531：  // chat    <br/>
532：  // netnews    <br/>
540：  // uucp    <br/>
556：  // remotefs    <br/>
563：  // nntp+ssl    <br/>
587：  // stmp?    <br/>
601：  // ??    <br/>
636：  // ldap+ssl    <br/>
993：  // ldap+ssl    <br/>
995：  // pop3+ssl    <br/>
2049： // nfs    <br/>
3659： // apple-sasl / PasswordServer    <br/>
4045： // lockd    <br/>
6000： // X11    <br/>
6665： // Alternate IRC [Apple addition]    <br/>
6666： // Alternate IRC [Apple addition]    <br/>
6667： // Standard IRC [Apple addition]    <br/>
6668： // Alternate IRC [Apple addition]    <br/>
6669： // Alternate IRC [Apple addition]    <br/>

test
