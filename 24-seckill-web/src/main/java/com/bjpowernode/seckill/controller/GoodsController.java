package com.bjpowernode.seckill.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bjpowernode.seckill.model.Goods;
import com.bjpowernode.seckill.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class GoodsController {

    //引用远程dubbo服务
    @Reference
    private GoodsService goodsService;

    @GetMapping("/seckill/goods")
    public String goods(Model model){
        List<Goods> goodsList = goodsService.getALlSeckillGoods();
        model.addAttribute("goodsList",goodsList);

        return"goods";
    }
}
