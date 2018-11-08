package cn.linhome.lib.cache;

import java.io.File;

import cn.linhome.lib.cache.converter.IEncryptConverter;
import cn.linhome.lib.cache.converter.IObjectConverter;


public interface IDiskInfo
{
    /**
     * 是否需要加解密
     *
     * @return
     */
    boolean isEncrypt();

    /**
     * 是否支持内存存取
     *
     * @return
     */
    boolean isMemorySupport();

    /**
     * 返回存取的目录
     *
     * @return
     */
    File getDirectory();

    /**
     * 返回加解密转换器
     *
     * @return
     */
    IEncryptConverter getEncryptConverter();

    /**
     * 返回对象转换器
     *
     * @return
     */
    IObjectConverter getObjectConverter();
}
