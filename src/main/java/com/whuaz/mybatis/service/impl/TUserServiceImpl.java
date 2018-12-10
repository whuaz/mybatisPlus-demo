package com.whuaz.mybatis.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.whuaz.mybatis.service.TUserService;
import com.whuaz.mybatis.entity.TUser;
import com.whuaz.mybatis.mapper.TUserMapper;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author grez
 * @since 2018-12-03
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
