package com.lcp.springboot.service;

import com.lcp.springboot.dao.MemberDao;
import com.lcp.springboot.model.MemberModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * <b><code>MemberServiceIml</code></b>
 * <p>
 * <p/>
 * <p>
 * Description
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 10:49.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */
@Service
public class MemberServiceIml implements MemberService {
    @Autowired
    private MemberDao memberDao;
    @Override
    public List<MemberModel> getAll() {
        List<MemberModel> memberModelList=memberDao.search();
        if(!CollectionUtils.isEmpty(memberModelList)){
           return memberModelList;
        }
        return null;
    }

    @Override
    public int addModel(MemberModel model) {
        int value=memberDao.addModel(model);
        return value;

    }

    @Override
    public int deleteModel(Integer id) {
        int value=memberDao.deleteModel(id);
        return value;
    }

    @Override
    public MemberModel getModel(Integer id) {
        MemberModel memberModel=memberDao.getModel(id);
        return memberModel;
    }
}
