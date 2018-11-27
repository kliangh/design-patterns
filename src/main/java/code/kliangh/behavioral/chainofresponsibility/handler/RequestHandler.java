package code.kliangh.behavioral.chainofresponsibility.handler;

import code.kliangh.behavioral.chainofresponsibility.service.HeaderProcessor;
import code.kliangh.behavioral.chainofresponsibility.service.ResponseProcessor;

public class RequestHandler {

    private HeaderProcessor headerProcessor;

    private ResponseProcessor responseProcessor;

    public RequestHandler() {
        this.headerProcessor = new HeaderProcessor();
        this.responseProcessor = new ResponseProcessor();
    }

    public static void processRequest() {

    }
}
