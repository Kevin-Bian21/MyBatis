package com.bian.Utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author Kevin
 * @Data 2021/4/21
 */
public class IdUtils {
    public static String getId(){
        return UUID.randomUUID().toString().replace("-","");
    }
    @Test
    public void test(){
        System.out.println(IdUtils.getId());
    }
}
