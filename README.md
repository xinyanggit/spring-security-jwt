## springsceurity-jwt介绍
1.主要是采用springboot +springsecurity + jwt的形式实现登录
2.运行的数据库在sql 里面，新建一个spring-security 数据库执行即可（配置用户名和密码）
2. 请求url
   >post     http://localhost:9991/authentication/login  username,password
  
  整体思路：
    1. /login==> 利用 ss 对其放行，将username 和password 封装成 UsernamePasswordAuthenticationToken 获取对象进行调用匹配
 2. 用户实体 User  实现 UserDetails
    用户验证  UserService 继承 UserDetailsService 
