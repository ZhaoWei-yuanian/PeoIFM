package com.yndf.pi.Final;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：mmzs
 * @date ：Created in 2019/8/26 21:07
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@CrossOrigin
public class TestController {

    @PostMapping("/test/{usercode}")
    public JSONObject ShowJson(@PathVariable("usercode") int usercode){
        Test test = new Test();
        JSONObject data =  test.FinalEvent(usercode);
        return data;
    }
    @PostMapping("/Server")
    public Data ShowServer(@RequestBody JSONObject jsonobject){
            Test test = new Test();
        return test.FindUsercode((Integer.parseInt(jsonobject.getString("usercode"))));
    }

//    @PostMapping("/test")
//   public JSONObject ShowJson(@RequestBody int usercode){
//        Test test = new Test();
//        JSONObject data =  test.FinalEvent(usercode);
//        return data;
//    }
    }


