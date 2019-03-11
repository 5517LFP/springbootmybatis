package com.example.controller;



import com.sun.deploy.net.HttpUtils;
import io.netty.handler.codec.http.HttpUtil;
import org.springframework.util.StreamUtils;
import sun.net.www.http.HttpClient;

import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;

public class testTUling {

    public void test2(){
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put("info","水瓶座");
        map.put("key","7b8add97f53140d082cb1e2fab8e19c5");

    }
    public void testone(){
        //设置连接地址
        try {
            URL url = new URL("http://www.tuling123.com/openapi/api");

            //开启连接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //设置传输格斯
            conn.setRequestMethod("POST");
            //甚至输出参数
            conn.setDoInput(true);
            conn.setDoOutput(true);
            //拼接参数
            //案例 http://www.tuling123.com/openapi/api?key=7b8add97f53140d082cb1e2fab8e19c5&info=魔方
            StringBuilder str = new StringBuilder();


            str.append("info=").append("你是男是女");
            str.append("&key=").append("7b8add97f53140d082cb1e2fab8e19c5");
            System.out.println(str);
            //写出参数
            conn.connect();
            conn.getOutputStream().write(str.toString().getBytes("UTF-8"));

            String respStr = StreamUtils.copyToString(conn.getInputStream(), Charset.forName("UTF-8"));
            System.out.println(respStr);
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
