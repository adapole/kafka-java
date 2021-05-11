package com.okta.javakafka.kafkajava;

import com.google.appengine.api.utils.SystemProperty;
import java.io.IOException;
import java.util.Properties;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// With @WebServlet annotation the webapp/WEB-INF/web.xml is no longer required.
@WebServlet(name = "CheckKafkaLink", value = "/kafka")
public class CheckKafkaLink extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Properties properties = System.getProperties();

        response.setContentType("application/json");//
        response.getWriter().println("Check App Engine - Standard kafka "
                + SystemProperty.version.get() + " Java "
                + properties.get("java.specification.version"));
    }

    public static String getInfo() {
        return "Version: " + System.getProperty("java.version")
                + " OS: " + System.getProperty("os.name")
                + " User: " + System.getProperty("user.name");
    }
}
