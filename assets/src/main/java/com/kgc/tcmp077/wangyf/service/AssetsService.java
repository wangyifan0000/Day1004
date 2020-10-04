package com.kgc.tcmp077.wangyf.service;

import com.kgc.tcmp077.wangyf.entity.Assets;

import java.util.List;

/**
 * @author wangyf
 * @create 2020-10-04 9:04
 */
public interface AssetsService {
    List<Assets> getAssetsList(String assetId,String assetType);
    int addAssets(Assets assets);
}
