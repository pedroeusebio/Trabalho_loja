/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.taghandlers;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyContent;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 *
 * @author pedroeusebio
 */
public class mvcbody extends BodyTagSupport {
    private String handler;
    private String pageName;

    /**
     * Creates new instance of tag handler
     */
    public mvcbody() {
        super();
    }

    ////////////////////////////////////////////////////////////////
    ///                                                          ///
    ///   User methods.                                          ///
    ///                                                          ///
    ///   Modify these methods to customize your tag handler.    ///
    ///                                                          ///
    ////////////////////////////////////////////////////////////////
    /**
     * Method called from doStartTag(). Fill in this method to perform other
     * operations from doStartTag().
     */
    private void otherDoStartTagOperations() {
        // TODO: code that performs other operations in doStartTag
        //       should be placed here.
        //       It will be called after initializing variables, 
        //       finding the parent, setting IDREFs, etc, and 
        //       before calling theBodyShouldBeEvaluated(). 
        //
        //       For example, to print something out to the JSP, use the following:
        //
           try {
               JspWriter out = pageContext.getOut();
//               out.println("<!DOCTYPE html>\n" +
//"<html>\n" +
//"    <head>\n" +
//"        <link rel=\"stylesheet\" type=\"text/css\" href=\"source/css/mystyle.css\">\n" +
//"        <title>Predo Zébio</title>\n" +
//"    </head>\n" +
//"    <body>\n" +
//"        <div id='container'>\n" +
//"            <form id='myForm' method=\"GET\" action=\"controlador\">\n" +
//"                <input id='inputid' type=\"hidden\" name=\"Controlador\" value=\""+handler+"\" />\n" +
//"                <div id='divtitle'>\n" +
//"                    <p id='title'>LOJA CANETAS BIC</p>\n" +
//"                </div>\n" +
//"                <div id='container-sidebar'>\n" +
//"                    <ul>\n" +
//"                        <li class='li1'><a href='index.jsp'><span>Products</span></a>\n" +
//"                            <ul>\n" +
//"                                <li id='p_link'><a href='controlador?Controlador=MVC.pagehandlers.index_Handler&PRODUTO=red'><span>Caneta Vermelha</span></a></li>\n" +
//"                                <li id='p_link'><a href='controlador?Controlador=MVC.pagehandlers.index_Handler&PRODUTO=blue'><span>Caneta Azul</span></a></li>\n" +
//"                                <li id='p_link'><a href='controlador?Controlador=MVC.pagehandlers.index_Handler&PRODUTO=black'><span>Caneta Preta</span></a></li>\n" +
//"                            </ul>\n" +
//"                        </li>\n" +
//"                        <li class='li1'><a href='#'><span>About</span></a></li>\n" +
//"                        <li class='li1'><a href='#'><span>Contact</span></a></li>\n" +
//"                    </ul>\n" +
//"                </div>");
               out.println("<!DOCTYPE html>\n" +
"<html xmlns=\"http://www.w3.org/1999/xhtml\">\n" +
"<head>\n" +
"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
"<title>Router Store</title>\n" +
"<link href=\"source/css/styles.css\" rel=\"stylesheet\" type=\"text/css\" />\n" +
"</head>\n" +
"<body>\n" +
"<div id=\"container\">\n" +
"    <form id='myForm' method=\"GET\" action=\"controlador\">\n" +
"        <input id='inputid' type=\"hidden\" name=\"Controlador\" value=\""+handler+"\" />\n" +
"    <div id=\"header\">\n" +
"        \n" +
"        <div class=\"menuContainer\">\n" +
"            <div class=\"menu\">\n" +
"                <ul>\n" +
"                    <li id=\"active\"><a href=\"index1.jsp\">HOME</a></li>\n" +
"                    <li><a href=\"products.jsp\">PRODUTOS</a></li>\n" +
"                    <li><a href=\"about.jsp\">SOBRE</a></li>\n" +
"                </ul>\n" +
"            </div>\n" +
             "<div class=\"clearfloat\"></div>"+
"            \n" +
"        </div>\n" +
"    </div>");
           } catch (IOException ex) {
              // do something
           }
    }

    /**
     * Method called from doEndTag() Fill in this method to perform other
     * operations from doEndTag().
     */
    private void otherDoEndTagOperations() {
        try {
               JspWriter out = pageContext.getOut();
//            out.println(" </form>\n" +
//"        </div>\n" +
//"    </body>\n" +
//"</html>");
              out.println("<footer class='footer'>"
                    + "<div id=\"footer\">\n"
                    + "		<p>\n"
                    + " <p class='text-muted'>Copyright &copy; 2015 Pedro Eusébio</p>       	"
                    + "        </p>\n"
                    + "	</div>\n"
                    + "</footer>"
                    + "    <!-- end #footer -->\n"
                    + "    </form>\n"
                    + "</div>\n"
                    + "<!-- end #container -->\n"
                    + "</body>\n"
                    + "</html>");
           } catch (IOException ex) {
              // do something
           }
    }

    /**
     * Fill in this method to process the body content of the tag. You only need
     * to do this if the tag's BodyContent property is set to "JSP" or
     * "tagdependent." If the tag's bodyContent is set to "empty," then this
     * method will not be called.
     */
    private void writeTagBodyContent(JspWriter out, BodyContent bodyContent) throws IOException {
        // TODO: insert code to write html before writing the body content.
        // e.g.:
        //
        // out.println("<strong>" + attribute_1 + "</strong>");
        // out.println("   <blockquote>");

        // write the body content (after processing by the JSP engine) on the output Writer
        bodyContent.writeOut(out);

        // Or else get the body content as a string and process it, e.g.:
        //     String bodyStr = bodyContent.getString();
        //     String result = yourProcessingMethod(bodyStr);
        //     out.println(result);
        // TODO: insert code to write html after writing the body content.
        // e.g.:
        //
        // out.println("   </blockquote>");
        // clear the body content for the next time through.
        bodyContent.clearBody();
    }

    ////////////////////////////////////////////////////////////////
    ///                                                          ///
    ///   Tag Handler interface methods.                         ///
    ///                                                          ///
    ///   Do not modify these methods; instead, modify the       ///
    ///   methods that they call.                                ///
    ///                                                          ///
    ////////////////////////////////////////////////////////////////
    /**
     * This method is called when the JSP engine encounters the start tag, after
     * the attributes are processed. Scripting variables (if any) have their
     * values set here.
     *
     * @return EVAL_BODY_BUFFERED if the JSP engine should evaluate the tag
     * body, otherwise return SKIP_BODY. This method is automatically generated.
     * Do not modify this method. Instead, modify the methods that this method
     * calls.
     */
    @Override
    public int doStartTag() throws JspException {
        otherDoStartTagOperations();
        
        if (theBodyShouldBeEvaluated()) {
            return EVAL_BODY_BUFFERED;
        } else {
            return SKIP_BODY;
        }
    }

    /**
     * This method is called after the JSP engine finished processing the tag.
     *
     * @return EVAL_PAGE if the JSP engine should continue evaluating the JSP
     * page, otherwise return SKIP_PAGE. This method is automatically generated.
     * Do not modify this method. Instead, modify the methods that this method
     * calls.
     */
    @Override
    public int doEndTag() throws JspException {
        otherDoEndTagOperations();
        
        if (shouldEvaluateRestOfPageAfterEndTag()) {
            return EVAL_PAGE;
        } else {
            return SKIP_PAGE;
        }
    }

    /**
     * This method is called after the JSP engine processes the body content of
     * the tag.
     *
     * @return EVAL_BODY_AGAIN if the JSP engine should evaluate the tag body
     * again, otherwise return SKIP_BODY. This method is automatically
     * generated. Do not modify this method. Instead, modify the methods that
     * this method calls.
     */
    @Override
    public int doAfterBody() throws JspException {
        try {
            // This code is generated for tags whose bodyContent is "JSP"
            BodyContent bodyCont = getBodyContent();
            JspWriter out = bodyCont.getEnclosingWriter();
            
            writeTagBodyContent(out, bodyCont);
        } catch (Exception ex) {
            handleBodyContentException(ex);
        }
        
        if (theBodyShouldBeEvaluatedAgain()) {
            return EVAL_BODY_AGAIN;
        } else {
            return SKIP_BODY;
        }
    }

    /**
     * Handles exception from processing the body content.
     */
    private void handleBodyContentException(Exception ex) throws JspException {
        // Since the doAfterBody method is guarded, place exception handing code here.
        throw new JspException("Error in mvcbody tag", ex);
    }

    /**
     * Fill in this method to determine if the rest of the JSP page should be
     * generated after this tag is finished. Called from doEndTag().
     */
    private boolean shouldEvaluateRestOfPageAfterEndTag() {
        // TODO: code that determines whether the rest of the page
        //       should be evaluated after the tag is processed
        //       should be placed here.
        //       Called from the doEndTag() method.
        //
        return true;
    }

    /**
     * Fill in this method to determine if the tag body should be evaluated
     * again after evaluating the body. Use this method to create an iterating
     * tag. Called from doAfterBody().
     */
    private boolean theBodyShouldBeEvaluatedAgain() {
        // TODO: code that determines whether the tag body should be
        //       evaluated again after processing the tag
        //       should be placed here.
        //       You can use this method to create iterating tags.
        //       Called from the doAfterBody() method.
        //
        return false;
    }

    private boolean theBodyShouldBeEvaluated() {
        // TODO: code that determines whether the body should be
        //       evaluated should be placed here.
        //       Called from the doStartTag() method.
        return true;
    }

    public void setHandler(String handler) {
        this.handler = handler;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }
    
}
