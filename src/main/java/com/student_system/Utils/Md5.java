package com.student_system.Utils;

import java.security.MessageDigest;

public class Md5 {
	//获取md5（32位）
	public String getMd5_32(String s){
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};       
        try {
            byte[] btInput = s.getBytes();
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            System.out.println(e);
            return "";
        }
    }

    //获取md5（16位）
    public String getMd5_16(String s){
        s=this.getMd5_32(s);
        if(s.length()==32){
            return s.substring(8, 24);
        }else{
            return "";
        }
    }
}

