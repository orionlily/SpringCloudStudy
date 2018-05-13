# SpringCloudStudy

SpringCloud学习<br/>
1.SpringCloudServer 服务注册中心<br/>
2.SpringCloudClient 服务提供者(需要在服务中心注册) <br/>
3.SpringCloudConsumer 服务消费者(使用Ribbon方式) <br/>
  &nbsp;3.1 增加Hystrix断路由功能，①添加依赖②启动类添加注解③调用服务的方法添加注解</br>
  &nbsp;3.2 增加hystrix仪表盘 ①添加依赖②启动类添加注解 注意：不要使用IE<br/>
4.SpringCloudFeignCsm 服务消费者(使用Feign方式,Feign是对Ribbon的封装) <br/>
5.SpringCloudZuul 服务路由网关(请求分发)<br/>

参考blog:<br/>
http://blog.csdn.net/forezp/article/details/69808079<br/>
博主github:<br/>
https://github.com/forezp/SpringCloudLearning<br/>

程序猿DD：<br/>
http://blog.didispace.com/springcloud1/<br/>

谷歌浏览器限制的一些端口号：
1：    // tcpmux
7：    // echo
9：    // discard
11：   // systat
13：   // daytime
15：   // netstat
17：   // qotd
19：   // chargen
20：   // ftp data
21：   // ftp access
22：   // ssh
23：   // telnet
25：   // smtp
37：   // time
42：   // name
43：   // nicname
53：   // domain
77：   // priv-rjs
79：   // finger
87：   // ttylink
95：   // supdup
101：  // hostriame
102：  // iso-tsap
103：  // gppitnp
104：  // acr-nema
109：  // pop2
110：  // pop3
111：  // sunrpc
113：  // auth
115：  // sftp
117：  // uucp-path
119：  // nntp
123：  // NTP
135：  // loc-srv /epmap
139：  // netbios
143：  // imap2
179：  // BGP
389：  // ldap
465：  // smtp+ssl
512：  // print / exec
513：  // login
514：  // shell
515：  // printer
526：  // tempo
530：  // courier
531：  // chat
532：  // netnews
540：  // uucp
556：  // remotefs
563：  // nntp+ssl
587：  // stmp?
601：  // ??
636：  // ldap+ssl
993：  // ldap+ssl
995：  // pop3+ssl
2049： // nfs
3659： // apple-sasl / PasswordServer
4045： // lockd
6000： // X11
6665： // Alternate IRC [Apple addition]
6666： // Alternate IRC [Apple addition]
6667： // Standard IRC [Apple addition]
6668： // Alternate IRC [Apple addition]
6669： // Alternate IRC [Apple addition]
