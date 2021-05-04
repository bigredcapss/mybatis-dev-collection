package com.we.result;

import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import java.util.HashMap;
import java.util.Map;

/**
 * 对返回的结果进行处理，最终得到自己想要的数据格式或类型
 * 可以自定义返回类型，在接口方法中传入，不需要定义
 * @author BigRedCaps
 * @date 2021/5/4 10:32
 */
public class MyResultHandler implements ResultHandler {
    @SuppressWarnings("rawtypes")
    private final Map mappedResults = new HashMap();

    @Override
    public void handleResult(ResultContext resultContext) {
        Map map = (Map) resultContext.getResultObject();
        mappedResults.put(map.get("key"), map.get("value"));
    }

    public Map getMappedResults() {
        return mappedResults;
    }
}
