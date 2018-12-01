package code.kliangh.behavioral.chainofresponsibility;

import code.kliangh.behavioral.chainofresponsibility.handler.RequestHandler;
import code.kliangh.behavioral.chainofresponsibility.model.Request;
import code.kliangh.behavioral.chainofresponsibility.model.Response;
import code.kliangh.behavioral.chainofresponsibility.service.HeaderProcessor;
import code.kliangh.behavioral.chainofresponsibility.service.ResponseProcessor;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class ChainOfResponsibilityTest {

    private HeaderProcessor headerProcessor;

    private ResponseProcessor responseProcessor;

    private Request request;

    private RequestHandler requestHandler;

    @Before
    public void setUp() {
        this.headerProcessor = new HeaderProcessor();
        this.responseProcessor = new ResponseProcessor();
        this.requestHandler = new RequestHandler();

        request = new Request();
        request.setHeaders(ImmutableMap.of("Accept", "application/json",
                                           "Content-Type", "application/json"));
        request.setRequestBody("{test request body}");
    }

    @Test
    public void badPractice() {
        Map<String, String> responseHeaders = headerProcessor.processHeader(request.getHeaders());
        String responseBody = responseProcessor.generateResponseBody(request.getRequestBody());

        Response response = new Response(responseHeaders, responseBody);
        Assert.assertEquals(request.getHeaders(), response.getResponseHeaders());
        Assert.assertEquals("Result: " + request.getRequestBody(), response.getResponseBody());
    }
}
