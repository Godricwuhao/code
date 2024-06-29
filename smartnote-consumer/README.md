### 模块说明
联通公众APP内嵌H5页面商机台账埋点数据：埋点 Key 包含 _guest_ 或 projectID=SMARTNOTE 则推送西咸省分生产区Kafka
- 应用ID=4或1 为生产环境推送Topic：smart_note_bury_some_prod
- 应用ID=5或6 为测试环境推送Topic：smart_note_bury_some_test

### 环境说明
生产：10.191.208.107
部署路径：/data/tingyun/liantongExt

### 生产环境启动命令
nohup /data/tingyun/base/base-java/jdk1.8.0_60/bin/java -jar smartnote-consumer-1.0.0.jar > /dev/null 2>&1 &

