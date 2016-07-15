package com.manage.mapper;
import java.util.List;
import java.util.Map;
import com.manage.model.Syslog;

/**
 * 系统日志表


; InnoDB free: 10240 kB-数据库接口
 */
public interface SyslogMapper {
	/**
	 * 新增系统日志表


; InnoDB free: 10240 kB
	 * @param syslog 系统日志表


; InnoDB free: 10240 kB对象
	 * @return 成功 1，失败 0
	 */
	int insertSyslog(Syslog syslog);
	
	/**
	 * 更新系统日志表


; InnoDB free: 10240 kB
	 * @param syslog 系统日志表


; InnoDB free: 10240 kB对象
	 * @return 成功 1，失败 0
	 */
	int updateSyslog(Syslog syslog);
	
	/**
	 * 删除系统日志表


; InnoDB free: 10240 kB
	 * @param syslogids 系统日志表


; InnoDB free: 10240 kBID数组
	 * @return 成功 1，失败 0
	 */
	int deleteSyslog(String syslogid);
	
	/**
	 * 按主键获得系统日志表


; InnoDB free: 10240 kB对象信息
	 * @param syslogid 系统日志表


; InnoDB free: 10240 kBID
	 * @return 系统日志表


; InnoDB free: 10240 kB对象
	 */
	Syslog loadSyslog(String syslogid);
	
	/**
	 * 查询系统日志表


; InnoDB free: 10240 kB数量统计
	 * @param param 查询条件
	 * @return 总数量
	 */
	Integer totalSyslog(Map<String, Object> param);
	
	/**
	 * 分页查询系统日志表


; InnoDB free: 10240 kB列表
	 * @param param 查询条件
	 * @return 系统日志表


; InnoDB free: 10240 kB对象列表
	 */
	List<Syslog> querySyslog(Map<String, Object> param);
}