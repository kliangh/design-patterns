package code.kliangh.behavioral.chainofresponsibility.service;

public class BusinessService {

    static String gerResult(String requestBody) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Result: ");
        stringBuilder.append(requestBody);

        return stringBuilder.toString();
    }
}
