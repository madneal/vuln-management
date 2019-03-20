/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.dao.VulnProjectDao;
import io.renren.entity.VulnProjectEntity;
import io.renren.service.VulnProjectService;
import org.springframework.stereotype.Service;

@Service("vulnProjectService")
public class VulnProjectServiceImpl extends ServiceImpl<VulnProjectDao, VulnProjectEntity> implements VulnProjectService {

    @Override
    public VulnProjectEntity getVulnProject(long projectId) {
        return baseMapper.selectOne(new QueryWrapper<VulnProjectEntity>().eq("project_id", projectId));
    }

}
