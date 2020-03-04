package service;

/**
 * @author james
 * @date 2020/3/4
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String str) {
        return "hello, " + str;
    }
}
