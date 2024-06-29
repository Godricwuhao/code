package com.unicom.utils;

import cn.hutool.core.util.StrUtil;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.*;

public class ScriptSupport {

    /**
     * 通过正则脚本清洗msg信息
     *
     * @param msg    弹窗信息
     * @param script 脚本
     * @return
     */
    public static String replaceMsg(String msg, String script) {
        Object object = null;
        Map<String, String> cacheScriptMap = new HashMap<>();
        if (StrUtil.isNotBlank(msg)) {
            try {
                List<String> args = Collections.singletonList(msg);
                String functionName = "function_replace";
                String function = createJsFunction(functionName, script, Collections.singletonList("args0"));
                ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("javascript");
                scriptEngine.eval(function);
                Invocable invocable = (Invocable) scriptEngine;
                object = invocable.invokeFunction(functionName, args.toArray(new Object[0]));
            } catch (Exception e) {
                return Objects.toString(object, "");
            }
        }
        return Objects.toString(object, "");
    }

    public static String createJsFunction(String functionName, String script, List<String> args) {
        StringBuilder function = new StringBuilder(" function ");
        function.append(functionName);
        function.append("(");
        function.append(StrUtil.join(",", new Object[]{args}));
        function.append("){ ");
        if (!script.contains("return")) {
            function.append(" ").append("return").append(" ");
        }
        function.append(script).append(";}");
        return function.toString();
    }
}
