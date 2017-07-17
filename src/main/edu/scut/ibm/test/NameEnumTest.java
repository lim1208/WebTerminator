package edu.scut.ibm.test;

/**
 * Created by limin on 2017/7/12.
 */
public class NameEnumTest {

    public String result(NameEnum type){
        if(type.getType().equals("liuhexiang")){
            return "123,456,789";
        }
        return null;
    }

    public static void main(String[] args) {
        NameEnumTest test = new NameEnumTest();
        String result = test.result(NameEnum.LIU);
        System.out.println(NameEnum.LIU.getSplit());
        System.out.println(result.split(NameEnum.LIU.getSplit()).length);
    }
}
