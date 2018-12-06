package code.kliangh.behavioral.chainofresponsibility.handler;

import code.kliangh.behavioral.chainofresponsibility.model.Request;
import code.kliangh.behavioral.chainofresponsibility.model.Response;
import code.kliangh.behavioral.chainofresponsibility.service.HeaderProcessor;
import code.kliangh.behavioral.chainofresponsibility.service.ResponseProcessor;

public class RequestHandler {

    private HeaderProcessor headerProcessor;

    private ResponseProcessor responseProcessor;

    public RequestHandler() {
        this.headerProcessor = new HeaderProcessor();
        this.responseProcessor = new ResponseProcessor();
    }

    public Response processRequest(Request request) {
        return new Response(headerProcessor.processHeader(request.getHeaders()),
                            responseProcessor.generateResponseBody(request.getRequestBody()));
    }
}
