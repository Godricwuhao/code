### 项目介绍
广州Web埋点数据消费处理程序。获取brs-bpi-message中的信息后转发或其它操作。

### 需求说明
#### 联通APP基础服务弹窗数据推送西咸省分生产区Kafka
- 提出人：吴文龙
- 功能描述：联通APP基础服务弹窗埋点数据推送西咸省分生产区Kafka，供三方消费

#### cBSS关于感知平台功能优化的需求
- 提出人：黄海婵、林树叶
- 功能描述：对cBSS菜单搜索过的具体内容（菜单、工号归属部门、工号、查询内容）进行埋点上报，感知平台将采集数据推送广州外部系统Kafka，供省分消费

### 环境说明
- 测试环境
    * 服务器：
    * 路径：

- 生产环境
    * 服务器：10.189.52.115
    * 路径：/data/tingyun/liantongExt

### 测试环境启动命令


### 生产环境启动命令
nohup /data/tingyun/wukong/tingyun/base/base-java/jdk1.8.0_60/bin/java -jar bpi-message-gz-1.0.0.jar >/dev/null 2>&1 &
