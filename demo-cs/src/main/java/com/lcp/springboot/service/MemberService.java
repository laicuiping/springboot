package com.lcp.springboot.service;

import com.lcp.springboot.model.MemberModel;

import java.util.List;

/**
 * <b><code>MemberService</code></b>
 * <p>
 * <p/>
 * <p>
 * Description
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 10:48.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */
public interface MemberService {
    public List<MemberModel> getAll();

    int addModel(MemberModel model);

    int deleteModel(Integer id);

    MemberModel getModel(Integer id);
}
