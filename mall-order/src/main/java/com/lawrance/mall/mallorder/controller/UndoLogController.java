package com.lawrance.mall.mallorder.controller;

import java.util.Arrays;
import java.util.Map;


import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lawrance.mall.mallorder.entity.UndoLogEntity;
import com.lawrance.mall.mallorder.service.UndoLogService;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.common.utils.R;



/**
 * 
 *
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:12:50
 */
@RestController
@RequestMapping("mallorder/undolog")
public class UndoLogController {
    @Resource
    private UndoLogService undoLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("mallorder:undolog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = undoLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("mallorder:undolog:info")
    public R info(@PathVariable("id") Long id){
		UndoLogEntity undoLog = undoLogService.getById(id);

        return R.ok().put("undoLog", undoLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("mallorder:undolog:save")
    public R save(@RequestBody UndoLogEntity undoLog){
		undoLogService.save(undoLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("mallorder:undolog:update")
    public R update(@RequestBody UndoLogEntity undoLog){
		undoLogService.updateById(undoLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("mallorder:undolog:delete")
    public R delete(@RequestBody Long[] ids){
		undoLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
