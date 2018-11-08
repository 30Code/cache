package cn.linhome.lib.cache.handler.impl;


import cn.linhome.lib.cache.IDiskInfo;
import cn.linhome.lib.cache.handler.StringConverterHandler;

/**
 * Long处理类
 */
public class LongHandler extends StringConverterHandler<Long>
{
    public LongHandler(IDiskInfo diskInfo)
    {
        super(diskInfo);
    }

    @Override
    protected Long stringToValue(String string, Class<Long> clazz)
    {
        return Long.valueOf(string);
    }

    @Override
    protected String getKeyPrefix()
    {
        return "long_";
    }
}
