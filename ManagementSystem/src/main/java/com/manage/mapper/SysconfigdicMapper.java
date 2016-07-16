package com.manage.mapper;
import java.util.List;
import java.util.Map;
import com.manage.model.Sysconfigdic;

/**
 * 数据字典表（sysConfigDic）; InnoDB free: 10240 kB-数据库接口
 */
public interface SysconfigdicMapper {
	/**
	 * 新增数据字典表（sysConfigDic）; InnoDB free: 10240 kB
	 * @param sysconfigdic 数据字典表（sysConfigDic）; InnoDB free: 10240 kB对象
	 * @return 成功 1，失败 0
	 */
	int insertSysconfigdic(Sysconfigdic sysconfigdic);
	
	/**
	 * 更新数据字典表（sysConfigDic）; InnoDB free: 10240 kB
	 * @param sysconfigdic 数据字典表（sysConfigDic）; InnoDB free: 10240 kB对象
	 * @return 成功 1，失败 0
	 */
	int updateSysconfigdic(Sysconfigdic sysconfigdic);
	
	/**
	 * 删除数据字典表（sysConfigDic）; InnoDB free: 10240 kB
	 * @param syscfgdicids 数据字典表（sysConfigDic）; InnoDB free: 10240 kBID数组
	 * @return 成功 1，失败 0
	 */
	int deleteSysconfigdic(String syscfgdicid);
	
	/**
	 * 按主键获得数据字典表（sysConfigDic）; InnoDB free: 10240 kB对象信息
	 * @param syscfgdicid 数据字典表（sysConfigDic）; InnoDB free: 10240 kBID
	 * @return 数据字典表（sysConfigDic）; InnoDB free: 10240 kB对象
	 */
	Sysconfigdic loadSysconfigdic(String syscfgdicid);
	
	/**
	 * 查询数据字典表（sysConfigDic）; InnoDB free: 10240 kB数量统计
	 * @param param 查询条件
	 * @return 总数量
	 */
	Integer totalSysconfigdic(Map<String, Object> param);
	
	/**
	 * 分页查询数据字典表（sysConfigDic）; InnoDB free: 10240 kB列表
	 * @param param 查询条件
	 * @return 数据字典表（sysConfigDic）; InnoDB free: 10240 kB对象列表
	 */
	List<Sysconfigdic> querySysconfigdic(Map<String, Object> param);
}