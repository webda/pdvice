package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.UserRegList;

import org.apache.ibatis.annotations.Param;
/**
 * UserRegList的Dao接口
 * 
 * @author 
 *
 */
public interface UserRegListDao {

	/**
	 * 获得UserRegList数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getUserRegListRowCount(Assist assist);
	
	/**
	 * 获得UserRegList数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<UserRegList> selectUserRegList(Assist assist);
	/**
	 * 通过UserRegList的id获得UserRegList对象
	 * 
	 * @param id
	 * @return
	 */
	UserRegList selectUserRegListById(Integer id);
	
	/**
	 * 获得一个UserRegList对象,以参数UserRegList对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	UserRegList selectUserRegListObjSingle(UserRegList obj);
	
	/**
	 * 获得一个UserRegList对象,以参数UserRegList对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<UserRegList> selectUserRegListByObj(UserRegList obj);

	/**
	 * 插入UserRegList到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserRegList(UserRegList value);
	
	/**
	 * 插入UserRegList中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullUserRegList(UserRegList value);
	
	/**
	 * 批量插入UserRegList到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertUserRegListByBatch(List<UserRegList> value);
	/**
	 * 通过UserRegList的id删除UserRegList
	 * 
	 * @param id
	 * @return
	 */
	int deleteUserRegListById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除UserRegList
	 * 
	 * @param assist
	 * @return
	 */
	int deleteUserRegListByAssist(Assist assist);
	
	/**
	 * 通过UserRegList的id更新UserRegList中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateUserRegListById(UserRegList enti);
	
	/**
	 * 通过UserRegList的id更新UserRegList中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullUserRegListById(UserRegList enti);
	
	/**
	 * 通过辅助工具Assist的条件更新UserRegList中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateUserRegList(@Param("enti") UserRegList value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新UserRegList中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullUserRegList(@Param("enti") UserRegList value, @Param("assist") Assist assist);
}