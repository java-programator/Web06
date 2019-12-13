package pl.altkom.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ErrorServlet2 extends HttpServlet {
    @Override
    public void service(HttpServletRequest request,
                        HttpServletResponse response)
            throws IOException {
        response.sendError(404);
    }
}
