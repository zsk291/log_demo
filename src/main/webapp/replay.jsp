<%@ page import="com.itheima.pojo.Brand" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 2022/8/28
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="z" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${brands}
<%
    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
    brands.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
    brands.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));
%>
<input type="button" value="新增"><br>
<hr>
<table border="1" cellspacing="0" width="800">
    <tr>
        <th>序号</th>
        <th>品牌名称</th>
        <th>企业名称</th>
        <th>排序</th>
        <th>品牌介绍</th>
        <th>状态</th>
        <th>操作</th>

    </tr>
        <%
        for (int i = 0; i < brands.size(); i++) {
            Brand brand = brands.get(i);
            %>
    <tr>
        <%--        因为html对应的是out。write，所以里面用。。。--%>
        <td><%=brand.getId()%>
        </td>
        <td><%=brand.getBrandName()%>
        </td>
        <td><%=brand.getCompanyName()%>
        </td>
        <td><%=brand.getOrdered()%>
        </td>
        <td><%=brand.getDescription()%>
        </td>
            <%
                if (brand.getStatus()==1){
            %>
            <td><%="启用"%></td>
            <%
                }else {
            %>
            <td><%="禁用"%></td>
            <%
                }
            %>
        </td>
        <td><a href="#">修改</a> <a href="#">删除</a></td>
    </tr>
        <%
        }
    %>

</body>
</html>
