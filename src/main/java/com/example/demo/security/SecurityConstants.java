package com.example.demo.security;

public class SecurityConstants {
    public static final String SECRET = "TestSecret";
    public static final long EXPIRATION_TIME = 86400000;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/api/users";
    public static final String SIGN_UP_VALIDATE_URL = "/api/users/check/*";
    public static final String LOGIN_URL = "/login";
    public static final String SOCKET_URL = "/socket/**";
    public static final String SWAGGER_URL = "/swagger-ui.html";
    public static final String FILES_URL = "/api/files/**";
}
