package hello.container;

import jakarta.servlet.ServletContext;

public interface AppInit {
    // ServletContext == 서블릿 컨테이너 그 자체
    void onStartUp(ServletContext servletContext);

}
