package com.example.args;
import com.beust.jcommander.Parameter;

public class CgiArgs {

    @Parameter(names = {"-content-type"})
    private String contentType;

    @Parameter(names = {"-method","method"})
    private String method;

    @Parameter(names ={"-query-string"} )
    private String queryString;

    @Parameter(names = {"-server-name"})
    private String serverName;

    @Parameter(names = {"-server-port"})
    private String port;

    @Parameter(names = {"-path"})
    private String path;

    @Parameter(names = {"-body"})
    private String body;

    public String getContentType() {
        return contentType;
    }

    public String getMethod() {
        return method;
    }

    public String getQueryString() {
        return queryString;
    }

    public String getServerName() {
        return serverName;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getBody() {
        return body;
    }
}
