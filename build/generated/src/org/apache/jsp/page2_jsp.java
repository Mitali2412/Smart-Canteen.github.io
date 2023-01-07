package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class page2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" >\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Menu-Card</title>\n");
      out.write("  <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css'>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Amatic+SC\"><style>\n");
      out.write("  @import url(\"https://fonts.googleapis.com/css2?family=Lora&display=swap\");\n");
      out.write("@import url(\"https://fonts.googleapis.com/css2?family=EB+Garamond&display=swap\");\n");
      out.write("* {\n");
      out.write("  margin: 0;\n");
      out.write("  box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".instruction, .book {\n");
      out.write("  position: absolute;\n");
      out.write("  top: 50%;\n");
      out.write("  left: 50%;\n");
      out.write("  transform: translate(-50%, -50%);\n");
      out.write("}\n");
      out.write("\n");
      out.write("body {\n");
      out.write("  width: 100%;\n");
      out.write("  height: 90vh;\n");
      out.write("  min-width: 900px;\n");
      out.write("  min-height: 700px;\n");
      out.write("  background-image: linear-gradient(135deg,#5961f9ad 10%, #5961f9ad 100%);\n");
      out.write("  color: beige;\n");
      out.write(" background-image: url(\"b4.jpg\");\n");
      out.write("  height: 100%;\n");
      out.write("  background-position: center;\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size: cover;\n");
      out.write("background-size:;\n");
      out.write("\n");
      out.write("  position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".book {\n");
      out.write("  width: 847px;\n");
      out.write("  height: 654.5px;\n");
      out.write("  transform: translate(-50%, -50%) rotatex(10deg) rotatey(-10deg);\n");
      out.write("  transform-style: preserve-3d;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page {\n");
      out.write("  width: 423.5px;\n");
      out.write("  height: 654.5px;\n");
      out.write("  background: #eee;\n");
      out.write("  position: absolute;\n");
      out.write("  top: 0;\n");
      out.write("  right: 0;\n");
      out.write("  transition: transform 1s;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(1) {\n");
      out.write("  padding: 5% 4% 4% 5%;\n");
      out.write("  transform-origin: 0% 50%;\n");
      out.write("  transform: translatez(-1px);\n");
      out.write("  background-image: url(\"c.jpg\");\n");
      out.write("  background-size:cover;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(1) {\n");
      out.write("  transform: translatez(1px) rotatey(-180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(2) {\n");
      out.write("  padding: 3% 5% 4% 4%;\n");
      out.write("  transform-origin: 100% 50%;\n");
      out.write("  transform: translatez(-2px) scalex(-1) translatex(100%);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(2) {\n");
      out.write("  transform: translatez(2px) scalex(-1) translatex(100%) rotatey(180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(3) {\n");
      out.write("  padding: 5% 4% 4% 5%;\n");
      out.write("  transform-origin: 0% 50%;\n");
      out.write("  transform: translatez(-3px);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(3) {\n");
      out.write("  transform: translatez(3px) rotatey(-180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(4) {\n");
      out.write("  padding: 5% 5% 4% 4%;\n");
      out.write("  transform-origin: 100% 50%;\n");
      out.write("  transform: translatez(-4px) scalex(-1) translatex(100%);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(4) {\n");
      out.write("  transform: translatez(4px) scalex(-1) translatex(100%) rotatey(180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(5) {\n");
      out.write("  padding: 5% 4% 4% 5%;\n");
      out.write("  transform-origin: 0% 50%;\n");
      out.write("  transform: translatez(-5px);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(5) {\n");
      out.write("  transform: translatez(5px) rotatey(-180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(6) {\n");
      out.write("  padding: 5% 5% 4% 4%;\n");
      out.write("  transform-origin: 100% 50%;\n");
      out.write("  transform: translatez(-6px) scalex(-1) translatex(100%);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(6) {\n");
      out.write("  transform: translatez(6px) scalex(-1) translatex(100%) rotatey(180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(7) {\n");
      out.write("  padding: 5% 4% 4% 5%;\n");
      out.write("  transform-origin: 0% 50%;\n");
      out.write("  transform: translatez(-7px);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(7) {\n");
      out.write("  transform: translatez(7px) rotatey(-180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(8) {\n");
      out.write("  padding: 5% 5% 4% 4%;\n");
      out.write("  transform-origin: 100% 50%;\n");
      out.write("  transform: translatez(-8px) scalex(-1) translatex(100%);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(8) {\n");
      out.write("  transform: translatez(8px) scalex(-1) translatex(100%) rotatey(180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(9) {\n");
      out.write("  padding: 5% 4% 4% 5%;\n");
      out.write("  transform-origin: 0% 50%;\n");
      out.write("  transform: translatez(-9px);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(9) {\n");
      out.write("  transform: translatez(9px) rotatey(-180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(10) {\n");
      out.write("  padding: 5% 5% 4% 4%;\n");
      out.write("  transform-origin: 100% 50%;\n");
      out.write("  transform: translatez(-10px) scalex(-1) translatex(100%);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;}\n");
      out.write("\n");
      out.write(".left-side:nth-child(10) {\n");
      out.write("  transform: translatez(10px) scalex(-1) translatex(100%) rotatey(180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(11) {\n");
      out.write("  padding: 5% 4% 4% 5%;\n");
      out.write("  transform-origin: 0% 50%;\n");
      out.write("  transform: translatez(-11px);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(11) {\n");
      out.write("  transform: translatez(11px) rotatey(-180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(12) {\n");
      out.write("  padding: 5% 5% 4% 4%;\n");
      out.write("  transform-origin: 100% 50%;\n");
      out.write("  transform: translatez(-12px) scalex(-1) translatex(100%);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(100) {\n");
      out.write("  padding: 3% 5% 4% 4%;\n");
      out.write("  transform-origin: 100% 50%;\n");
      out.write("  transform: translatez(-100px) scalex(-1) translatex(100%);\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("  background-size: contain;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".left-side:nth-child(100) {\n");
      out.write("  transform: translatez(100px) scalex(-1) translatex(100%) rotatey(180deg);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".cover-front:nth-child(1) {\n");
      out.write("  text-align: center;\n");
      out.write("  background-image: url(\"c.jpg\");\n");
      out.write("  background-repeat: no-repeat;\n");
      out.write("  background-size:cover;\n");
      out.write("}\n");
      out.write(".cover-front:nth-child(1) h1 {\n");
      out.write(" font-family: \"Amatic SC\", sans-serif;\n");
      out.write("  font-size: 90px;\n");
      out.write("  color: whitesmoke;\n");
      out.write("  margin-top: 150px;\n");
      out.write("  text-transform: uppercase;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table {\n");
      out.write("  margin-bottom: 4%;\n");
      out.write("  font-family: \"Amatic SC\", sans-serif;\n");
      out.write("  font-size: 23px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".page:nth-child(3) p:first-of-type:first-letter {\n");
      out.write("  font-size: 32px;\n");
      out.write("  background-image: url(\"menu.jpg\");\n");
      out.write("}\n");
      out.write("\n");
      out.write(".instruction {\n");
      out.write(" \n");
      out.write("  font-size: 26px;\n");
      out.write("  font-family: \"EB Garamond\", serif;\n");
      out.write("  color: whitesmoke;\n");
      out.write("  background: #fff7;\n");
      out.write("  border-radius: 15px;\n");
      out.write("  padding: 10px 15px;\n");
      out.write("}\n");
      out.write(".ab button{\n");
      out.write("    margin-top: 25%;\n");
      out.write("    color:black;\n");
      out.write("  font-size: 20px;\n");
      out.write("  float:right;\n");
      out.write("  padding: 12px 25px;\n");
      out.write("  border-radius: 50px;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 0;\n");
      out.write("  outline: 0;\n");
      out.write("  background-color:orange;\n");
      out.write("  background-attachment: fixed;\n");
      out.write("  padding-left: 40px;\n");
      out.write("  margin-left: 150px ;\n");
      out.write("}\n");
      out.write(".bc {\n");
      out.write("\n");
      out.write("    color:black;\n");
      out.write("  font-size: 20px;\n");
      out.write(" \n");
      out.write("  padding: 12px 25px;\n");
      out.write("  border-radius: 50px;\n");
      out.write("  display: inline-block;\n");
      out.write("  border: 0;\n");
      out.write("  outline: 0;\n");
      out.write("  background-color:orange;\n");
      out.write("  background-attachment: fixed;\n");
      out.write("  padding-left: 40px;\n");
      out.write("  margin-left: 10px ;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- partial:index.partial.html -->\n");
      out.write("\n");
      out.write("<div class=\"book\">\n");
      out.write("  <div class=\"page cover-front\" onclick=\"movePage(this, 1)\">\n");
      out.write("    <div class=\"instruction\">Flip the page</div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <div class=\"page cover-front\" onclick=\"movePage(this, 2)\">\n");
      out.write("  <table>\n");
      out.write("<tr>\n");
      out.write("    <td> <br><img src=\"i1.jpg\" width=\"350\" margin-top=\"100 px\"> </td>\n");
      out.write("<td>  </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td><br> <img src=\"i3.jpg\" width=\"350\" > </td>\n");
      out.write("<td> </td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("  <div class=\"page text-page\" onclick=\"movePage(this, 3)\">\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td><h1 style=\"color:orange\" align=\"center\" >Sandwich</h1></td></tr>\n");
      out.write("    <tr>\n");
      out.write("        <tr>\n");
      out.write("          <td> Bombay Veg Sandwich. </td>\n");
      out.write("          <td>Rs.50</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Aloo Grilled Sandwich.  </td>\n");
      out.write("            <td>Rs.60</td>\n");
      out.write("          </tr>\n");
      out.write("            <tr> \n");
      out.write("                <td>  Paneer Bhurji Sandwich. </td>\n");
      out.write("                <td>Rs.80</td>\n");
      out.write("              </tr><tr>\n");
      out.write("                <td> Mixed Vegetable Sandwich. </td>\n");
      out.write("                <td>Rs.80</td>\n");
      out.write("              </tr><tr>\n");
      out.write("                <td>Corn Cheese Sandwich. </td>\n");
      out.write("                <td>Rs.90</td>\n");
      out.write("              </tr><tr>\n");
      out.write("                <td> Mushroom Sandwich.  </td>\n");
      out.write("                <td>Rs.100</td>\n");
      out.write("              </tr>\n");
      out.write("      </table>\n");
      out.write("      <table>\n");
      out.write("        <tr>\n");
      out.write("            <td><h1 style=\"color:orange\" align=\"center\" >Pizza</h1></td></tr>\n");
      out.write("    <tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> Capsicum Pizza</td>\n");
      out.write("                <td>Rs.90</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td>Corn Cheese Pizza. </td>\n");
      out.write("                <td>Rs.100</td>\n");
      out.write("              </tr><tr>\n");
      out.write("                <td> Cheese n Tomato Pizza ·   </td>\n");
      out.write("                <td>Rs.100</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td> Cheesy Pizza.  </td>\n");
      out.write("                <td>Rs.100</td>\n");
      out.write("              </tr>\n");
      out.write("                <tr> \n");
      out.write("                    <td>  Paneer & Onion Pizza </td>\n");
      out.write("                    <td>Rs.110</td>\n");
      out.write("                  </tr>\n");
      out.write("           \n");
      out.write("         \n");
      out.write("          \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("  <div class=\"page text-page\" onclick=\"movePage(this, 4)\"> \n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td><h1 style=\"color:orange\" align=\"center\" >South-Indian Food</h1></td></tr>\n");
      out.write("        <tr>\n");
      out.write("          <td> Idli-Sambhar </td>\n");
      out.write("          <td>Rs.50</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Sambhar Vada  </td>\n");
      out.write("            <td>Rs.50</td>\n");
      out.write("          </tr>\n");
      out.write("            <tr> \n");
      out.write("                <td>  Masala Dosa  </td>\n");
      out.write("                <td>Rs.100</td>\n");
      out.write("              </tr><tr>\n");
      out.write("                <td> Paneer Masala Dosa </td>\n");
      out.write("                <td>Rs.110</td>\n");
      out.write("              </tr><tr>\n");
      out.write("                <td>Rawa Dosa </td>\n");
      out.write("                <td>Rs.120</td>\n");
      out.write("              </tr><tr>\n");
      out.write("                <td> Onion Uttapam  </td>\n");
      out.write("                <td>Rs.100</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <td> Tomato Uttapam  </td>\n");
      out.write("                <td>Rs.100</td>\n");
      out.write("              </tr> <tr>\n");
      out.write("                <td> Sambhar Rice\t </td>\n");
      out.write("                <td>Rs.120</td>\n");
      out.write("              </tr>\n");
      out.write("      </table> \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("  <div class=\"page text-page \" onclick=\"movePage(this, 5)\">\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <td><h1 style=\"color:orange\" align=\"center\">Chineese</h1></td></tr>\n");
      out.write("    <tr>\n");
      out.write("      <td>Veg Hakka Noodles </td>\n");
      out.write("      <td>Rs.70</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>Chilli Garlic Noodles </td>\n");
      out.write("        <td>Rs.90</td>\n");
      out.write("      </tr>\n");
      out.write("        <tr> \n");
      out.write("            <td> Veg. Fried Rice </td>\n");
      out.write("            <td>Rs.90</td>\n");
      out.write("          </tr><tr>\n");
      out.write("            <td> Manchurian (Gravy) </td>\n");
      out.write("            <td>Rs.100</td>\n");
      out.write("          </tr><tr>\n");
      out.write("            <td>Veg Chopsouey</td>\n");
      out.write("            <td>Rs.100</td>\n");
      out.write("          </tr><tr>\n");
      out.write("            <td> Spring Roll </td>\n");
      out.write("            <td>Rs.110</td>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td> Chilly Paneer Dry  </td>\n");
      out.write("            <td>Rs.100</td>\n");
      out.write("          </tr> \n");
      out.write("  </table> \n");
      out.write("  <table>\n");
      out.write("    <tr>\n");
      out.write("        <td><h1 style=\"color:orange\" align=\"center\">Pasta</h1></td></tr>\n");
      out.write("<tr>\n");
      out.write("  <td>White sauce pasta</td>\n");
      out.write("  <td>Rs.130</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("    <td>Red sauce pasta  </td>\n");
      out.write("    <td>Rs.120</td>\n");
      out.write("  </tr><tr>\n");
      out.write("    <td>Pink sauce pasta</td>\n");
      out.write("    <td>Rs.140</td>\n");
      out.write("  </tr>\n");
      out.write("</table> \n");
      out.write("  </div>\n");
      out.write("  <div class=\"page text-page\" onclick=\"movePage(this, 6)\"></div>\n");
      out.write(" \n");
      out.write("</div><div class='ab'>\n");
      out.write("    <a href='page3.jsp'><button > Continue Ordering</button></a></div>\n");
      out.write("    <div class='bc'>\n");
      out.write("<a href='page5.jsp'> HAVE A LOOK AT OUR TOP 3 DISHES</a>\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    let currentPage = 1;\n");
      out.write("\n");
      out.write("function toggleClass(e, toggleClassName) {\n");
      out.write("  if(e.className.includes(toggleClassName)) {\n");
      out.write("    e.className = e.className.replace(' ' + toggleClassName, '');\n");
      out.write("  } else {\n");
      out.write("    e.className += ' ' + toggleClassName;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function movePage(e, page) {\n");
      out.write("  if (page == currentPage) {\n");
      out.write("    currentPage+=2;\n");
      out.write("    toggleClass(e, \"left-side\");\n");
      out.write("    toggleClass(e.nextElementSibling, \"left-side\");\n");
      out.write("    \n");
      out.write("  }\n");
      out.write("  else if (page = currentPage - 1) {\n");
      out.write("    currentPage-=2;\n");
      out.write("    toggleClass(e, \"left-side\");\n");
      out.write("    toggleClass(e.previousElementSibling, \"left-side\");\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}