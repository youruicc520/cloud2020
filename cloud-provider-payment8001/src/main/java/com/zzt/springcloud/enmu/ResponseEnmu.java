package com.zzt.springcloud.enmu;

/**
 * @author: Administrator
 * @date: 2021/06/04
 * @description: 响应码的枚举类
 */
public interface ResponseEnmu {
    enum Payment{
        SUCCESS(200,"成功"),
        FAILURE(444,"失败");
        Payment(int code,String message){
            this.code = code;
            this.message = message;
        }

        private final int code;
        private final String message;

        public int getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }
    }
}
