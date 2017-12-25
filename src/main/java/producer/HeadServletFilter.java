package producer;

/**
 * Created by PWi on 21.04.2017.
 */
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 */
public class HeadServletFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException { }


    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        if(!httpRequest.getMethod().equalsIgnoreCase("OPTIONS")){
            filterChain.doFilter(request, response);
        }
    }

    public void destroy() { }
}