package com.carzen.consultaplacas.config.jwt;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carzen.consultaplacas.dto.Response;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -7858869558953243875L;

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {

        Response resp = new Response("UNAUTHORIZED",
                "voce nao tem acesso a essa funcionalidade ou funcao",
                "ERROR");

        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.getWriter().write(resp.toJson());
        response.getWriter().flush();
    }
}
