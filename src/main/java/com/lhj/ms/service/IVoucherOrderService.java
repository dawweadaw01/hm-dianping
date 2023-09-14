package com.lhj.ms.service;

import com.lhj.ms.dto.Result;
import com.lhj.ms.entity.VoucherOrder;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 虎哥
 * @since 2021-12-22
 */
public interface IVoucherOrderService extends IService<VoucherOrder> {

    Result seckillVoucher(Long voucherId);

    void createVoucherOrder(VoucherOrder voucherOrder);

//    @Transactional
//    Result createVoucherOrder(Long voucherId);
}
