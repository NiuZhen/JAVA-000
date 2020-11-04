package io.github.niuz.gateway.inbound;


import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;

public class HttpInboundInitializer extends ChannelInitializer<SocketChannel> {
	
	private String proxyServer;

	public HttpInboundInitializer(String proxyServer) {
		this.proxyServer = proxyServer;
	}
	
	@Override
	public void initChannel(SocketChannel ch) {
		try {
			ChannelPipeline p = ch.pipeline();//加处理器
//		if (sslCtx != null) {
//			p.addLast(sslCtx.newHandler(ch.alloc()));
//		}
			p.addLast(new HttpServerCodec());//编码器
			//p.addLast(new HttpServerExpectContinueHandler());
			p.addLast(new HttpObjectAggregator(1024 * 1024));
			p.addLast(new HttpInboundHandler(this.proxyServer));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
