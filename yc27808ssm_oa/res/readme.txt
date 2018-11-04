SSM:
web.xml
	<!-- �ò�����ʽ����spring�����ļ���λ�� -->
	<context-param>
		<param-name>contextConfigLocation</param-name>
		<param-value>classpath:spring-mybatis.xml</param-value>
	</context-param>
	<!-- ��������ʱ������spring -->
	<listener>
		<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
	</listener>
	<servlet>
		<servlet-name>springMvc</servlet-name>
		<!-- ǰ�˿����� -->
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>springMvc</servlet-name>
		<url-pattern>/</url-pattern>
	</servlet-mapping>
springMvc-servlet.xml
	<!-- ���ע���ʹ��ǰ�� -->
	<mvc:annotation-driven />
	<context:component-scan base-package="com.yc" />
	<!-- ��ͼ������ -->
	<bean id="viewResolver"
		class="org.springframework.web.servlet.view.InternalResourceViewResolver">
		<property name="prefix" value="/WEB-INF/jsp/" />
		<property name="suffix" value=".jsp" />
		<!--/WEB-INF/jsp/userList.jsp -->
	</bean>
spring-mybatis.xml
	<bean id="dataSource" class="org.apache.commons.dbcp.BasicDataSource">
		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
		<property name="url" value="jdbc:mysql://localhost:3306/abd" />
		<property name="username" value="root" />
		<property name="password" value="root" />
	</bean>
	<bean id="sessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource" />
		<property name="mapperLocations" value="classpath*:com/yc/userSys/dao/*.xml" />
	</bean>
	<!-- ����DAOʵ���� -->
	<bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="com.yc.userSys.dao" />
		<property name="sqlSessionFactoryBeanName" value="sessionFactory" />
	</bean>
