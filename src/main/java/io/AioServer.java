package io;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousServerSocketChannel;
import java.nio.channels.AsynchronousSocketChannel;
import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Created by Administrator on 2016/8/11.
 */
public class AioServer {

    private final int PORT = 8888;
    private AsynchronousServerSocketChannel server;

    public AioServer() throws IOException {
        server = AsynchronousServerSocketChannel.open().bind(new InetSocketAddress(PORT));
    }


    public static void main(String args[]) throws Exception {
        new AioServer().startWithCompletionHandler();
    }

    public void startWithFuture() throws InterruptedException,
            ExecutionException, TimeoutException {
        System.out.println("Server listen on " + PORT);
        Future<AsynchronousSocketChannel> future = server.accept();
        AsynchronousSocketChannel socket = future.get();
        ByteBuffer readBuf = ByteBuffer.allocate(1024);
        readBuf.clear();
        socket.read(readBuf).get(100, TimeUnit.SECONDS);
        readBuf.flip();
        System.out.printf("received message:" + new String(readBuf.array()));
        System.out.println(Thread.currentThread().getName());

    }

    public void startWithCompletionHandler() throws InterruptedException,
            ExecutionException, TimeoutException {
        System.out.println("Server listen on " + PORT);
        //ע���¼����¼���ɺ�Ĵ�����
        server.accept(null, new CompletionHandler<AsynchronousSocketChannel, Object>() {
            final ByteBuffer buffer = ByteBuffer.allocate(1024);
            @Override
            public void completed(AsynchronousSocketChannel result, Object attachment) {
                System.out.println(Thread.currentThread().getName());
                System.out.println("start");
                try {
                    buffer.clear();
                    result.read(buffer).get(100, TimeUnit.SECONDS);
                    buffer.flip();
                    System.out.println("received message: "
                            + new String(buffer.array()));
                } catch (Exception e) {
                    System.out.println(e.toString());
                } finally {

                    try {
                        result.close();
                        server.accept(null, this);
                    } catch (Exception e) {
                        System.out.println(e.toString());
                    }
                }

                System.out.println("end");
            }

            @Override
            public void failed(Throwable exc, Object attachment) {
                System.out.println("failed: " + exc);
            }
        });

        // ���̼߳����Լ�����Ϊ
        while (true) {
            System.out.println("main thread");
            Thread.sleep(1000);
        }

    }
}
