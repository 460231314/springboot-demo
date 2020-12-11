package com.example.springboot.demo.utils;


/**
 * @author ：yuanrp
 * @description：TODO
 * @date ：2020/12/10 2:42 下午
 */
public class RedisKeyUtils {
    private static final String KEY_HEAD = "MLS_SYS";
    private static final String LOCK = "LOCK:";
    private static final String SEPARATOR = ":";

    public static final String MD5 = "MD5";
    public static final String BEGIN_DATE = "BEGIN_DATE";
    public static final String FILE_NAME = "FILE_NAME";

    public static final String SLICE_SIZE = "SLICE_SIZE";
    public static final String TOTAL_SIZE = "TOTAL_SIZE";

    public static final String TOTAL_SLICE = "TOTAL_SLICE";

    public static final String DOWNLOAD_ID = "DOWNLOAD_URL";

    public static String getDomeKey(String url) {
        return KEY_HEAD.concat(SEPARATOR).concat(url);
    }

    public static String getKey(String imageId) {
        return KEY_HEAD.concat(SEPARATOR).concat(imageId);
    }

}
