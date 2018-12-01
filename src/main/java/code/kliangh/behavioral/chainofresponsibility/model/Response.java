package code.kliangh.behavioral.chainofresponsibility.model;

import java.io.Serializable;
import java.util.Map;

public class Response implements Serializable {
    private static final long serialVersionUID = 7125046036846972473L;

    public Response(Map<String, String> responseHeaders, String responseBody) {
        this.responseHeaders = responseHeaders;
        this.responseBody = responseBody;
    }

    private Map<String, String> responseHeaders;

    private String responseBody;

    public Map<String, String> getResponseHeaders() {
        return responseHeaders;
    }

    public String getResponseBody() {
        return responseBody;
    }
}
