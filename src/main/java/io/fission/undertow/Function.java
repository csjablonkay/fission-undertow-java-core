package io.fission.undertow;

import io.undertow.server.HttpServerExchange;

public interface Function
{
    void call(HttpServerExchange exchange);
}
