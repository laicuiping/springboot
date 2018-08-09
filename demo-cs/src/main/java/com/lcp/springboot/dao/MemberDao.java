package com.lcp.springboot.dao;

import com.lcp.springboot.model.MemberModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <b><code>MemberDao</code></b>
 * <p>
 * <p/>
 * <p>
 * Description
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 11:10.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */


public interface MemberDao {
    List<MemberModel> search();

    int addModel(MemberModel model);

    int deleteModel(Integer  id);

    MemberModel getModel(Integer  id);


}
