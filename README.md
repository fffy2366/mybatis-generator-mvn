#mybatis generator

##安装maven
```
$ cd ~/java/
$ wget http://apache.dataguru.cn/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
$ tar -xvf apache-maven-3.3.9-bin.tar.gz
$ cd apache-maven-3.3.9
$ pwd

$ vim ~/.bash_profile
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_65.jdk/Contents/Home/
export M2_HOME=$HOME/java/apache-maven-3.3.9
export PATH=$PATH:$M2_HOME/bin

$ source ~/.bash_profile
$ mvn -version
```
##配置intellij 运行maven

Run->Edit Configurations->Add new configuration->Maven->
Parameters:
mybatis-generator:generate -e

Runner:
-Dmaven.multiModuleProjectDirectory=$M2_HOME



##参考
[Intellij IDEA 14中使用MyBatis-generator 自动生成MyBatis代码](http://blog.csdn.net/z69183787/article/details/46560071)
[ SSM框架——使用MyBatis Generator自动创建代码](http://blog.csdn.net/zhshulin/article/details/23912615)
