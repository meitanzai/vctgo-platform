package com.vctgo.system.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.vctgo.common.mybatisplus.mapper.BaseMapperX;
import com.vctgo.system.domain.SysConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 参数配置 数据层
 *
 * @author vctgo
 */
public interface SysConfigMapper extends BaseMapperX<SysConfig>
{
    /**
     * 查询参数配置列表
     *
     * @param config 参数配置信息
     * @return 参数配置集合
     */
    IPage<SysConfig> selectConfigList(Page page,@Param("query") SysConfig config);


    /**
     * 查询参数配置列表
     *
     * @param config 参数配置信息
     * @return 参数配置集合
     */
    List<SysConfig> selectConfigList(@Param("query") SysConfig config);
    /**
     * 查询参数配置信息
     *
     * @param config 参数配置信息
     * @return 参数配置信息
     */
     SysConfig selectConfig(SysConfig config);

    /**
     * 根据键名查询参数配置信息
     *
     * @param configKey 参数键名
     * @return 参数配置信息
     */
     SysConfig checkConfigKeyUnique(String configKey);


    /**
     * 批量删除参数信息
     *
     * @param configIds 需要删除的参数ID
     * @return 结果
     */
     int deleteConfigByIds(Long[] configIds);



}
