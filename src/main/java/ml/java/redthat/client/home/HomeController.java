package ml.java.redthat.client.home;

import ml.java.redthat.domain.api.DiscoveryBasicInfo;
import ml.java.redthat.domain.api.DiscoveryService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("")
public class HomeController extends HttpServlet {
    private DiscoveryService discoveryService = new DiscoveryService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<DiscoveryBasicInfo> discoveries = discoveryService.findAll();
        request.setAttribute("discoveries", discoveries);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
