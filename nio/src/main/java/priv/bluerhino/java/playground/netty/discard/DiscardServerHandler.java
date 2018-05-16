package priv.bluerhino.java.playground.netty.discard;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * Created by niekunlin @ 18/5/15.
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        final ByteBuf time = ctx.alloc().buffer(1024000); // (2)
        time.writeBytes(new byte[1024000]);

        final ChannelFuture f = ctx.writeAndFlush(time); // (3)
        System.out.println(Thread.currentThread());
        f.addListener((ChannelFutureListener) future -> {
            assert f == future;
            System.out.println(Thread.currentThread());
            ctx.close();
        });
        System.out.println(1);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
    }
}
