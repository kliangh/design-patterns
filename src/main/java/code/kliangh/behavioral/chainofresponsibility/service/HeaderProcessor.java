package code.kliangh.behavioral.chainofresponsibility.service;

import java.util.Map;
import java.util.stream.Collectors;

public class HeaderProcessor {

    public Map<String, String> processHeader(Map<String, String> requestHeader) {
        return requestHeader.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,
                                                                          e -> e.getValue()
                                                                                .toString()));
    }
}
