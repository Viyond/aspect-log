package com.yomahub.aspectlog.enhance.logback;

import ch.qos.logback.classic.PatternLayout;

/**
 * @author Bryan.Zhang
 */
public class AspectLogbackLayout extends PatternLayout {
    static {
        defaultConverterMap.put("m", AspectLogbackConverter.class.getName());
        defaultConverterMap.put("msg", AspectLogbackConverter.class.getName());
        defaultConverterMap.put("message", AspectLogbackConverter.class.getName());
    }
}
