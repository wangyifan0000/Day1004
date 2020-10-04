package com.kgc.tcmp077.wangyf.controller;

import com.kgc.tcmp077.wangyf.entity.Assets;
import com.kgc.tcmp077.wangyf.service.AssetsService;
import com.kgc.tcmp077.wangyf.service.impl.AssetsServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author wangyf
 * @create 2020-10-04 9:10
 */
@Controller
public class AssetsController {
    @Resource
    AssetsServiceImpl assetsServiceimpl;

    @RequestMapping("/selectByTypeAndId")
    public String toChoose(String assetId, String assetType, Model model) {
        List<Assets> assetsList = assetsServiceimpl.getAssetsList(assetId, assetType);
        model.addAttribute("Assets", assetsList);
        return "main";
    }

    @RequestMapping("/toaddAssets")
    public String toAdd() {
        return "toAddAssets";
    }

    @RequestMapping("/doAddAssets")
    public String doAddAssets(long d, String assetId, String assetName, String assetType, Date intoDate, Model model) {
        Assets assets = new Assets();
        assets.setAssetid(assetId);
        assets.setAssetname(assetName);
        assets.setAssettype(assetType);
        assets.setD(d);
        assets.setIntodate(intoDate);
        int i = assetsServiceimpl.addAssets(assets);
        return "redirect:selectByTypeAndId";
    }
}
