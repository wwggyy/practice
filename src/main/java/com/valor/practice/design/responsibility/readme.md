1. 责任链模式:servlet中的filter 结构也比较清晰,定义一个Chain，里面包含了Filter列表和servlet，达到在调用真正servlet之前进行各种filter逻辑。
2. 责任链模式:dubbo中的filter 通过把Filter封装成 Invoker的匿名类，通过链表这样的数据结构来完成责任链
3. 责任链模式:mybatis中的plugin Mybatis的责任链则是通过动态代理的方式，使用Plugin代理实际的Executor类。（这里实际还使用了组合模式，因为Plugin可以嵌套代理)
4. 责任链模式： spring