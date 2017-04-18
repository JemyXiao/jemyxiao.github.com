package tk.mybatis.springboot.util;

import java.util.HashMap;

/**
 * Created by jmx on 16/9/10.
 */
public class CacheManage {
    private static HashMap cacheMap = new HashMap();

    //单实例构造方法
    private CacheManage() {
        super();
    }

    //得到缓存。同步静态方法
    private synchronized static Cache getCache(String key) {
        return (Cache) cacheMap.get(key);
    }

    //判断是否存在一个缓存
    private synchronized static boolean hasCache(String key) {
        return cacheMap.containsKey(key);
    }

    //清除所有缓存
    public synchronized static void clearAll() {
        cacheMap.clear();
    }

    //载入缓存
    public synchronized static void putCache(String key, Cache obj) {
        cacheMap.put(key, obj);
    }

    //获取缓存信息
    public static Cache getCacheInfo(String key) {

        if (hasCache(key)) {
            Cache cache = getCache(key);
            if (cacheExpired(cache)) { //调用判断是否终止方法
                cache.setExpired(true);
            }
            return cache;
        } else
            return null;
    }

    //载入缓存信息
    public static void putCacheInfo(String key, Cache obj, long dt, boolean expired) {
        Cache cache = new Cache();
        cache.setKey(key);
        cache.setTimeOut(dt + System.currentTimeMillis()); //设置多久后更新缓存
        cache.setValue(obj);
        cache.setExpired(expired); //缓存默认载入时，终止状态为FALSE
        cacheMap.put(key, cache);
    }

    //重写载入缓存信息方法
    public static void putCacheInfo(String key, Cache obj, long dt) {
        Cache cache = new Cache();
        cache.setKey(key);
        cache.setTimeOut(dt + System.currentTimeMillis());
        cache.setValue(obj);
        cache.setExpired(false);
        cacheMap.put(key, cache);
    }

    //判断缓存是否终止
    public static boolean cacheExpired(Cache cache) {
        if (null == cache) { //传入的缓存不存在
            return false;
        }
        long nowDt = System.currentTimeMillis(); //系统当前的毫秒数
        long cacheDt = cache.getTimeOut(); //缓存内的过期毫秒数
        if (cacheDt <= 0 || cacheDt >= nowDt) { //过期时间小于等于零时,或者过期时间大于当前时间时，则为FALSE
            return false;
        } else { //大于过期时间 即过期
            return true;
        }
    }
    //获取缓存中的大小
    public static int getCacheSize() {
        return cacheMap.size();
    }
    public static void main(String[] args) {
        Cache cache = new Cache();
        CacheManage.putCache("abc",cache);
        CacheManage.getCacheInfo("abc");
    }
}
