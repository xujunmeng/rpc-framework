package invoke;

import framework.ConsumerProxy;
import service.HelloService;

/**
 * @author james
 * @date 2020/3/4
 */
public class RpcConsumerMain {

    public static void main(String[] args) throws InterruptedException {
        HelloService service = ConsumerProxy.consumer(HelloService.class, "127.0.0.1", 8000);
        for (int i = 0; i < 1000; i++) {
            String hello = service.sayHello("尼尼尼吗_" + i);
            System.out.println(hello);
            Thread.sleep(1000);
        }
    }

}
