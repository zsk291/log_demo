/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2022-08-29 12:21:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.itheima.pojo.Brand;
import java.util.List;
import java.util.ArrayList;

public final class replay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("${brands}\r\n");

    List<Brand> brands = new ArrayList<>();
    brands.add(new Brand(1, "三只松鼠", "三只松鼠", 100, "三只松鼠，好吃不上火", 1));
    brands.add(new Brand(2, "优衣库", "优衣库", 200, "优衣库，服适人生", 0));
    brands.add(new Brand(3, "小米", "小米科技有限公司", 1000, "为发烧而生", 1));

      out.write("\r\n");
      out.write("<input type=\"button\" value=\"新增\"><br>\r\n");
      out.write("<hr>\r\n");
      out.write("<table border=\"1\" cellspacing=\"0\" width=\"800\">\r\n");
      out.write("    <tr>\r\n");
      out.write("        <th>序号</th>\r\n");
      out.write("        <th>品牌名称</th>\r\n");
      out.write("        <th>企业名称</th>\r\n");
      out.write("        <th>排序</th>\r\n");
      out.write("        <th>品牌介绍</th>\r\n");
      out.write("        <th>状态</th>\r\n");
      out.write("        <th>操作</th>\r\n");
      out.write("\r\n");
      out.write("    </tr>\r\n");
      out.write("        ");

        for (int i = 0; i < brands.size(); i++) {
            Brand brand = brands.get(i);
            
      out.write("\r\n");
      out.write("    <tr>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <td>");
      out.print(brand.getId());
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>");
      out.print(brand.getBrandName());
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>");
      out.print(brand.getCompanyName());
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>");
      out.print(brand.getOrdered());
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td>");
      out.print(brand.getDescription());
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("            ");

                if (brand.getStatus()==1){
            
      out.write("\r\n");
      out.write("            <td>");
      out.print("启用");
      out.write("</td>\r\n");
      out.write("            ");

                }else {
            
      out.write("\r\n");
      out.write("            <td>");
      out.print("禁用");
      out.write("</td>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("        </td>\r\n");
      out.write("        <td><a href=\"#\">修改</a> <a href=\"#\">删除</a></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("        ");

        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
