/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package io.renren.vulns.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.vulns.dao.VulnProjectDao;
import io.renren.vulns.entity.VulnProjectEntity;
import io.renren.vulns.service.VulnProjectService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("vulnProjectService")
public class VulnProjectServiceImpl extends ServiceImpl<VulnProjectDao, VulnProjectEntity> implements VulnProjectService {

    @Override
    public VulnProjectEntity getVulnProject(Long projectId) {
        return baseMapper.queryVulnProject(projectId);
    }

    @Override
    public int insertVulnProject(String projectFilePath,String name) {
        VulnProjectEntity vulnProjectEntity = new VulnProjectEntity();
        vulnProjectEntity.setCreateTime(new Date());
        vulnProjectEntity.setName(name);
        return baseMapper.insertVulnProject(vulnProjectEntity);
    }

}
