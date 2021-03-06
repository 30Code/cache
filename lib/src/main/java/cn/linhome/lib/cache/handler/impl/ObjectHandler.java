package cn.linhome.lib.cache.handler.impl;

import cn.linhome.lib.cache.IDiskInfo;
import cn.linhome.lib.cache.handler.StringConverterHandler;

/**
 * Object处理类
 */
public class ObjectHandler<T> extends StringConverterHandler<T>
{
    public ObjectHandler(IDiskInfo diskInfo)
    {
        super(diskInfo);
    }

    @Override
    protected String valueToString(T value)
    {
        checkObjectConverter();
        return getDiskInfo().getObjectConverter().objectToString(value);
    }

    @Override
    protected T stringToValue(String string, Class<T> clazz)
    {
        checkObjectConverter();
        return getDiskInfo().getObjectConverter().stringToObject(string, clazz);
    }

    @Override
    protected String getKeyPrefix()
    {
        return "object_";
    }

    private void checkObjectConverter()
    {
        if (getDiskInfo().getObjectConverter() == null)
        {
            throw new NullPointerException("you must provide an IObjectConverter instance before this");
        }
    }
}
