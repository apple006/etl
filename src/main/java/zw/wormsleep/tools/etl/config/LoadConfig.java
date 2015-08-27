package zw.wormsleep.tools.etl.config;

import java.util.Map;

public interface LoadConfig {
	Map<String, Boolean> getFields(); // 目标输出加载字段集合
	String getOutputType(); // 目标输出类型
	String getDatabase(); // 目标数据库节点名称
	String getDatabaseType(); // 目标数据库类型
	Map<String, String> getDatabaseConfiguration(); // 目标数据库配置集合 ( c3p0 )
	String getTable(); // 目标输出数据库表名
	String getSeparator();  // 目标输出文件文本域分隔符
	String getEncoding(); // 目标输出文件编码
	String getFileType(); // 目标输出文件类型
	String getTemplate(); // 目标输出文件模板 ( 目前仅针对 Excel 文件输出 )
	String getTemplateCollection(); // GExcel 数据集合名称 ( 例如: data1 )
	int getMaxRowsNumberPerFile(); // 目标输出文件分割最大行数 ( 即按最大行数进行数据分割生成多文件 )
	boolean withHeader(); // 目标输出是否带列头
	String getCatalog(); // catalog ( 表对表批量传输使用 )
	String getSchemaPattern(); // schema 模式 ( 表对表批量传输使用 )
	boolean getAutoCreateTable(); // 是否自动创建目标数据库表 ( 表对表批量传输使用 )
	boolean getTransmitData(); // 是否传输数据至目标数据库表 ( 表对表批量传输使用 )
	int getThreadCount(); // 线程数  ( 表对表批量传输使用 )
	int getBatchSize(); // 批量处理数  ( 数据库 )
}