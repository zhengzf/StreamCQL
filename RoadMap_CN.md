# StreamCQL RoadMap

------

# 1.1
##特性列表
> * 分组窗支持，支持在窗口中，按照指定字段进行分组。功能包含分组长度滑动窗，分组长度跳动窗，分组时间滑动窗，分组时间跳动窗。
> * 支持Active, Deactive、rebalance功能，功能作用同Storm，rebanance只支持worker数量设置。
> * 支持in、like、case、between表达式
> * 添加RDBDatasource数据源，支持在算子中，通过JDBC从关系型数据库中读取数据。
> * [#13][1] 添加对jstorm的适配支持(待定)
##改进列表
> * [#15][2] 解决CQL中不能执行local模式的问题
##问题解决
> * [#19][3] Please add setting JAVA_HOME before launching cql to documentation


[1]: https://github.com/HuaweiBigData/StreamCQL/issues/13
[2]: https://github.com/HuaweiBigData/StreamCQL/issues/15
[3]: https://github.com/HuaweiBigData/StreamCQL/issues/19