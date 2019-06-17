package com.springcloud.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.springcloud.entity.Goods;

/**
 * 商品模型层：用于定义对商品模块进行操作的方法
 * 
 * @author 张凌强
 *
 */
public interface GoodsService {

	/**
	 * 添加商品信息
	 * 
	 * @param goods 新商品信息
	 * @return 成功返回大于0的整数，否则返回0
	 */
	public abstract Integer insert(Goods goods);

	/**
	 * 查询满足条件的商品信息（分页功能）
	 * 
	 * @param goods      查询条件
	 * @param pageNumber 页数
	 * @return 成功返回com.github.pagehelper.PageInfo类型的实例，否则返回null
	 */
	public abstract PageInfo<Goods> select(Goods goods, Integer pageNumber);

	/**
	 * 根据条件修改商品信息
	 * 
	 * @param goods 修改商品信息
	 * @return 成功返回大于0的整数，否则返回小于0的整数
	 */
	public abstract Integer updateGoodsById(Goods goods);
	
	public abstract Integer update(Goods goods);
	
	/**
	 * 查询销量前10的商品信息
	 * @return 成功返回java.util.List类型的实例，否则返回null
	 */
	public abstract List<Goods> selectGroup();

}
