package com.lawrance.mall.mallproduct;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.lawrance.mall.mallproduct.entity.BrandEntity;
import com.lawrance.mall.mallproduct.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class MallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    void contextLoads() {
//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("Iphone x 1TB Blue 5G");
//        brandEntity.setName("Apple");
//        brandService.save(brandEntity);

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setBrandId(30L);
//        brandEntity.setName("XiaoMi");
//        brandEntity.setDescript("XiaoMi 12x 256G grey");
//        brandService.updateById(brandEntity);
        brandService.remove(new LambdaQueryWrapper<BrandEntity>().gt(BrandEntity::getBrandId, 12L));
    }

}
