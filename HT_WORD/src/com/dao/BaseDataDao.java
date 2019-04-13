package com.dao;
import java.util.List;

import com.common.Assist;
import com.fh.entity.app.BaseData;

import org.apache.ibatis.annotations.Param;
/**
 * BaseData的Dao接口
 * 
 * @author 
 *
 */
public interface BaseDataDao {

	/**
	 * 获得BaseData数据的总行数,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	long getBaseDataRowCount(Assist assist);
	
	/**
	 * 获得BaseData数据集合,可以通过辅助工具Assist进行条件查询,如果没有条件则传入null
	 * 
	 * @param assist
	 * @return
	 */
	List<BaseData> selectBaseData(Assist assist);
	/**
	 * 通过BaseData的id获得BaseData对象
	 * 
	 * @param id
	 * @return
	 */
	BaseData selectBaseDataById(Integer id);
	
	/**
	 * 获得一个BaseData对象,以参数BaseData对象中不为空的属性作为条件进行查询,返回符合条件的第一条
	 * 
	 * @param obj
	 * @return
	 */
	BaseData selectBaseDataObjSingle(BaseData obj);
	
	/**
	 * 获得一个BaseData对象,以参数BaseData对象中不为空的属性作为条件进行查询
	 * 
	 * @param obj
	 * @return
	 */
	List<BaseData> selectBaseDataByObj(BaseData obj);

	/**
	 * 插入BaseData到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBaseData(BaseData value);
	
	/**
	 * 插入BaseData中属性值不为null的数据到数据库
	 * 
	 * @param value
	 * @return
	 */
	int insertNotNullBaseData(BaseData value);
	
	/**
	 * 批量插入BaseData到数据库,包括null值
	 * 
	 * @param value
	 * @return
	 */
	int insertBaseDataByBatch(List<BaseData> value);
	/**
	 * 通过BaseData的id删除BaseData
	 * 
	 * @param id
	 * @return
	 */
	int deleteBaseDataById(Integer id);
	
	/**
	 * 通过辅助工具Assist的条件删除BaseData
	 * 
	 * @param assist
	 * @return
	 */
	int deleteBaseDataByAssist(Assist assist);
	
	/**
	 * 通过BaseData的id更新BaseData中的数据,包括null值
	 * 
	 * @param enti
	 * @return
	 */
	int updateBaseDataById(BaseData enti);
	
	/**
	 * 通过BaseData的id更新BaseData中属性不为null的数据
	 * 
	 * @param enti
	 * @return
	 */
	int updateNotNullBaseDataById(BaseData enti);
	
	/**
	 * 通过辅助工具Assist的条件更新BaseData中的数据,包括null值
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateBaseData(@Param("enti") BaseData value, @Param("assist") Assist assist);
	
	/**
	 * 通过辅助工具Assist的条件更新BaseData中属性不为null的数据
	 * 
	 * @param value
	 * @param assist
	 * @return
	 */
	int updateNotNullBaseData(@Param("enti") BaseData value, @Param("assist") Assist assist);
}