package com.plr.iso29110.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;




// 
@RemoteServiceRelativePath("userService")
public interface MyUserService extends RemoteService {
  List<MyUser> getUserList();
  MyUser getUser(String id);
}