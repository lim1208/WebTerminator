package edu.scut.ibm.rmi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by limin on 2017/5/9.
 */
public class RmiClient {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:client.xml");
        PolarityService ps = (PolarityService) ctx.getBean("polarityService");
        String sentence = "我非常欣赏你。";
        String sentence2 = "我欣赏你";
        System.out.println(ps.polarity(sentence));
        System.out.println(ps.polarity(sentence2));
    }
}
