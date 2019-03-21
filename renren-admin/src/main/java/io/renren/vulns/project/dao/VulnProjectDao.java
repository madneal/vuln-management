package io.renren.vulns.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.renren.vulns.entity.VulnProjectEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface VulnProjectDao extends BaseMapper<VulnProjectEntity> {
    int insertVulnProject(VulnProjectEntity vulnProjectEntity);

    VulnProjectEntity queryVulnProject(Long projectId);
}
