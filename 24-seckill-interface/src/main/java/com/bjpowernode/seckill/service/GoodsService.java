package com.bjpowernode.seckill.service;

import com.bjpowernode.seckill.model.Goods;

import java.util.List;

public interface GoodsService {

    /**
     * 查询所有的秒杀商品
     * @return
     */
    public List<Goods> getALlSeckillGoods();

    /**
     * 根据Id查询某个具体的商品
     * @param id
     * @return
     */
    public Goods getSeckillGoodsById(Integer id);
}
