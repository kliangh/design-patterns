package code.kliangh.behavioral.chainofresponsibility.service;

public class ResponseProcessor {

    public String generateResponseBody(String requestBody) {
        return BusinessService.gerResult(requestBody);
    }
}
