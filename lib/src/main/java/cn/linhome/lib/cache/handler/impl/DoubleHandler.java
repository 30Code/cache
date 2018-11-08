package cn.linhome.lib.cache.handler.impl;

import cn.linhome.lib.cache.IDiskInfo;
import cn.linhome.lib.cache.handler.StringConverterHandler;

/**
 * Double处理类
 */
public class DoubleHandler extends StringConverterHandler<Double>
{
    public DoubleHandler(IDiskInfo diskInfo)
    {
        super(diskInfo);
    }

    @Override
    protected Double stringToValue(String string, Class<Double> clazz)
    {
        return Double.valueOf(string);
    }

    @Override
    protected String getKeyPrefix()
    {
        return "double_";
    }
}
