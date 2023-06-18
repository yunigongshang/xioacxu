package com.example.xioacxu.mysql;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin()
public class usercontroller {
    final
    UserDao a;
    final
    JianDao b;

    public usercontroller(UserDao a, JianDao b) {
        this.a = a;
        this.b = b;
    }

    @GetMapping("/getAll")
    public List getAll(){
        List all=a.findAll();
        return all;
    }
    @GetMapping("/getAlljian")
    public List getAlljian(){
        List acc=b.findAll();
        return acc;
    }


    //添加死数据到数据库
    @GetMapping("/add")
    public User add(@RequestParam("name") String name,@RequestParam("scenic") String scenic,@RequestParam("time" )String time,@RequestParam("area" )String area){
        User user=new User();
        user.setName(name);
        user.setArea(area);
        user.setScenic(scenic);
        user.setTime(time);
        User save=a.save(user);
        return save;
    }


    @GetMapping("/deleteone")
    public String deleteone(@RequestParam("name")String name){
        a.deleteById(name);
        return "删除成功";
    }
}



