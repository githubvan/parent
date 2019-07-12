package com.van.euerkaserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer  /*开启euerka服务端*/
public class EuerkaServerApplication {
    public static void main(String[] args) {
       /* SpringApplication.run(EuerkaServerApplication.class, args);
        new SpringApplicationBuilder(EuerkaServerApplication.class).web(true).run(args);*/
       String a= "123";
        System.out.println(a.length());


        //int abcabcbb = lengthOfLongestSubstring("qwerr");
        //System.out.println(abcabcbb);
    }

    public static int lengthOfLongestSubstring2(String s) {
        char[] chars = s.toCharArray();
        int big = 0;
        for (int i = 0; i < chars.length; i++) {
            StringBuilder sb = new StringBuilder("");
            if (chars.length == 1) {
                return big = 1;
            }
            for (int k = i + 1; k < chars.length; k++) {
                sb.append(chars[k]);
                if (sb.toString().contains(chars[i] + "")) {
                    if ((k - i) > big) {
                        big = k - i;
                    }
                    break;
                }
                if (k == chars.length - 1) {
                    if (k - i > big) {
                        big = k - i;
                    }
                }
            }
        }
        return big;
    }

    public static int lengthOfLongestSubstring(String s) {
        int big = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            if (s.toCharArray().length == 1) {
                return 1;
            }
            String orgin;
            orgin = s.toCharArray()[i] + "";
            String substring1 = s.substring(i, s.length());
            if (substring1.length()<big){
                return  big;
            }
            for (int k = i + 1; k < s.toCharArray().length; k++) {
                String substring = s.substring(k, k + 1);
                if (orgin.contains(substring)) {
                    int newbig = orgin.toCharArray().length;
                    if (newbig > big) {
                        big = newbig;
                    }
                    break;
                }
                orgin = orgin + substring;
                if (k == s.toCharArray().length - 1) {
                    if (orgin.toCharArray().length > big) {
                        big = orgin.toCharArray().length ;
                    }
                }
            }

        }
        return big;
    }
}
