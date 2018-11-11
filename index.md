feilong core
================

[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)
![build](https://img.shields.io/jenkins/s/https/jenkins.qa.ubuntu.com/precise-desktop-amd64_default.svg "build") 
![JDK 1.7](https://img.shields.io/badge/JDK-1.7-green.svg "JDK 1.7")
[![jar size 107K](https://img.shields.io/badge/size-107K-green.svg "size 107K")](https://github.com/venusdrogon/feilong-platform/tree/repository/com/feilong/platform/feilong-core/1.9.1)
[![javadoc 82%](http://progressed.io/bar/82?title=javadoc "javadoc 82%")](http://venusdrogon.github.io/feilong-platform/javadocs/feilong-core/) 
[![tests 1321](https://img.shields.io/badge/tests-1321%20%2F%201321-green.svg "tests 1321")](https://github.com/venusdrogon/feilong-core/tree/master/src/test/java/com/feilong/core) 

> Reduce development, Release ideas (减少开发,释放思想)


`核心jar,所有feilong platform的基础` 

# 简介:

1. 目标:`Reduce development, Release ideas`
1. 可以帮助你的代码更简短精炼，使它易写、易读、易于维护。
1. 提高工作效率，让你从大量重复的底层代码中脱身。

# 使用`feilong-core`的理由:

- [使用`feilong-core`的理由](https://github.com/venusdrogon/feilong-core/wiki/Reasons-for-use-feilong-core) 

# 一图概述:

![one-feilong-core](http://venusdrogon.github.io/feilong-platform/mysource/one-feilong-core.png) 


# :dragon: Maven使用配置

feilong-core jar你可以直接在 [仓库](https://github.com/venusdrogon/feilong-platform/tree/repository/com/feilong/platform/feilong-core "仓库") 浏览 

如果你使用 `maven`, 您可以通过以下方式来配置 `pom.xml`:

```XML

	<project>
	
		....
		<properties>
			<version.feilong-platform>1.9.1</version.feilong-platform>
			....
		</properties>
		
		....
		<repositories>
			<repository>
				<id>feilong-repository</id>
				<url>https://raw.github.com/venusdrogon/feilong-platform/repository</url>
			</repository>
		</repositories>
		
		....
		<dependencies>
			....
			<dependency>
				<groupId>com.feilong.platform</groupId>
				<artifactId>feilong-core</artifactId>
				<version>${version.feilong-platform}</version>
			</dependency>
			....
		</dependencies>
		....
	</project>
```

# 帮助:

- [Javadoc](http://venusdrogon.github.io/feilong-platform/javadocs/feilong-core/) 
- [Release notes](http://venusdrogon.github.io/feilong-platform/releasenotes/feilong-core/) 
- [wiki](https://github.com/venusdrogon/feilong-core/wiki) 
- [Site](http://venusdrogon.github.io/feilong-platform/site/feilong-core/) 


# :memo: 说明

1. 基于`Apache2` 协议,您可以下载代码用于闭源项目,但每个修改的过的文件必须放置版权说明;
1. 基于`maven3.3`构建;
1. [require-jdk-version](https://github.com/venusdrogon/feilong-core/wiki/require-jdk-version)
1. [dependencies](https://github.com/venusdrogon/feilong-core/wiki/dependencies)


# :panda_face: About

如果您对feilong core 有任何建议和批评,可以使用下面的联系方式：

* iteye博客:http://feitianbenyue.iteye.com/