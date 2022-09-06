package io.github.gonalez.znpcs.http;

import io.github.gonalez.znpcs.http.internal.DefaultHttpRequest;

import java.net.URI;

/**
 * @author Gaston Gonzalez {@literal <znetworkw.dev@gmail.com>}
 */
public interface HttpRequest {
    static HttpRequest of(
        URI uri, HttpMethod method,
        String body, int timeout) {
        return new DefaultHttpRequest(uri, method, body, timeout);
    }

    URI uri();
    HttpMethod method();
    String body();
    int timeout();
}
