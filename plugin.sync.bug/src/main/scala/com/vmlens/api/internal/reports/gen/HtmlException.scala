/* NOTE this file is autogenerated by Scalate : see http://scalate.fusesource.org/ */
package templates

import _root_.scala.collection.JavaConversions._
import _root_.org.fusesource.scalate.support.TemplateConversions._
import _root_.org.fusesource.scalate.util.Measurements._

object $_scalate_$htmlException_mustache {
  def $_scalate_$render($_scalate_$_context: _root_.org.fusesource.scalate.RenderContext): Unit = {
    ;{
      val context: _root_.org.fusesource.scalate.RenderContext = $_scalate_$_context.attribute("context")
      import context._
      
      
      import _root_.org.fusesource.scalate.mustache._
      
      val $_scope_1 = Scope($_scalate_$_context)
      $_scope_1.partial("header")
      $_scalate_$_context << ( "\n\n\n<div class=\"" )
      $_scope_1.renderVariable("containerTyp", false)
      $_scalate_$_context << ( "\">\n \n" )
      $_scope_1.section("issues") { $_scope_2 =>
        $_scalate_$_context << ( "<div class=\"row text-center\" style=\"padding-bottom:50px;\">\n  \n" )
        $_scope_2.renderVariable("message", false)
        $_scalate_$_context << ( "\n    \n     \n </div>\n\n\n" )
        $_scope_2.section("trace") { $_scope_3 =>
          $_scalate_$_context << ( "<div class=\"row text-left\">\n  \n" )
          $_scope_3.renderVariable("name", false)
          $_scalate_$_context << ( "\n    \n     \n </div>\n \n \n " )
        }
      }
      $_scalate_$_context << ( "</div>\n\n\n\n\n" )
      $_scope_1.partial("footer")
    }
  }
}


class $_scalate_$htmlException_mustache extends _root_.org.fusesource.scalate.Template {
  def render(context: _root_.org.fusesource.scalate.RenderContext): Unit = $_scalate_$htmlException_mustache.$_scalate_$render(context)
}