package io.github.niuz.gateway.outbound.okhttp;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.util.internal.StringUtil;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OkHttpOutboundHandler {
    private static Logger logger = LoggerFactory.getLogger(OkHttpOutboundHandler.class);

    private OkHttpClient okHttpClient;
    private String backendUrl;


    public OkHttpOutboundHandler(String backEndUrl) {
        this.backendUrl = backEndUrl;
        //this.backendUrl = backendUrl.endsWith("/") ? backendUrl.substring(0, backendUrl.length() - 1) : backendUrl;
    }

    public void handle(final FullHttpRequest fullRequest, final ChannelHandlerContext ctx) {
        final HttpHeaders header = fullRequest.headers();//获取Netty内置的请求头对象
        List<Map.Entry<String, String>> list = header.entries();
        final String url = this.backendUrl + fullRequest.uri();
        try {
//            final Request request = new Request.Builder()
//                    .url(url)
//                    .build();
            Request.Builder requestBuilder = new Request.Builder();
            list.forEach(x -> {
                requestBuilder.addHeader(x.getKey(), x.getValue());
            });
            final Request request = requestBuilder.url(url).build();

            final Call call = okHttpClient.newCall(request);
            Response response = call.execute();
            logger.info("请求响应结果{}", response.body().toString());
        } catch (IOException e) {
            logger.error("请求发生异常{}", e);
        }
    }
}
