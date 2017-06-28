package org.o7planning.redirect301;
 
import java.io.IOException;
import java.util.Map;
 
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebFilter("/*")
public class Redirect301Filter implements Filter {
 
   public Redirect301Filter() {
   }
 
   @Override
   public void destroy() {
   }
 
   @Override
   public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
           throws IOException, ServletException {
 
       HttpServletRequest request = (HttpServletRequest) req;
       HttpServletResponse response= (HttpServletResponse) resp;
 
       // Incomming URL.
       String url = request.getRequestURL().toString();
       System.out.println("Incomming URL = "+ url);
 
       Map<String, String> redirect301Map = DataUtils.getRedirect301Map();
 
       // Get new URL
       String newUrl = redirect301Map.get(url);
 
       if (newUrl != null) {
 
          
           // Redirect 301.
           response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
           response.setHeader("Location", newUrl );
           return;
       }
 
      
       chain.doFilter(req, resp);
   }
 
   @Override
   public void init(FilterConfig fConfig) throws ServletException {
   }
 
}