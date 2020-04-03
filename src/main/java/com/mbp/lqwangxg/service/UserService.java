/*=========================================================
 * タイトル： ◎◎◎クラス
 * 説明    ： 自動作成
 * 著作権  ： Copyright(c) 2020
 * 会社名  ： 株式会社
 *
 * 変更履歴： 2020.03.05 新規登録  MBP-SMARTEC 王小広
 *
 *=========================================================*/
package com.mbp.lqwangxg.service;

import com.mbp.lqwangxg.mapper.UserMapper;
import com.mbp.lqwangxg.model.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User getUser(String uid, String password){
        log.debug("userid:{},password:{}",uid, password);
        if(uid.isEmpty()){
            return null;
        }
        if(password.isEmpty()){
            return null;
        }

        String hexPassword =  DigestUtils.sha256Hex(password);
        return userMapper.getUser(uid, hexPassword);
    }
}
