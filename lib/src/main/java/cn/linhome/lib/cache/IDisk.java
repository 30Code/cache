package cn.linhome.lib.cache;

import cn.linhome.lib.cache.api.ICommonCache;
import cn.linhome.lib.cache.api.IObjectCache;
import cn.linhome.lib.cache.api.ISerializableCache;
import cn.linhome.lib.cache.converter.IEncryptConverter;
import cn.linhome.lib.cache.converter.IObjectConverter;

public interface IDisk
{
    /**
     * 设置是否加解密
     *
     * @param encrypt
     * @return
     */
    IDisk setEncrypt(boolean encrypt);

    /**
     * 设置是否支持内存存储
     *
     * @param memorySupport
     * @return
     */
    IDisk setMemorySupport(boolean memorySupport);

    /**
     * 设置加解密转换器
     *
     * @param encryptConverter
     * @return
     */
    IDisk setEncryptConverter(IEncryptConverter encryptConverter);

    /**
     * 设置对象转换器
     *
     * @param objectConverter
     * @return
     */
    IDisk setObjectConverter(IObjectConverter objectConverter);

    /**
     * 返回当前目录的大小
     *
     * @return
     */
    long size();

    /**
     * 删除该目录以及目录下的所有缓存
     */
    void delete();

    //---------- cache start ----------

    ICommonCache<Integer> cacheInteger();

    ICommonCache<Long> cacheLong();

    ICommonCache<Float> cacheFloat();

    ICommonCache<Double> cacheDouble();

    ICommonCache<Boolean> cacheBoolean();

    ICommonCache<String> cacheString();

    ISerializableCache cacheSerializable();

    IObjectCache cacheObject();

    //---------- cache end ----------
}
