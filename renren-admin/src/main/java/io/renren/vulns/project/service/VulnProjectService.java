package io.renren.vulns.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.vulns.entity.VulnProjectEntity;

public interface VulnProjectService extends IService<VulnProjectEntity> {
    VulnProjectEntity getVulnProject(Long reportID);

    int insertVulnProject(String projectFilePath,String name);
}
