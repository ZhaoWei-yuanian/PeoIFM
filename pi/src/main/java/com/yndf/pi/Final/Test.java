package com.yndf.pi.Final;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Test {
        private static Map<Integer, Data> str=new HashMap<Integer, Data>();

    static {
        str.put(00001,new Data(00001,"张三","武汉技术开发部"));
        str.put(00002,new Data(00002,"李四","华南技术开发部"));
        str.put(00003,new Data(00003,"王五","华北共享事业部"));
        str.put(00004,new Data(00004,"赵六","华东预算事业部"));
}
    public static void main(String[] args) throws Exception {
        JSONObject createJSONObject = createJSONObject();
        System.out.println(createJSONObject);
//        String str = createJSONObject.toString();
//        JSONObject b = FinalEvent(00001);
//        System.out.println(b);

    }

    public static JSONObject FinalEvent(int usercode) {
        JSONObject createJSONObject = createJSONObject();
        String str = createJSONObject.toString();
        JSONObject obj = JSONObject.fromObject(str);
        str = obj.getString("result");
        obj = JSONObject.fromObject(str);
        JSONArray AD= (JSONArray)obj.get("data");
        JSONObject JD = AD.getJSONObject(usercode-1);
        return JD;
    }
    // 创建JSONObject对象
    public static JSONObject createJSONObject() {
        JSONObject data = new JSONObject();
        data.put("reason", "成功的返回");

        JSONObject user1 = new JSONObject();
        user1.put("usercode", "00001");
        user1.put("username", "张三");
        user1.put("department", "武汉技术开发部");

        JSONObject user2 = new JSONObject();
        user2.put("usercode", "00002");
        user2.put("username", "李四");
        user2.put("department", "华南技术开发部");

        JSONObject user3 = new JSONObject();
        user3.put("usercode", "00003");
        user3.put("username", "王五");
        user3.put("department", "华北共享事业部");

        JSONObject user4 = new JSONObject();
        user4.put("usercode", "00004");
        user4.put("username", "赵六");
        user4.put("department", "华东预算事业部");

        JSONArray jsonArray = new JSONArray();
        jsonArray.add(00000,user1);
        jsonArray.add(00001,user2);
        jsonArray.add(00002,user3);
        jsonArray.add(00003,user4);

        JSONObject event =  new JSONObject();
        event.put("stat", "1");
        event.put("data",jsonArray);

        data.put("result",event);
        return data;
    }

    public static Data FindUsercode(int usercode){
        return str.get(usercode);
}

}