package ml.java.redthat.client.category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import ml.java.redthat.domain.Category.Category;
import ml.java.redthat.domain.api.CategoryFullInfo;
import ml.java.redthat.domain.api.CategoryService;
import ml.java.redthat.domain.api.DiscoveryBasicInfo;
import ml.java.redthat.domain.api.DiscoveryService;

import java.io.IOException;
import java.util.List;

@WebServlet("/category")
public class CategoryController extends HttpServlet {
    private final CategoryService categoryService = new CategoryService();
    private final DiscoveryService discoveryService = new DiscoveryService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int categoryId = Integer.parseInt(request.getParameter("id"));
        CategoryFullInfo category = categoryService.findById(categoryId)
                .orElseThrow();
        request.setAttribute("category",category);
        List<DiscoveryBasicInfo> discovery =discoveryService.findByCategory(categoryId);
        request.setAttribute("discoveries", discovery);
        request.getRequestDispatcher("/category.jsp").forward(request, response);
    }
}


