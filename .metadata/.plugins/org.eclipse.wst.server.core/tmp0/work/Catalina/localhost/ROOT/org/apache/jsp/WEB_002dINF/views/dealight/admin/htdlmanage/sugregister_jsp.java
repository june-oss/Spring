/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2021-01-02 03:41:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.dealight.admin.htdlmanage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sugregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(6);
    _jspx_dependants.put("/WEB-INF/views/includes/adminHeader.jsp", Long.valueOf(1609558817000L));
    _jspx_dependants.put("/WEB-INF/views/includes/adminFooter.jsp", Long.valueOf(1608797706000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1605067212452L));
    _jspx_dependants.put("jar:file:/Users/hyeonjung/Documents/Coding/spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/dealight_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/Users/hyeonjung/Documents/Coding/spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/dealight_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/Users/hyeonjung/Documents/Coding/spring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/dealight_project/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("   <!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>관리자페이지</title>\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template-->\n");
      out.write("    <link href=\"/resources/bootstrap/vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link\n");
      out.write("        href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\"\n");
      out.write("        rel=\"stylesheet\">\n");
      out.write("<link href=\"/resources/bootstrap/vendor/datatables/dataTables.bootstrap4.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"/resources/bootstrap/css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("\t<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("\t\n");
      out.write("\t<!-- 동인 추가  -->\n");
      out.write("\t<style>\n");
      out.write("\t\t.selected_img{\n");
      out.write("\t\tborder : 4px red solid;\n");
      out.write("\t}\n");
      out.write("\t</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <!-- Page Wrapper -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar - Brand -->\n");
      out.write("            <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"/dealight/admin/main\">\n");
      out.write("                <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("                    <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sidebar-brand-text mx-3\">Dealight</div>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Dashboard -->\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"/dealight/dealight/\">\n");
      out.write("                    <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("                    <span>Main</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("            <!-- Heading -->\n");
      out.write("            <div class=\"sidebar-heading\">\n");
      out.write("                관리\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("                    <i class=\"fas fa-fw fa-cog\"></i>\n");
      out.write("                    <span>회원관리</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">일반회원관리</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"/dealight/admin/usermanage/user\">일반회원</a>\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">사업자회원관리</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"/dealight/admin/usermanage/bizUser\">사업자회원관리</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"/dealight/admin/brnomanage\">사업자등록관리</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Utilities Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\"\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("                    <i class=\"fas fa-fw fa-wrench\"></i>\n");
      out.write("                    <span>매장관리</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\"\n");
      out.write("                    data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">일반매장/사업자매장</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"/dealight/admin/storemanage\">일반매장</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"utilities-border.html\">사업자매장</a>\n");
      out.write("                        <div class=\"collapse-divider\"></div>\n");
      out.write("                        <h6 class=\"collapse-header\">핫딜관리</h6>\n");
      out.write("                        <a class=\"collapse-item\" href=\"/dealight/admin/htdlmanage/A\">핫딜관리</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"/dealight/admin/htdlmanage/suggest\">핫딜제안</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapsePages\"\n");
      out.write("                    aria-expanded=\"true\" aria-controls=\"collapsePages\">\n");
      out.write("                    <i class=\"fas fa-fw fa-folder\"></i>\n");
      out.write("                    <span>고객센터</span>\n");
      out.write("                </a>\n");
      out.write("                <div id=\"collapsePages\" class=\"collapse\" aria-labelledby=\"headingPages\" data-parent=\"#accordionSidebar\">\n");
      out.write("                    <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                        <h6 class=\"collapse-header\">고객센터</h6>\n");
      out.write("                       <a class=\"collapse-item\" href=\"login.html\">FAQ</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"register.html\">문의사항</a>\n");
      out.write("                        <a class=\"collapse-item\" href=\"forgot-password.html\">자주묻는질문</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Charts -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"charts.html\">\n");
      out.write("                    <i class=\"fas fa-fw fa-chart-area\"></i>\n");
      out.write("                    <span>Charts</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <!-- Nav Item - Tables -->\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"tables.html\">\n");
      out.write("                    <i class=\"fas fa-fw fa-table\"></i>\n");
      out.write("                    <span>Tables</span></a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("              <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("            <!-- Heading -->\n");
      out.write("            <div class=\"sidebar-heading\">\n");
      out.write("                뭐 넣을까??\n");
      out.write("            </div>\n");
      out.write("            <!-- Divider -->\n");
      out.write("            <hr class=\"sidebar-divider d-none d-md-block\">\n");
      out.write("\n");
      out.write("            <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("            <div class=\"text-center d-none d-md-inline\">\n");
      out.write("                <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Sidebar Message -->\n");
      out.write("            <div class=\"sidebar-card\">\n");
      out.write("                <img class=\"sidebar-card-illustration mb-2\" src=\"/resources/bootstrap/img/undraw_rocket.svg\" alt=\"\">\n");
      out.write("                <p class=\"text-center mb-2\"><strong>SB Admin Pro</strong> is packed with premium features, components, and more!</p>\n");
      out.write("                <a class=\"btn btn-success btn-sm\" href=\"https://startbootstrap.com/theme/sb-admin-pro\">Upgrade to Pro!</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </ul>\n");
      out.write("        <!-- End of Sidebar -->\n");
      out.write("\n");
      out.write("        <!-- Content Wrapper -->\n");
      out.write("        <div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <!-- Topbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <!-- Topbar Search -->\n");
      out.write("                    <form\n");
      out.write("                        class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\"\n");
      out.write("                                aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                    <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <!-- Topbar Navbar -->\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Messages -->\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"searchDropdown\">\n");
      out.write("                                <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control bg-light border-0 small\"\n");
      out.write("                                            placeholder=\"Search for...\" aria-label=\"Search\"\n");
      out.write("                                            aria-describedby=\"basic-addon2\">\n");
      out.write("                                        <div class=\"input-group-append\">\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                                                <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Alerts -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                                <!-- Counter - Alerts -->\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">3+</span>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Alerts -->\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"alertsDropdown\">\n");
      out.write("                                <h6 class=\"dropdown-header\">\n");
      out.write("                                    Alerts Center\n");
      out.write("                                </h6>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                   \n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Messages -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                                <!-- Counter - Messages -->\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">7</span>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Messages -->\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"messagesDropdown\">\n");
      out.write("                                <h6 class=\"dropdown-header\">\n");
      out.write("                                    Message Center\n");
      out.write("                                </h6>\n");
      out.write("                                \n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - User Information -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\"\n");
      out.write("                                data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-gray-600 small\">Douglas McGee</span>\n");
      out.write("                                <img class=\"img-profile rounded-circle\"\n");
      out.write("                                    src=\"/resources/bootstrap/img/undraw_profile.svg\">\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - User Information -->\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\"\n");
      out.write("                                aria-labelledby=\"userDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Profile\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Settings\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-list fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Activity Log\n");
      out.write("                                </a>\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i>\n");
      out.write("                                    Logout\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </nav>\n");
      out.write("                <!-- End of Topbar -->");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Begin Page Content -->\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t<h1 class=\"h3 mb-2 text-gray-800\">Tables</h1>\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<div class=\"card shadow mb-4\" style=\"width: 100%;\">\n");
      out.write("\t\t<div class=\"card-header py-3\">\n");
      out.write("\t\t\t<h6 class=\"m-0 font-weight-bold text-primary\">핫딜제안</h6>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<form action=\"/dealight/admin/htdlmanage/sugregister\" id=\"operForm\" method=\"post\">\n");
      out.write("\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t<div class=\"card mb-4\">\n");
      out.write("\t\t\t\t<div class=\"card-header\">매장명</div>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"card-body\" name=\"storeName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suggestStore.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"card mb-4\">\n");
      out.write("\t\t\t\t<div class=\"card-header\">핫딜이름</div>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"card-body\" name=\"htdlName\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t<div class=\"card mb-4\">\n");
      out.write("\t\t\t\t<div class=\"card-header\">핫딜시간</div>\n");
      out.write("\t\t\t\t<div class=\"card-body\">\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"time\" name=\"startTm\">-\n");
      out.write("\t\t\t\t<input type=\"time\" name=\"endTm\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"card mb-4\">\n");
      out.write("\t\t\t\t<div class=\"card-header\">제안 인원</div>\n");
      out.write("\t\t\t\t<input type=\"number\" min=\"0\" class=\"card-body\" name=\"lmtPnum\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<button data-oper=\"possible\" class=\"btn btn-success\">제안하기</button>\n");
      out.write("\t\t\t<button data-oper=\"suggest\" class=\"btn btn-secondary\">뒤로가기</button><br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"storeId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suggestStore.storeId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"buserId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suggestStore.buserId }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</form>\n");
      out.write("\t\t<!-- Default Card Example -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t<!-- Basic Card Example -->\n");
      out.write("\t<!-- DataTales Example -->\n");
      out.write("\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("\tlet formObj = $(\"#operForm\");\n");
      out.write("\tlet userId = '");
      if (_jspx_meth_c_005fout_005f0(_jspx_page_context))
        return;
      out.write("';\n");
      out.write("\t\n");
      out.write("\t$(document).ready(function(){\n");
      out.write("\t\tconsole.log(userId);\n");
      out.write("\t\t$(\"button\").on(\"click\", function(e){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\te.preventDefault();\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tlet operation = $(this).data(\"oper\");\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tif(operation === 'possible'){\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tconsole.log(formObj.find(\"input[name='storeName']\").val());\n");
      out.write("\t\t\t\tformObj.find(\"input[name='storeName']\").remove();\n");
      out.write("\t\t\t\tformObj.submit();\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t}else if(operation === 'suggest'){\n");
      out.write("\t\t\t\tlocation.href=\"/dealight/admin/htdlmanage/suggest\";\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t})\t\t\n");
      out.write("\t});\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\"\n");
      out.write("        aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Ready to Leave?</h5>\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                        <span aria-hidden=\"true\">×</span>\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">Select \"Logout\" below if you are ready to end your current session.</div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancel</button>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"login.html\">Logout</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"/resources/bootstrap/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"/resources/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"/resources/bootstrap/vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"/resources/bootstrap/js/sb-admin-2.min.js\"></script>\n");
      out.write("\t<script src=\"/resources/bootstrap/vendor/datatables/jquery.dataTables.min.js\"></script>\n");
      out.write("\t<script src=\"/resources/bootstrap/vendor/datatables/dataTables.bootstrap4.min.js\"></script>\n");
      out.write("\t<script src=\"/resources/bootstrap/js/demo/datatables-demo.js\"></script>\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <!-- Page level custom scripts -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /WEB-INF/views/dealight/admin/htdlmanage/sugregister.jsp(65,15) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${suggestStore.buserId }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }
}
