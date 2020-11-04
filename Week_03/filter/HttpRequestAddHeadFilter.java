package io.github.niuz.gateway.filter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpRequestAddHeadFilter implements HttpRequestFilter {
    private static Logger logger = LoggerFactory.getLogger(HttpRequestAddHeadFilter.class);

    @Override
    public void filter(FullHttpRequest fullRequest, ChannelHandlerContext ctx) {
        try {
            fullRequest.headers().set("nio", "niuzhen");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
