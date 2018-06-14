package com.power.doc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Description:
 * 测试的Controller
 *
 * @author yu 2018/06/11.
 */
@Controller
@RequestMapping("student")
public class TestController {

    /**
     * 测试简单对象文档生成
     *
     * @param name 学生信息
     * @param user 用户
     * @return
     */


//   /**
//     * 测试List<Map<M,N<P,k>>>超复杂结构
//     * @return
//     */
//    @GetMapping(value = "/map/Primitive")
//    public Map<String,Teacher<List<User>,List<User>,List<User>>> testMap() {
//        return null;
//    }

//    /**
//     * 测试超复杂结构
//     * @return
//     */
//    @GetMapping(value = "/map/Primitive")
//    public Teacher<List<User>,List<User>,List<User>> testTeacher(){
//        return null;
//    }

//    /**
//     * list泛型对象文档生成
//     * @return
//     */
//    @GetMapping("/getAll")
//    public List<Student> getStudents(){
//        return null;
//    }
//////
//    /**
//     * 测试使用map string key泛型value的文档生成
//     * @return
//     */
//    @GetMapping("test/map")
//    public Map<String,User> getStudentMap(){
//        return null;
//    }
//
//    /**
//     * 测试object的作为map的key
//     * @return
//     */
//    @GetMapping("/test/map")
//    public Map<String,Object> objectMap(){
//        return null;
//    }
//
//    /**
//     * 返回object
//     * @return
//     */
//    @GetMapping("/test/Object")
//    public User getMe(){
//        return null;
//    }
//
//    /**
//     * 测试复杂的泛型对象文档生成
//     * @return
//     */
//    @GetMapping("test/map")
//    public Teacher getTecher(){
//        return null;
//    }
//
//    /**
//     * 测试泛型
//     *
//     * @return
//     */
//    @GetMapping("test/map")
//    public List<Object> getUser() {
//        return null;
//    }
//
//
//    /**
//     * 测试CommonResult外部包中的泛型
//     *
//     * @return
//     */
//    @PostMapping(value = "testCommonResult")
//    public CommonResult getCommonResult() {
//        CommonResult result = new CommonResult();
//        result.setData("string");
//        return null;
//    }


    /**
     * 测试list string
     * @return
     */
     @GetMapping(value = "listString")
      public Teacher<List<User>,List<User>,List<User>> testListString(){
        return null;
      }


}