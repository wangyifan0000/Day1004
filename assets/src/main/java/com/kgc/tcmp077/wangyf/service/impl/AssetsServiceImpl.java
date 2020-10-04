package com.kgc.tcmp077.wangyf.service.impl;

import com.kgc.tcmp077.wangyf.entity.Assets;
import com.kgc.tcmp077.wangyf.entity.AssetsExample;
import com.kgc.tcmp077.wangyf.mapper.AssetsMapper;
import com.kgc.tcmp077.wangyf.service.AssetsService;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-10-04 9:07
 */
@Service("assetsservice")
public class AssetsServiceImpl implements AssetsService {
    @Resource
    AssetsMapper assetsMapper;
    @Override
    public List<Assets> getAssetsList(String assetId, String assetType) {
        AssetsExample assetsExample = new AssetsExample();
        AssetsExample.Criteria criteria = assetsExample.createCriteria();
        if(assetId!=null){
            criteria.andAssetidEqualTo(assetId);
        }
        if(assetType!=null){
            criteria.andAssettypeEqualTo(assetType);
        }
        List<Assets> assets = assetsMapper.selectByExample(assetsExample);
        return assets;
    }

    @Override
    public int addAssets(Assets assets) {
        int i = assetsMapper.insertSelective(assets);
        return i;
    }
}
