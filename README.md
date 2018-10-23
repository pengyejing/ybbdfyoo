# ybbdfyoo

笛风假期开放平台

https://open.dfyoo.com/

在线测试网站（测试用例可以参考这里）

https://open.dfyoo.com/tool/restful

# TicketApi

提供了和门票相关的全部接口，自动添加ApiKey，timestamp和生成签名，只要传递data的内容即可

接口已测试，除了退票申请接口/ticket/refund因为缺少测试数据失败了，其他均测试通过

如果请求需要传递的参数比较少，可以使用GET或POST来请求