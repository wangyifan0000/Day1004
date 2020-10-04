package com.kgc.tcmp077.wangyf.Test;


import com.kgc.tcmp077.wangyf.service.AssetsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.Context;

/**
 * @author wangyf
 * @create 2020-10-04 10:00
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext  applicationContext=new ClassPathXmlApplicationContext("applicationContext-MyBatis.xml");
        AssetsService assetsService = (AssetsService)applicationContext.getBean("assetsservice");
        System.out.println(assetsService.getAssetsList(null,null).size());
    }
}
