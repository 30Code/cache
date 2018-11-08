package cn.linhome.lib.cache.handler.impl;


import cn.linhome.lib.cache.IDiskInfo;
import cn.linhome.lib.cache.handler.StringConverterHandler;

/**
 * Integer处理类
 */
public class IntegerHandler extends StringConverterHandler<Integer>
{
    public IntegerHandler(IDiskInfo diskInfo)
    {
        super(diskInfo);
    }

    @Override
    protected Integer stringToValue(String string, Class<Integer> clazz)
    {
        return Integer.valueOf(string);
    }

    @Override
    protected String getKeyPrefix()
    {
        return "integer_";
    }
}
