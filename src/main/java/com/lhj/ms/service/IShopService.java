package com.lhj.ms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lhj.ms.dto.Result;
import com.lhj.ms.entity.Shop;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IShopService extends IService<Shop> {

    Result queryById(Long id);

    Result update(Shop shop);

    Result queryShopByType(Integer typeId, Integer current, Double x, Double y);
}
