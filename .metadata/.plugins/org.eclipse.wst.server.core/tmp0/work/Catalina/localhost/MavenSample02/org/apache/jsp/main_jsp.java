/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-08 07:33:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.smhrd.model.MemberVO;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1308849601000L));
    _jspx_dependants.put("jar:file:/C:/Users/smhrd/Desktop/JSPStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MavenSample02/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("com.smhrd.model.MemberVO");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("  \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<title>Forty by HTML5 UP</title>\r\n");
      out.write("		<meta charset=\"utf-8\" />\r\n");
      out.write("		<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"assets/css/main.css\" />\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("	");

		// 1. session 영역 안에 저장된 데이터 꺼내오기
		MemberVO mvo = (MemberVO)session.getAttribute("member");
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- Wrapper -->\r\n");
      out.write("			<div id=\"wrapper\">\r\n");
      out.write("\r\n");
      out.write("				<!-- Header -->\r\n");
      out.write("					<header id=\"header\" class=\"alt\">\r\n");
      out.write("						<a href=\"index.html\" class=\"logo\"><strong>Forty</strong> <span>by HTML5 UP</span></a>\r\n");
      out.write("						<nav>\r\n");
      out.write("							");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("							");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("						</nav>\r\n");
      out.write("					</header>\r\n");
      out.write("\r\n");
      out.write("				<!-- Menu -->\r\n");
      out.write("					<nav id=\"menu\">	\r\n");
      out.write("						<ul class=\"links\">\r\n");
      out.write("							<li><h5>로그인</h5></li>\r\n");
      out.write("								<form action=\"LoginService\" method=\"post\">\r\n");
      out.write("									<li><input type=\"text\" name=\"email\" placeholder=\"Email을 입력하세요\"></li>\r\n");
      out.write("									<li><input type=\"password\" name=\"pw\" placeholder=\"PW를 입력하세요\"></li>\r\n");
      out.write("									<li><input type=\"submit\" value=\"LogIn\" class=\"button fit\"></li>\r\n");
      out.write("								</form>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<ul class=\"actions vertical\">\r\n");
      out.write("							<li><h5>회원가입</h5></li>\r\n");
      out.write("							<!-- 전송해야하는 데이터에 name값을 달아줄 때, DB table의 column명과 일치시키는 습관을 들이자! -->\r\n");
      out.write("								<form action=\"JoinService\" method=\"post\">\r\n");
      out.write("									<li><input type=\"text\" name=\"email\" placeholder=\"Email을 입력하세요\"></li>\r\n");
      out.write("									<li><input type=\"password\" name=\"pw\" placeholder=\"PW를 입력하세요\"></li>\r\n");
      out.write("									<li><input type=\"text\" name=\"tel\" placeholder=\"전화번호를 입력하세요\"></li>\r\n");
      out.write("									<li><input type=\"text\" name=\"address\" placeholder=\"집주소를 입력하세요\"></li>\r\n");
      out.write("									<li><input type=\"submit\" value=\"JoinUs\" class=\"button fit\"></li>\r\n");
      out.write("								</form>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</nav>			\r\n");
      out.write("				<!-- Banner -->\r\n");
      out.write("					<section id=\"banner\" class=\"major\">\r\n");
      out.write("						<div class=\"inner\">\r\n");
      out.write("							<header class=\"major\">\r\n");
      out.write("							");
 if(mvo != null) { 
      out.write("\r\n");
      out.write("										<h1>");
      out.print(mvo.getEmail() );
      out.write("님 환영합니다.</h1>							\r\n");
      out.write("							");
 }else{ 
      out.write("\r\n");
      out.write("										<h1>로그인 해주세요.</h1>\r\n");
      out.write("							");
} 
      out.write("\r\n");
      out.write("							</header>\r\n");
      out.write("							<div class=\"content\">\r\n");
      out.write("								<p>아래는 지금까지 배운 웹 기술들입니다.<br></p>\r\n");
      out.write("								<ul class=\"actions\">\r\n");
      out.write("									<li><a href=\"#one\" class=\"button next scrolly\">확인하기</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</section>\r\n");
      out.write("\r\n");
      out.write("				<!-- Main -->\r\n");
      out.write("					<div id=\"main\">\r\n");
      out.write("\r\n");
      out.write("						<!-- One -->\r\n");
      out.write("							<section id=\"one\" class=\"tiles\">\r\n");
      out.write("								<article>\r\n");
      out.write("									<span class=\"image\">\r\n");
      out.write("										<img src=\"images/pic01.jpg\" alt=\"\" />\r\n");
      out.write("									</span>\r\n");
      out.write("									<header class=\"major\">\r\n");
      out.write("										<h3><a href=\"#\" class=\"link\">HTML</a></h3>\r\n");
      out.write("										<p>홈페이지를 만드는 기초 언어</p>\r\n");
      out.write("									</header>\r\n");
      out.write("								</article>\r\n");
      out.write("								<article>\r\n");
      out.write("									<span class=\"image\">\r\n");
      out.write("										<img src=\"images/pic02.jpg\" alt=\"\" />\r\n");
      out.write("									</span>\r\n");
      out.write("									<header class=\"major\">\r\n");
      out.write("										<h3><a href=\"#\" class=\"link\">CSS</a></h3>\r\n");
      out.write("										<p>HTML을 디자인해주는 언어</p>\r\n");
      out.write("									</header>\r\n");
      out.write("								</article>\r\n");
      out.write("								<article>\r\n");
      out.write("									<span class=\"image\">\r\n");
      out.write("										<img src=\"images/pic03.jpg\" alt=\"\" />\r\n");
      out.write("									</span>\r\n");
      out.write("									<header class=\"major\">\r\n");
      out.write("										<h3><a href=\"#\" class=\"link\">Servlet/JSP</a></h3>\r\n");
      out.write("										<p>Java를 기본으로 한 웹 프로그래밍 언어/스크립트 언어</p>\r\n");
      out.write("									</header>\r\n");
      out.write("								</article>\r\n");
      out.write("								<article>\r\n");
      out.write("									<span class=\"image\">\r\n");
      out.write("										<img src=\"images/pic04.jpg\" alt=\"\" />\r\n");
      out.write("									</span>\r\n");
      out.write("									<header class=\"major\">\r\n");
      out.write("										<h3><a href=\"#\" class=\"link\">JavaScript</a></h3>\r\n");
      out.write("										<p>HTML에 기본적인 로직을 정의할 수 있는 언어</p>\r\n");
      out.write("									</header>\r\n");
      out.write("								</article>\r\n");
      out.write("								<article>\r\n");
      out.write("									<span class=\"image\">\r\n");
      out.write("										<img src=\"images/pic05.jpg\" alt=\"\" />\r\n");
      out.write("									</span>\r\n");
      out.write("									<header class=\"major\">\r\n");
      out.write("										<h3><a href=\"#\" class=\"link\">MVC</a></h3>\r\n");
      out.write("										<p>웹 프로젝트 중 가장 많이 사용하는 디자인패턴</p>\r\n");
      out.write("									</header>\r\n");
      out.write("								</article>\r\n");
      out.write("								<article>\r\n");
      out.write("									<span class=\"image\">\r\n");
      out.write("										<img src=\"images/pic06.jpg\" alt=\"\" />\r\n");
      out.write("									</span>\r\n");
      out.write("									<header class=\"major\">\r\n");
      out.write("										<h3><a href=\"#\" class=\"link\">Web Project</a></h3>\r\n");
      out.write("										<p>여러분의 최종프로젝트에 웹 기술을 활용하세요!</p>\r\n");
      out.write("									</header>\r\n");
      out.write("								</article>\r\n");
      out.write("							</section>\r\n");
      out.write("					<!-- Two -->\r\n");
      out.write("							<section id=\"two\">\r\n");
      out.write("								<div class=\"inner\">\r\n");
      out.write("									<header class=\"major\">\r\n");
      out.write("										<h2>나에게 온 메세지 확인하기</h2>\r\n");
      out.write("									</header>\r\n");
      out.write("									<p></p>\r\n");
      out.write("									<ul class=\"actions\">\r\n");
      out.write("										<li>로그인을 하세요.</li>\r\n");
      out.write("										<li><a href=\"#\" class=\"button next scrolly\">전체삭제하기</a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</div>\r\n");
      out.write("							</section>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Contact -->\r\n");
      out.write("					<section id=\"contact\">\r\n");
      out.write("						<div class=\"inner\">\r\n");
      out.write("							<section>\r\n");
      out.write("								<form>\r\n");
      out.write("								<div class=\"field half first\">\r\n");
      out.write("										<label for=\"name\">Name</label>\r\n");
      out.write("										<input type=\"text\"  id=\"name\" placeholder=\"보내는 사람 이름\" />\r\n");
      out.write("									</div>\r\n");
      out.write("									<div class=\"field half\">\r\n");
      out.write("										<label for=\"email\">Email</label>\r\n");
      out.write("										<input type=\"text\"  id=\"email\" placeholder=\"보낼 사람 이메일\"/>\r\n");
      out.write("									</div>\r\n");
      out.write("\r\n");
      out.write("									<div class=\"field\">\r\n");
      out.write("										<label for=\"message\">Message</label>\r\n");
      out.write("										<textarea  id=\"message\" rows=\"6\"></textarea>\r\n");
      out.write("									</div>\r\n");
      out.write("									<ul class=\"actions\">\r\n");
      out.write("										<li><input type=\"submit\" value=\"Send Message\" class=\"special\" /></li>\r\n");
      out.write("										<li><input type=\"reset\" value=\"Clear\" /></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("								</form>\r\n");
      out.write("							</section>\r\n");
      out.write("							\r\n");
      out.write("							<section class=\"split\">\r\n");
      out.write("								<section>\r\n");
      out.write("									<div class=\"contact-method\">\r\n");
      out.write("										<span class=\"icon alt fa-envelope\"></span>\r\n");
      out.write("										<h3>Email</h3>\r\n");
      out.write("										<a href=\"#\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("											\r\n");
      out.write("									</div>\r\n");
      out.write("								</section>\r\n");
      out.write("								<section>\r\n");
      out.write("									<div class=\"contact-method\">\r\n");
      out.write("										<span class=\"icon alt fa-phone\"></span>\r\n");
      out.write("										<h3>Phone</h3>\r\n");
      out.write("										<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.tel}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("									</div>\r\n");
      out.write("								</section>\r\n");
      out.write("								<section>\r\n");
      out.write("									<div class=\"contact-method\">\r\n");
      out.write("										<span class=\"icon alt fa-home\"></span>\r\n");
      out.write("										<h3>Address</h3>\r\n");
      out.write("										<span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.address}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("									</div>\r\n");
      out.write("								</section>\r\n");
      out.write("							</section>					\r\n");
      out.write("						</div>\r\n");
      out.write("					</section>\r\n");
      out.write("\r\n");
      out.write("				<!-- Footer -->\r\n");
      out.write("					<footer id=\"footer\">\r\n");
      out.write("						<div class=\"inner\">\r\n");
      out.write("							<ul class=\"icons\">\r\n");
      out.write("								<li><a href=\"#\" class=\"icon alt fa-twitter\"><span class=\"label\">Twitter</span></a></li>\r\n");
      out.write("								<li><a href=\"#\" class=\"icon alt fa-facebook\"><span class=\"label\">Facebook</span></a></li>\r\n");
      out.write("								<li><a href=\"#\" class=\"icon alt fa-instagram\"><span class=\"label\">Instagram</span></a></li>\r\n");
      out.write("								<li><a href=\"#\" class=\"icon alt fa-github\"><span class=\"label\">GitHub</span></a></li>\r\n");
      out.write("								<li><a href=\"#\" class=\"icon alt fa-linkedin\"><span class=\"label\">LinkedIn</span></a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("							<ul class=\"copyright\">\r\n");
      out.write("								<li>&copy; Untitled</li><li>Design: <a href=\"https://html5up.net\">HTML5 UP</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</footer>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		<!-- Scripts -->\r\n");
      out.write("			<script src=\"assets/js/jquery.min.js\"></script>\r\n");
      out.write("			<script src=\"assets/js/jquery.scrolly.min.js\"></script>\r\n");
      out.write("			<script src=\"assets/js/jquery.scrollex.min.js\"></script>\r\n");
      out.write("			<script src=\"assets/js/skel.min.js\"></script>\r\n");
      out.write("			<script src=\"assets/js/util.js\"></script>\r\n");
      out.write("			<!--[if lte IE 8]><script src=\"assets/js/ie/respond.min.js\"></script><![endif]-->\r\n");
      out.write("			<script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /main.jsp(25,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("							\r\n");
          out.write("								");
          if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("							\r\n");
          out.write("							\r\n");
          out.write("								");
          if (_jspx_meth_c_005fif_005f2(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("							\r\n");
          out.write("								\r\n");
          out.write("								\r\n");
          out.write("								<a href=\"LogoutService\">로그아웃</a>\r\n");
          out.write("							\r\n");
          out.write("							\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /main.jsp(27,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email == 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("									<a href=\"SelectAllService\">회원관리</a>\r\n");
          out.write("								");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /main.jsp(31,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.email != 'admin'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("									<a href=\"update.jsp\">개인정보수정</a>\r\n");
          out.write("								");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /main.jsp(40,7) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member == null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("								<a href=\"#menu\">로그인</a>\r\n");
          out.write("							");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }
}