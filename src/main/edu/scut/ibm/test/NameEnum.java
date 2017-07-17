package edu.scut.ibm.test;

/**
 * Created by limin on 2017/7/12.
 */
public enum NameEnum {
    WANG("wangzenan"),
    LIU("liuhexiang", Constants.DEFAULT_SPLIT);

    private final String type;
    private final String split;


    NameEnum(String type){
        this(type, null);
    }

    NameEnum(String type, String split){
        this.type = type;
        this.split = split;
    }

    public String getType(){
        return type;
    }

    public String getSplit(){
        return split;
    }

    private static class Constants{
        public static final String DEFAULT_SPLIT="[\\s;,]+";
        private Constants(){

        }
    }
}
