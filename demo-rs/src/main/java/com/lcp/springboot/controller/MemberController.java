package com.lcp.springboot.controller;


import com.lcp.springboot.service.MemberService;
import io.swagger.annotations.*;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import com.lcp.springboot.model.MemberModel;

import java.util.List;

/**
 * <b><code>PersonController</code></b>
 * <p>
 * <p/>
 * <p>
 * 人员管理
 * <p>
 * <p/>
 * <p>
 * <b>Creation Time:</b> 2018/8/3/003 10:24.
 *
 * @author laicuiping
 * @since springboot 0.0.1
 */
@Api(tags = "员工管理")
@RestController
@RequestMapping("v1.0/member")
public class MemberController {
    private static final Logger log=Logger.getLogger(MemberController.class);
    @Autowired
    private MemberService memberService;
    @ApiOperation(value = "所有员工信息",produces =" MediaType.APPLICATION_JSON_UTF8_VALUE")
    @ApiResponses({
            @ApiResponse(code=200,message = "successfull"),
            @ApiResponse(code=500,message="internel server error"),
            @ApiResponse(code=204,message = "not found")
    })
    @GetMapping("/")
    public ResponseEntity<?> get(){
        try{
            List<MemberModel> memberList=memberService.getAll();
            if (!CollectionUtils.isEmpty(memberList)){
                return new ResponseEntity<Object>(memberList, HttpStatus.OK);
            }else{
                return new ResponseEntity<Object>(memberList, HttpStatus.NO_CONTENT);
            }

        }catch(Exception e){
            log.error("failed to delete prize", e);
            return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @ApiOperation(value = "增加单个员工信息")
    @PostMapping("/")
    public int add(@ApiParam(name = "memberModel" ,value = "员工信息",required = true) @RequestBody  MemberModel model){
       int code=memberService.addModel(model);
       return code;
    }
    @ApiOperation(value = "删除单个员工信息")

    @DeleteMapping("/")
    public int delete(@ApiParam(name="Id",value="员工id",required = true) @RequestParam Integer id) {
        int code=memberService.deleteModel(id);
        return code;
    }
    @ApiOperation(value = "单个员工信息")
    @ApiImplicitParams({
      @ApiImplicitParam(name="id",value = "员工id",required =true,dataType ="int",paramType ="path")
    })
    @GetMapping("/{id}")
    public MemberModel getModel(@PathVariable Integer id){
        MemberModel model=memberService.getModel(id);
        return model;
    }
}
