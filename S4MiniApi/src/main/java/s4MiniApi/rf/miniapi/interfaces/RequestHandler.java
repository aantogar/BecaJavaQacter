package s4MiniApi.rf.miniapi.interfaces;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public interface RequestHandler {

    public abstract String handleRequest(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException;

}