package invoke;

import framework.ProviderReflect;
import service.HelloService;
import service.HelloServiceImpl;

/**
 * @author james
 * @date 2020/3/4
 */
public class RpcProviderMain {

    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        ProviderReflect.provider(service, 8000);
    }

}
