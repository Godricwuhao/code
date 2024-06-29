### 项目介绍
联通APP客户端手动埋点数据推送流转平台，埋点参数包 data_identification == LZPT 则推送
- tag == test 时，推送到测试环境（西咸测试区Kafka），topic：unicomapp-customAction-test
- tag == dis 时，推送到生产环境（西咸省分生产区）topic：unicomapp-customAction

### 廊坊环境说明
- 生产：10.191.208.107
- 部署路径：/data/tingyun/liantongExt
- 启动命令：nohup /data/tingyun/base/base-java/jdk1.8.0_60/bin/java -jar liantongapp-consumer-2.5.0.jar > /dev/null 2>&1 &

### 西咸环境说明
- 生产：10.172.131.10
- 部署路径：/data/tingyun/liantongExt
- 启动命令：nohup /data/tingyun/base/base-java/jdk1.8.0_60/bin/java -jar liantongapp-consumer-2.5.0.jar > /dev/null 2>&1 &
