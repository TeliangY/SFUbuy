package servlet;

import image.VerifyCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class VerifyCodeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        VerifyCode vc=new VerifyCode();
        BufferedImage image=vc.getImage();
        request.getSession().setAttribute("vCode",vc.getText());
        VerifyCode.output(image,response.getOutputStream());
    }
}
