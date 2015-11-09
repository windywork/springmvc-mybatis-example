<h2>介绍</h2>
<p>学习使用  SpringMVC+Mybatis+JSON  架构最简易项目代码结构。


<h2>安装</h2>
<p>使用 克隆或直接下载项目到本地</p>

<p>git checkout https://github.com/FrankLee33/springmvc-mybatis-example.git</p>
<p>将下载的maven项目导入到Eclipse中</p>
<p>把 resources/create.sql文件，导入到你的MySQL数据库中</p>

<p>修改src/main/resources/conf/jdbc.properties文件,根据上一步的数据库信息，修改数据库连接</p>
<pre>
// 修改数据库连接地址
jdbc_driverClassName=com.mysql.jdbc.Driver
jdbc_url=jdbc:mysql://localhost:3306/sgjson
jdbc_username=root
jdbc_password=
</pre>
<h2>启动项目</h2>

<p>用tomcat启动项目</p>
